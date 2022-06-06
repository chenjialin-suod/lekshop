package com.chengyu.core.util.third.logic;

import cn.hutool.core.net.URLEncoder;
import cn.hutool.crypto.SecureUtil;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.chengyu.core.domain.CommonConstant;
import com.chengyu.core.domain.enums.InterfaceEnums;
import com.chengyu.core.domain.result.GoodsThirdResult;
import com.chengyu.core.domain.result.InterfaceConfig;
import com.chengyu.core.exception.ServiceException;
import com.chengyu.core.service.system.InterfaceConfigService;
import com.chengyu.core.util.third.manager.GoodsUtil;
import com.chengyu.core.util.third.manager.ThirdUtilFactory;
import com.chengyu.core.utils.StringUtils;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @title  淘发客工具类
 * @author LeGreen
 * @date   2021/1/29
 */
@Log4j2
@Service("taofakeLogic")
public class TaofakeLogic extends ThirdUtilFactory {

    @Autowired
    private InterfaceConfigService interfaceConfigService;

    private InterfaceConfig getConfig(){
        return interfaceConfigService.getParams(InterfaceEnums.TAOFAKE.getKey());
    }

    @Override
    public GoodsThirdResult getGoodsDetail(String url) throws ServiceException {
        if(StringUtils.isBlank(url)){
            throw new ServiceException("请输入正确的商品详情链接");
        }
        String type = GoodsUtil.getGoodsTypeByUrl(url);
        String message = HttpUtil.get(this.getGoodsGetUrl(url, type));
        return this.parseGoodsDetail(message, type);
    }

    private GoodsThirdResult parseGoodsDetail(String message, String type) throws ServiceException {
        JSONObject jsonObject = JSONUtil.parseObj(message);
        int code = jsonObject.getInt("code");
        if(code == 0){
            String data = jsonObject.getStr("data");
            GoodsThirdResult goods = new GoodsThirdResult();
            switch (type) {
                case CommonConstant.TAOBAO:
                    JSONObject json = JSONUtil.parseObj(data);
                    JSONObject taobaoJson = JSONUtil.parseObj(json.getStr("item"));
                    goods.setTitle(taobaoJson.getStr("title"));
                    JSONArray jsonArray = taobaoJson.getJSONArray("item_imgs");
                    List<ItemImgsUrl> imgs = jsonArray.toList(ItemImgsUrl.class);
                    goods.setMainImg(imgs.get(0).getUrl());
                    goods.setGoodsImg(imgs.stream().map(ItemImgsUrl::getUrl).collect(Collectors.joining("|")));
                    goods.setDetail(taobaoJson.getStr("desc"));

                    JSONArray attrKeyArray = taobaoJson.getJSONArray("props_list");
                    List<Map> attrKeys = attrKeyArray.toList(Map.class);
                case CommonConstant.JINGDONG:
                    JSONObject jingdongJson = JSONUtil.parseObj(data);
                    Map<String,Object> map = new HashMap<>();
                    goods.setTitle(jingdongJson.getStr("skuName"));
                    goods.setMainImg(jingdongJson.getStr("image"));
                case CommonConstant.PINDUODUO:
                    JSONObject pddJson = JSONUtil.parseObj(data);
                    goods.setTitle(pddJson.getStr("goods_name"));
                    goods.setMainImg(pddJson.getStr("thumb_url"));
                default:
            }
            return goods;
        }else{
            log.info(message);
            throw new ServiceException("商品识别失败, 请手动填写");
        }
    }

    @Getter
    @Setter
    private class ItemImgsUrl{
        String url;
    }

    private String getGoodsGetUrl(String goodsUrl, String type) throws ServiceException {
        InterfaceConfig config = getConfig();
        String timestamp = String.valueOf(System.currentTimeMillis()/1000);
        String url = null;
        String goodsId;
        String sign;
        switch (type) {
            case CommonConstant.TAOBAO:
                goodsId = GoodsUtil.getTbGoodsIdByUrl(goodsUrl);
                sign = SecureUtil.sha1(goodsId+config.getAppId()+config.getSecret()+timestamp);
                url = config.getApiUrl()+"/api/taobao/ItemGetV2plus?itemid="+goodsId+"&sign="+sign+"&app_id="+config.getAppId()+"&timestamp="+timestamp;
                break;
            case CommonConstant.JINGDONG:
                goodsId = GoodsUtil.getJdGoodsId(goodsUrl);
                sign = SecureUtil.sha1(goodsId+config.getAppId()+config.getSecret()+timestamp);
                url = config.getApiUrl()+"/api/Jd/ProductSkuViewGet?product_id="+goodsId+"&sign="+sign+"&app_id="+config.getAppId()+"&timestamp="+timestamp;
                break;
            case CommonConstant.PINDUODUO:
                goodsId = GoodsUtil.getPddGoodsId(goodsUrl);
                sign = SecureUtil.sha1(goodsId+config.getAppId()+config.getSecret()+timestamp);
                url = config.getApiUrl()+"/api/pdd/GoodsDetail?goods_id="+goodsId+"&sign="+sign+"&app_id="+config.getAppId()+"&timestamp="+timestamp;
                break;
            default:
        }
        log.info("淘发客请求参数>>"+url);
        return url;
    }



    public Integer getLeftNum() throws ServiceException {
        InterfaceConfig config = getConfig();
        try {
            String sign = SecureUtil.sha1(config.getAppId()+config.getSecret());
            Map<String,Object> params = new HashMap<>();
            params.put("app_id", config.getAppId());
            params.put("sign", sign);
            String message = HttpUtil.post(config.getApiUrl()+"/api/account/api_count", params);
            System.out.println(">>"+message);
            JSONObject jsonObject = JSONUtil.parseObj(message);
            int code = jsonObject.getInt("code");
            if(code == 0){
                return jsonObject.getInt("data");
            }else{
                throw new ServiceException(jsonObject.getStr("msg"));
            }
        }catch (Exception e){
            throw new ServiceException("查询剩余余额失败");
        }
    }

    public static void main(String[] args) {
        String timestamp = String.valueOf(System.currentTimeMillis()/1000);
        String tkl = "07信都年看生他过好里我多和信 https://m.tb.cn/h.f6K3hfs?sm=8facfe  官网旗舰店运动套装男2021新款秋冬季休闲青少年卫衣一套加绒加厚";//content.replaceAll(" ", "");//getTaokoulingShort(content);
        System.out.println("tkl>>"+tkl);
        String sign = SecureUtil.sha1(tkl+"60f5734163546"+"d76c189d2f70a966aec9164cf7eae90c00d5ecd8"+timestamp);
        tkl = new URLEncoder().encode("07信都年看生他过好里我多和信 https://m.tb.cn/h.f6K3hfs?sm=8facfe  官网旗舰店运动套装男2021新款秋冬季休闲青少年卫衣一套加绒加厚", StandardCharsets.UTF_8);
        String url = "https://api.taofake.com/api/alimama/gettkldetailPlus?tkl="+tkl+"&sign="+sign+"&app_id="+"60f5734163546"+"&timestamp="+timestamp;
        String message = HttpUtil.get(url);
        System.out.println(url+">>"+message);
        JSONObject jsonObject = JSONUtil.parseObj(message);
        int code = jsonObject.getInt("code");

    }

    @Override
    public String approveRealname(String idCard, String name) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String approveBank(String accountNo, String accountName, String idCard) throws ServiceException {
        throw new UnsupportedOperationException();
    }

    @Override
    public String upload(MultipartFile file, String fileName, int type) throws ServiceException {
        throw new UnsupportedOperationException();
    }

}
