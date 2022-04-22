package com.chengyu.core.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ConfigOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ConfigOrderExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAutoCancelMinutesIsNull() {
            addCriterion("auto_cancel_minutes is null");
            return (Criteria) this;
        }

        public Criteria andAutoCancelMinutesIsNotNull() {
            addCriterion("auto_cancel_minutes is not null");
            return (Criteria) this;
        }

        public Criteria andAutoCancelMinutesEqualTo(Integer value) {
            addCriterion("auto_cancel_minutes =", value, "autoCancelMinutes");
            return (Criteria) this;
        }

        public Criteria andAutoCancelMinutesNotEqualTo(Integer value) {
            addCriterion("auto_cancel_minutes <>", value, "autoCancelMinutes");
            return (Criteria) this;
        }

        public Criteria andAutoCancelMinutesGreaterThan(Integer value) {
            addCriterion("auto_cancel_minutes >", value, "autoCancelMinutes");
            return (Criteria) this;
        }

        public Criteria andAutoCancelMinutesGreaterThanOrEqualTo(Integer value) {
            addCriterion("auto_cancel_minutes >=", value, "autoCancelMinutes");
            return (Criteria) this;
        }

        public Criteria andAutoCancelMinutesLessThan(Integer value) {
            addCriterion("auto_cancel_minutes <", value, "autoCancelMinutes");
            return (Criteria) this;
        }

        public Criteria andAutoCancelMinutesLessThanOrEqualTo(Integer value) {
            addCriterion("auto_cancel_minutes <=", value, "autoCancelMinutes");
            return (Criteria) this;
        }

        public Criteria andAutoCancelMinutesIn(List<Integer> values) {
            addCriterion("auto_cancel_minutes in", values, "autoCancelMinutes");
            return (Criteria) this;
        }

        public Criteria andAutoCancelMinutesNotIn(List<Integer> values) {
            addCriterion("auto_cancel_minutes not in", values, "autoCancelMinutes");
            return (Criteria) this;
        }

        public Criteria andAutoCancelMinutesBetween(Integer value1, Integer value2) {
            addCriterion("auto_cancel_minutes between", value1, value2, "autoCancelMinutes");
            return (Criteria) this;
        }

        public Criteria andAutoCancelMinutesNotBetween(Integer value1, Integer value2) {
            addCriterion("auto_cancel_minutes not between", value1, value2, "autoCancelMinutes");
            return (Criteria) this;
        }

        public Criteria andAutoReceiveDayIsNull() {
            addCriterion("auto_receive_day is null");
            return (Criteria) this;
        }

        public Criteria andAutoReceiveDayIsNotNull() {
            addCriterion("auto_receive_day is not null");
            return (Criteria) this;
        }

        public Criteria andAutoReceiveDayEqualTo(Integer value) {
            addCriterion("auto_receive_day =", value, "autoReceiveDay");
            return (Criteria) this;
        }

        public Criteria andAutoReceiveDayNotEqualTo(Integer value) {
            addCriterion("auto_receive_day <>", value, "autoReceiveDay");
            return (Criteria) this;
        }

        public Criteria andAutoReceiveDayGreaterThan(Integer value) {
            addCriterion("auto_receive_day >", value, "autoReceiveDay");
            return (Criteria) this;
        }

        public Criteria andAutoReceiveDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("auto_receive_day >=", value, "autoReceiveDay");
            return (Criteria) this;
        }

        public Criteria andAutoReceiveDayLessThan(Integer value) {
            addCriterion("auto_receive_day <", value, "autoReceiveDay");
            return (Criteria) this;
        }

        public Criteria andAutoReceiveDayLessThanOrEqualTo(Integer value) {
            addCriterion("auto_receive_day <=", value, "autoReceiveDay");
            return (Criteria) this;
        }

        public Criteria andAutoReceiveDayIn(List<Integer> values) {
            addCriterion("auto_receive_day in", values, "autoReceiveDay");
            return (Criteria) this;
        }

        public Criteria andAutoReceiveDayNotIn(List<Integer> values) {
            addCriterion("auto_receive_day not in", values, "autoReceiveDay");
            return (Criteria) this;
        }

        public Criteria andAutoReceiveDayBetween(Integer value1, Integer value2) {
            addCriterion("auto_receive_day between", value1, value2, "autoReceiveDay");
            return (Criteria) this;
        }

        public Criteria andAutoReceiveDayNotBetween(Integer value1, Integer value2) {
            addCriterion("auto_receive_day not between", value1, value2, "autoReceiveDay");
            return (Criteria) this;
        }

        public Criteria andAutoCommentDayIsNull() {
            addCriterion("auto_comment_day is null");
            return (Criteria) this;
        }

        public Criteria andAutoCommentDayIsNotNull() {
            addCriterion("auto_comment_day is not null");
            return (Criteria) this;
        }

        public Criteria andAutoCommentDayEqualTo(Integer value) {
            addCriterion("auto_comment_day =", value, "autoCommentDay");
            return (Criteria) this;
        }

        public Criteria andAutoCommentDayNotEqualTo(Integer value) {
            addCriterion("auto_comment_day <>", value, "autoCommentDay");
            return (Criteria) this;
        }

        public Criteria andAutoCommentDayGreaterThan(Integer value) {
            addCriterion("auto_comment_day >", value, "autoCommentDay");
            return (Criteria) this;
        }

        public Criteria andAutoCommentDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("auto_comment_day >=", value, "autoCommentDay");
            return (Criteria) this;
        }

        public Criteria andAutoCommentDayLessThan(Integer value) {
            addCriterion("auto_comment_day <", value, "autoCommentDay");
            return (Criteria) this;
        }

        public Criteria andAutoCommentDayLessThanOrEqualTo(Integer value) {
            addCriterion("auto_comment_day <=", value, "autoCommentDay");
            return (Criteria) this;
        }

        public Criteria andAutoCommentDayIn(List<Integer> values) {
            addCriterion("auto_comment_day in", values, "autoCommentDay");
            return (Criteria) this;
        }

        public Criteria andAutoCommentDayNotIn(List<Integer> values) {
            addCriterion("auto_comment_day not in", values, "autoCommentDay");
            return (Criteria) this;
        }

        public Criteria andAutoCommentDayBetween(Integer value1, Integer value2) {
            addCriterion("auto_comment_day between", value1, value2, "autoCommentDay");
            return (Criteria) this;
        }

        public Criteria andAutoCommentDayNotBetween(Integer value1, Integer value2) {
            addCriterion("auto_comment_day not between", value1, value2, "autoCommentDay");
            return (Criteria) this;
        }

        public Criteria andLastRefundDayIsNull() {
            addCriterion("last_refund_day is null");
            return (Criteria) this;
        }

        public Criteria andLastRefundDayIsNotNull() {
            addCriterion("last_refund_day is not null");
            return (Criteria) this;
        }

        public Criteria andLastRefundDayEqualTo(Integer value) {
            addCriterion("last_refund_day =", value, "lastRefundDay");
            return (Criteria) this;
        }

        public Criteria andLastRefundDayNotEqualTo(Integer value) {
            addCriterion("last_refund_day <>", value, "lastRefundDay");
            return (Criteria) this;
        }

        public Criteria andLastRefundDayGreaterThan(Integer value) {
            addCriterion("last_refund_day >", value, "lastRefundDay");
            return (Criteria) this;
        }

        public Criteria andLastRefundDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("last_refund_day >=", value, "lastRefundDay");
            return (Criteria) this;
        }

        public Criteria andLastRefundDayLessThan(Integer value) {
            addCriterion("last_refund_day <", value, "lastRefundDay");
            return (Criteria) this;
        }

        public Criteria andLastRefundDayLessThanOrEqualTo(Integer value) {
            addCriterion("last_refund_day <=", value, "lastRefundDay");
            return (Criteria) this;
        }

        public Criteria andLastRefundDayIn(List<Integer> values) {
            addCriterion("last_refund_day in", values, "lastRefundDay");
            return (Criteria) this;
        }

        public Criteria andLastRefundDayNotIn(List<Integer> values) {
            addCriterion("last_refund_day not in", values, "lastRefundDay");
            return (Criteria) this;
        }

        public Criteria andLastRefundDayBetween(Integer value1, Integer value2) {
            addCriterion("last_refund_day between", value1, value2, "lastRefundDay");
            return (Criteria) this;
        }

        public Criteria andLastRefundDayNotBetween(Integer value1, Integer value2) {
            addCriterion("last_refund_day not between", value1, value2, "lastRefundDay");
            return (Criteria) this;
        }

        public Criteria andAutoAgreeRefundDayIsNull() {
            addCriterion("auto_agree_refund_day is null");
            return (Criteria) this;
        }

        public Criteria andAutoAgreeRefundDayIsNotNull() {
            addCriterion("auto_agree_refund_day is not null");
            return (Criteria) this;
        }

        public Criteria andAutoAgreeRefundDayEqualTo(Integer value) {
            addCriterion("auto_agree_refund_day =", value, "autoAgreeRefundDay");
            return (Criteria) this;
        }

        public Criteria andAutoAgreeRefundDayNotEqualTo(Integer value) {
            addCriterion("auto_agree_refund_day <>", value, "autoAgreeRefundDay");
            return (Criteria) this;
        }

        public Criteria andAutoAgreeRefundDayGreaterThan(Integer value) {
            addCriterion("auto_agree_refund_day >", value, "autoAgreeRefundDay");
            return (Criteria) this;
        }

        public Criteria andAutoAgreeRefundDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("auto_agree_refund_day >=", value, "autoAgreeRefundDay");
            return (Criteria) this;
        }

        public Criteria andAutoAgreeRefundDayLessThan(Integer value) {
            addCriterion("auto_agree_refund_day <", value, "autoAgreeRefundDay");
            return (Criteria) this;
        }

        public Criteria andAutoAgreeRefundDayLessThanOrEqualTo(Integer value) {
            addCriterion("auto_agree_refund_day <=", value, "autoAgreeRefundDay");
            return (Criteria) this;
        }

        public Criteria andAutoAgreeRefundDayIn(List<Integer> values) {
            addCriterion("auto_agree_refund_day in", values, "autoAgreeRefundDay");
            return (Criteria) this;
        }

        public Criteria andAutoAgreeRefundDayNotIn(List<Integer> values) {
            addCriterion("auto_agree_refund_day not in", values, "autoAgreeRefundDay");
            return (Criteria) this;
        }

        public Criteria andAutoAgreeRefundDayBetween(Integer value1, Integer value2) {
            addCriterion("auto_agree_refund_day between", value1, value2, "autoAgreeRefundDay");
            return (Criteria) this;
        }

        public Criteria andAutoAgreeRefundDayNotBetween(Integer value1, Integer value2) {
            addCriterion("auto_agree_refund_day not between", value1, value2, "autoAgreeRefundDay");
            return (Criteria) this;
        }

        public Criteria andBuyerRefundDayIsNull() {
            addCriterion("buyer_refund_day is null");
            return (Criteria) this;
        }

        public Criteria andBuyerRefundDayIsNotNull() {
            addCriterion("buyer_refund_day is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerRefundDayEqualTo(Integer value) {
            addCriterion("buyer_refund_day =", value, "buyerRefundDay");
            return (Criteria) this;
        }

        public Criteria andBuyerRefundDayNotEqualTo(Integer value) {
            addCriterion("buyer_refund_day <>", value, "buyerRefundDay");
            return (Criteria) this;
        }

        public Criteria andBuyerRefundDayGreaterThan(Integer value) {
            addCriterion("buyer_refund_day >", value, "buyerRefundDay");
            return (Criteria) this;
        }

        public Criteria andBuyerRefundDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("buyer_refund_day >=", value, "buyerRefundDay");
            return (Criteria) this;
        }

        public Criteria andBuyerRefundDayLessThan(Integer value) {
            addCriterion("buyer_refund_day <", value, "buyerRefundDay");
            return (Criteria) this;
        }

        public Criteria andBuyerRefundDayLessThanOrEqualTo(Integer value) {
            addCriterion("buyer_refund_day <=", value, "buyerRefundDay");
            return (Criteria) this;
        }

        public Criteria andBuyerRefundDayIn(List<Integer> values) {
            addCriterion("buyer_refund_day in", values, "buyerRefundDay");
            return (Criteria) this;
        }

        public Criteria andBuyerRefundDayNotIn(List<Integer> values) {
            addCriterion("buyer_refund_day not in", values, "buyerRefundDay");
            return (Criteria) this;
        }

        public Criteria andBuyerRefundDayBetween(Integer value1, Integer value2) {
            addCriterion("buyer_refund_day between", value1, value2, "buyerRefundDay");
            return (Criteria) this;
        }

        public Criteria andBuyerRefundDayNotBetween(Integer value1, Integer value2) {
            addCriterion("buyer_refund_day not between", value1, value2, "buyerRefundDay");
            return (Criteria) this;
        }

        public Criteria andSellerReceiveDayIsNull() {
            addCriterion("seller_receive_day is null");
            return (Criteria) this;
        }

        public Criteria andSellerReceiveDayIsNotNull() {
            addCriterion("seller_receive_day is not null");
            return (Criteria) this;
        }

        public Criteria andSellerReceiveDayEqualTo(Integer value) {
            addCriterion("seller_receive_day =", value, "sellerReceiveDay");
            return (Criteria) this;
        }

        public Criteria andSellerReceiveDayNotEqualTo(Integer value) {
            addCriterion("seller_receive_day <>", value, "sellerReceiveDay");
            return (Criteria) this;
        }

        public Criteria andSellerReceiveDayGreaterThan(Integer value) {
            addCriterion("seller_receive_day >", value, "sellerReceiveDay");
            return (Criteria) this;
        }

        public Criteria andSellerReceiveDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("seller_receive_day >=", value, "sellerReceiveDay");
            return (Criteria) this;
        }

        public Criteria andSellerReceiveDayLessThan(Integer value) {
            addCriterion("seller_receive_day <", value, "sellerReceiveDay");
            return (Criteria) this;
        }

        public Criteria andSellerReceiveDayLessThanOrEqualTo(Integer value) {
            addCriterion("seller_receive_day <=", value, "sellerReceiveDay");
            return (Criteria) this;
        }

        public Criteria andSellerReceiveDayIn(List<Integer> values) {
            addCriterion("seller_receive_day in", values, "sellerReceiveDay");
            return (Criteria) this;
        }

        public Criteria andSellerReceiveDayNotIn(List<Integer> values) {
            addCriterion("seller_receive_day not in", values, "sellerReceiveDay");
            return (Criteria) this;
        }

        public Criteria andSellerReceiveDayBetween(Integer value1, Integer value2) {
            addCriterion("seller_receive_day between", value1, value2, "sellerReceiveDay");
            return (Criteria) this;
        }

        public Criteria andSellerReceiveDayNotBetween(Integer value1, Integer value2) {
            addCriterion("seller_receive_day not between", value1, value2, "sellerReceiveDay");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("add_time is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("add_time is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Date value) {
            addCriterion("add_time =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Date value) {
            addCriterion("add_time <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Date value) {
            addCriterion("add_time >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("add_time >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Date value) {
            addCriterion("add_time <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("add_time <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Date> values) {
            addCriterion("add_time in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Date> values) {
            addCriterion("add_time not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Date value1, Date value2) {
            addCriterion("add_time between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("add_time not between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddByIsNull() {
            addCriterion("add_by is null");
            return (Criteria) this;
        }

        public Criteria andAddByIsNotNull() {
            addCriterion("add_by is not null");
            return (Criteria) this;
        }

        public Criteria andAddByEqualTo(String value) {
            addCriterion("add_by =", value, "addBy");
            return (Criteria) this;
        }

        public Criteria andAddByNotEqualTo(String value) {
            addCriterion("add_by <>", value, "addBy");
            return (Criteria) this;
        }

        public Criteria andAddByGreaterThan(String value) {
            addCriterion("add_by >", value, "addBy");
            return (Criteria) this;
        }

        public Criteria andAddByGreaterThanOrEqualTo(String value) {
            addCriterion("add_by >=", value, "addBy");
            return (Criteria) this;
        }

        public Criteria andAddByLessThan(String value) {
            addCriterion("add_by <", value, "addBy");
            return (Criteria) this;
        }

        public Criteria andAddByLessThanOrEqualTo(String value) {
            addCriterion("add_by <=", value, "addBy");
            return (Criteria) this;
        }

        public Criteria andAddByLike(String value) {
            addCriterion("add_by like", value, "addBy");
            return (Criteria) this;
        }

        public Criteria andAddByNotLike(String value) {
            addCriterion("add_by not like", value, "addBy");
            return (Criteria) this;
        }

        public Criteria andAddByIn(List<String> values) {
            addCriterion("add_by in", values, "addBy");
            return (Criteria) this;
        }

        public Criteria andAddByNotIn(List<String> values) {
            addCriterion("add_by not in", values, "addBy");
            return (Criteria) this;
        }

        public Criteria andAddByBetween(String value1, String value2) {
            addCriterion("add_by between", value1, value2, "addBy");
            return (Criteria) this;
        }

        public Criteria andAddByNotBetween(String value1, String value2) {
            addCriterion("add_by not between", value1, value2, "addBy");
            return (Criteria) this;
        }

        public Criteria andUpdTimeIsNull() {
            addCriterion("upd_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdTimeIsNotNull() {
            addCriterion("upd_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdTimeEqualTo(Date value) {
            addCriterion("upd_time =", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeNotEqualTo(Date value) {
            addCriterion("upd_time <>", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeGreaterThan(Date value) {
            addCriterion("upd_time >", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("upd_time >=", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeLessThan(Date value) {
            addCriterion("upd_time <", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeLessThanOrEqualTo(Date value) {
            addCriterion("upd_time <=", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeIn(List<Date> values) {
            addCriterion("upd_time in", values, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeNotIn(List<Date> values) {
            addCriterion("upd_time not in", values, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeBetween(Date value1, Date value2) {
            addCriterion("upd_time between", value1, value2, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeNotBetween(Date value1, Date value2) {
            addCriterion("upd_time not between", value1, value2, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdByIsNull() {
            addCriterion("upd_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdByIsNotNull() {
            addCriterion("upd_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdByEqualTo(String value) {
            addCriterion("upd_by =", value, "updBy");
            return (Criteria) this;
        }

        public Criteria andUpdByNotEqualTo(String value) {
            addCriterion("upd_by <>", value, "updBy");
            return (Criteria) this;
        }

        public Criteria andUpdByGreaterThan(String value) {
            addCriterion("upd_by >", value, "updBy");
            return (Criteria) this;
        }

        public Criteria andUpdByGreaterThanOrEqualTo(String value) {
            addCriterion("upd_by >=", value, "updBy");
            return (Criteria) this;
        }

        public Criteria andUpdByLessThan(String value) {
            addCriterion("upd_by <", value, "updBy");
            return (Criteria) this;
        }

        public Criteria andUpdByLessThanOrEqualTo(String value) {
            addCriterion("upd_by <=", value, "updBy");
            return (Criteria) this;
        }

        public Criteria andUpdByLike(String value) {
            addCriterion("upd_by like", value, "updBy");
            return (Criteria) this;
        }

        public Criteria andUpdByNotLike(String value) {
            addCriterion("upd_by not like", value, "updBy");
            return (Criteria) this;
        }

        public Criteria andUpdByIn(List<String> values) {
            addCriterion("upd_by in", values, "updBy");
            return (Criteria) this;
        }

        public Criteria andUpdByNotIn(List<String> values) {
            addCriterion("upd_by not in", values, "updBy");
            return (Criteria) this;
        }

        public Criteria andUpdByBetween(String value1, String value2) {
            addCriterion("upd_by between", value1, value2, "updBy");
            return (Criteria) this;
        }

        public Criteria andUpdByNotBetween(String value1, String value2) {
            addCriterion("upd_by not between", value1, value2, "updBy");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}