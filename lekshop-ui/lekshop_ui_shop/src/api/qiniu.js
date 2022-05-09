import request from '@/utils/request'

export function getConfig() {
  return request({
    url: '/system/qiniu/get',
    method: 'get'
  })
}

export function updateConfig(data) {
  return request({
    url: '/system/qiniu/editSubmit',
    method: 'post',
		data
  })
}
