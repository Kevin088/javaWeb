package com.demo.film.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerInfoExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNull() {
            addCriterion("telephone is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNotNull() {
            addCriterion("telephone is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("telephone =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("telephone <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("telephone >", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("telephone >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThan(String value) {
            addCriterion("telephone <", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("telephone <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLike(String value) {
            addCriterion("telephone like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotLike(String value) {
            addCriterion("telephone not like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIn(List<String> values) {
            addCriterion("telephone in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("telephone not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("telephone between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("telephone not between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andIscomputeIsNull() {
            addCriterion("iscompute is null");
            return (Criteria) this;
        }

        public Criteria andIscomputeIsNotNull() {
            addCriterion("iscompute is not null");
            return (Criteria) this;
        }

        public Criteria andIscomputeEqualTo(Boolean value) {
            addCriterion("iscompute =", value, "iscompute");
            return (Criteria) this;
        }

        public Criteria andIscomputeNotEqualTo(Boolean value) {
            addCriterion("iscompute <>", value, "iscompute");
            return (Criteria) this;
        }

        public Criteria andIscomputeGreaterThan(Boolean value) {
            addCriterion("iscompute >", value, "iscompute");
            return (Criteria) this;
        }

        public Criteria andIscomputeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("iscompute >=", value, "iscompute");
            return (Criteria) this;
        }

        public Criteria andIscomputeLessThan(Boolean value) {
            addCriterion("iscompute <", value, "iscompute");
            return (Criteria) this;
        }

        public Criteria andIscomputeLessThanOrEqualTo(Boolean value) {
            addCriterion("iscompute <=", value, "iscompute");
            return (Criteria) this;
        }

        public Criteria andIscomputeIn(List<Boolean> values) {
            addCriterion("iscompute in", values, "iscompute");
            return (Criteria) this;
        }

        public Criteria andIscomputeNotIn(List<Boolean> values) {
            addCriterion("iscompute not in", values, "iscompute");
            return (Criteria) this;
        }

        public Criteria andIscomputeBetween(Boolean value1, Boolean value2) {
            addCriterion("iscompute between", value1, value2, "iscompute");
            return (Criteria) this;
        }

        public Criteria andIscomputeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("iscompute not between", value1, value2, "iscompute");
            return (Criteria) this;
        }

        public Criteria andBroadbandIsNull() {
            addCriterion("broadband is null");
            return (Criteria) this;
        }

        public Criteria andBroadbandIsNotNull() {
            addCriterion("broadband is not null");
            return (Criteria) this;
        }

        public Criteria andBroadbandEqualTo(Boolean value) {
            addCriterion("broadband =", value, "broadband");
            return (Criteria) this;
        }

        public Criteria andBroadbandNotEqualTo(Boolean value) {
            addCriterion("broadband <>", value, "broadband");
            return (Criteria) this;
        }

        public Criteria andBroadbandGreaterThan(Boolean value) {
            addCriterion("broadband >", value, "broadband");
            return (Criteria) this;
        }

        public Criteria andBroadbandGreaterThanOrEqualTo(Boolean value) {
            addCriterion("broadband >=", value, "broadband");
            return (Criteria) this;
        }

        public Criteria andBroadbandLessThan(Boolean value) {
            addCriterion("broadband <", value, "broadband");
            return (Criteria) this;
        }

        public Criteria andBroadbandLessThanOrEqualTo(Boolean value) {
            addCriterion("broadband <=", value, "broadband");
            return (Criteria) this;
        }

        public Criteria andBroadbandIn(List<Boolean> values) {
            addCriterion("broadband in", values, "broadband");
            return (Criteria) this;
        }

        public Criteria andBroadbandNotIn(List<Boolean> values) {
            addCriterion("broadband not in", values, "broadband");
            return (Criteria) this;
        }

        public Criteria andBroadbandBetween(Boolean value1, Boolean value2) {
            addCriterion("broadband between", value1, value2, "broadband");
            return (Criteria) this;
        }

        public Criteria andBroadbandNotBetween(Boolean value1, Boolean value2) {
            addCriterion("broadband not between", value1, value2, "broadband");
            return (Criteria) this;
        }

        public Criteria andBroadbandsatisfyIsNull() {
            addCriterion("broadbandSatisfy is null");
            return (Criteria) this;
        }

        public Criteria andBroadbandsatisfyIsNotNull() {
            addCriterion("broadbandSatisfy is not null");
            return (Criteria) this;
        }

        public Criteria andBroadbandsatisfyEqualTo(Boolean value) {
            addCriterion("broadbandSatisfy =", value, "broadbandsatisfy");
            return (Criteria) this;
        }

        public Criteria andBroadbandsatisfyNotEqualTo(Boolean value) {
            addCriterion("broadbandSatisfy <>", value, "broadbandsatisfy");
            return (Criteria) this;
        }

        public Criteria andBroadbandsatisfyGreaterThan(Boolean value) {
            addCriterion("broadbandSatisfy >", value, "broadbandsatisfy");
            return (Criteria) this;
        }

        public Criteria andBroadbandsatisfyGreaterThanOrEqualTo(Boolean value) {
            addCriterion("broadbandSatisfy >=", value, "broadbandsatisfy");
            return (Criteria) this;
        }

        public Criteria andBroadbandsatisfyLessThan(Boolean value) {
            addCriterion("broadbandSatisfy <", value, "broadbandsatisfy");
            return (Criteria) this;
        }

        public Criteria andBroadbandsatisfyLessThanOrEqualTo(Boolean value) {
            addCriterion("broadbandSatisfy <=", value, "broadbandsatisfy");
            return (Criteria) this;
        }

        public Criteria andBroadbandsatisfyIn(List<Boolean> values) {
            addCriterion("broadbandSatisfy in", values, "broadbandsatisfy");
            return (Criteria) this;
        }

        public Criteria andBroadbandsatisfyNotIn(List<Boolean> values) {
            addCriterion("broadbandSatisfy not in", values, "broadbandsatisfy");
            return (Criteria) this;
        }

        public Criteria andBroadbandsatisfyBetween(Boolean value1, Boolean value2) {
            addCriterion("broadbandSatisfy between", value1, value2, "broadbandsatisfy");
            return (Criteria) this;
        }

        public Criteria andBroadbandsatisfyNotBetween(Boolean value1, Boolean value2) {
            addCriterion("broadbandSatisfy not between", value1, value2, "broadbandsatisfy");
            return (Criteria) this;
        }

        public Criteria andIsbroadbandfusionIsNull() {
            addCriterion("isBroadbandFusion is null");
            return (Criteria) this;
        }

        public Criteria andIsbroadbandfusionIsNotNull() {
            addCriterion("isBroadbandFusion is not null");
            return (Criteria) this;
        }

        public Criteria andIsbroadbandfusionEqualTo(Boolean value) {
            addCriterion("isBroadbandFusion =", value, "isbroadbandfusion");
            return (Criteria) this;
        }

        public Criteria andIsbroadbandfusionNotEqualTo(Boolean value) {
            addCriterion("isBroadbandFusion <>", value, "isbroadbandfusion");
            return (Criteria) this;
        }

        public Criteria andIsbroadbandfusionGreaterThan(Boolean value) {
            addCriterion("isBroadbandFusion >", value, "isbroadbandfusion");
            return (Criteria) this;
        }

        public Criteria andIsbroadbandfusionGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isBroadbandFusion >=", value, "isbroadbandfusion");
            return (Criteria) this;
        }

        public Criteria andIsbroadbandfusionLessThan(Boolean value) {
            addCriterion("isBroadbandFusion <", value, "isbroadbandfusion");
            return (Criteria) this;
        }

        public Criteria andIsbroadbandfusionLessThanOrEqualTo(Boolean value) {
            addCriterion("isBroadbandFusion <=", value, "isbroadbandfusion");
            return (Criteria) this;
        }

        public Criteria andIsbroadbandfusionIn(List<Boolean> values) {
            addCriterion("isBroadbandFusion in", values, "isbroadbandfusion");
            return (Criteria) this;
        }

        public Criteria andIsbroadbandfusionNotIn(List<Boolean> values) {
            addCriterion("isBroadbandFusion not in", values, "isbroadbandfusion");
            return (Criteria) this;
        }

        public Criteria andIsbroadbandfusionBetween(Boolean value1, Boolean value2) {
            addCriterion("isBroadbandFusion between", value1, value2, "isbroadbandfusion");
            return (Criteria) this;
        }

        public Criteria andIsbroadbandfusionNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isBroadbandFusion not between", value1, value2, "isbroadbandfusion");
            return (Criteria) this;
        }

        public Criteria andBroadbandpriceIsNull() {
            addCriterion("broadbandPrice is null");
            return (Criteria) this;
        }

        public Criteria andBroadbandpriceIsNotNull() {
            addCriterion("broadbandPrice is not null");
            return (Criteria) this;
        }

        public Criteria andBroadbandpriceEqualTo(Float value) {
            addCriterion("broadbandPrice =", value, "broadbandprice");
            return (Criteria) this;
        }

        public Criteria andBroadbandpriceNotEqualTo(Float value) {
            addCriterion("broadbandPrice <>", value, "broadbandprice");
            return (Criteria) this;
        }

        public Criteria andBroadbandpriceGreaterThan(Float value) {
            addCriterion("broadbandPrice >", value, "broadbandprice");
            return (Criteria) this;
        }

        public Criteria andBroadbandpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("broadbandPrice >=", value, "broadbandprice");
            return (Criteria) this;
        }

        public Criteria andBroadbandpriceLessThan(Float value) {
            addCriterion("broadbandPrice <", value, "broadbandprice");
            return (Criteria) this;
        }

        public Criteria andBroadbandpriceLessThanOrEqualTo(Float value) {
            addCriterion("broadbandPrice <=", value, "broadbandprice");
            return (Criteria) this;
        }

        public Criteria andBroadbandpriceIn(List<Float> values) {
            addCriterion("broadbandPrice in", values, "broadbandprice");
            return (Criteria) this;
        }

        public Criteria andBroadbandpriceNotIn(List<Float> values) {
            addCriterion("broadbandPrice not in", values, "broadbandprice");
            return (Criteria) this;
        }

        public Criteria andBroadbandpriceBetween(Float value1, Float value2) {
            addCriterion("broadbandPrice between", value1, value2, "broadbandprice");
            return (Criteria) this;
        }

        public Criteria andBroadbandpriceNotBetween(Float value1, Float value2) {
            addCriterion("broadbandPrice not between", value1, value2, "broadbandprice");
            return (Criteria) this;
        }

        public Criteria andBroadbandendtimeIsNull() {
            addCriterion("broadbandEndTime is null");
            return (Criteria) this;
        }

        public Criteria andBroadbandendtimeIsNotNull() {
            addCriterion("broadbandEndTime is not null");
            return (Criteria) this;
        }

        public Criteria andBroadbandendtimeEqualTo(String value) {
            addCriterion("broadbandEndTime =", value, "broadbandendtime");
            return (Criteria) this;
        }

        public Criteria andBroadbandendtimeNotEqualTo(String value) {
            addCriterion("broadbandEndTime <>", value, "broadbandendtime");
            return (Criteria) this;
        }

        public Criteria andBroadbandendtimeGreaterThan(String value) {
            addCriterion("broadbandEndTime >", value, "broadbandendtime");
            return (Criteria) this;
        }

        public Criteria andBroadbandendtimeGreaterThanOrEqualTo(String value) {
            addCriterion("broadbandEndTime >=", value, "broadbandendtime");
            return (Criteria) this;
        }

        public Criteria andBroadbandendtimeLessThan(String value) {
            addCriterion("broadbandEndTime <", value, "broadbandendtime");
            return (Criteria) this;
        }

        public Criteria andBroadbandendtimeLessThanOrEqualTo(String value) {
            addCriterion("broadbandEndTime <=", value, "broadbandendtime");
            return (Criteria) this;
        }

        public Criteria andBroadbandendtimeLike(String value) {
            addCriterion("broadbandEndTime like", value, "broadbandendtime");
            return (Criteria) this;
        }

        public Criteria andBroadbandendtimeNotLike(String value) {
            addCriterion("broadbandEndTime not like", value, "broadbandendtime");
            return (Criteria) this;
        }

        public Criteria andBroadbandendtimeIn(List<String> values) {
            addCriterion("broadbandEndTime in", values, "broadbandendtime");
            return (Criteria) this;
        }

        public Criteria andBroadbandendtimeNotIn(List<String> values) {
            addCriterion("broadbandEndTime not in", values, "broadbandendtime");
            return (Criteria) this;
        }

        public Criteria andBroadbandendtimeBetween(String value1, String value2) {
            addCriterion("broadbandEndTime between", value1, value2, "broadbandendtime");
            return (Criteria) this;
        }

        public Criteria andBroadbandendtimeNotBetween(String value1, String value2) {
            addCriterion("broadbandEndTime not between", value1, value2, "broadbandendtime");
            return (Criteria) this;
        }

        public Criteria andTvIsNull() {
            addCriterion("tv is null");
            return (Criteria) this;
        }

        public Criteria andTvIsNotNull() {
            addCriterion("tv is not null");
            return (Criteria) this;
        }

        public Criteria andTvEqualTo(Boolean value) {
            addCriterion("tv =", value, "tv");
            return (Criteria) this;
        }

        public Criteria andTvNotEqualTo(Boolean value) {
            addCriterion("tv <>", value, "tv");
            return (Criteria) this;
        }

        public Criteria andTvGreaterThan(Boolean value) {
            addCriterion("tv >", value, "tv");
            return (Criteria) this;
        }

        public Criteria andTvGreaterThanOrEqualTo(Boolean value) {
            addCriterion("tv >=", value, "tv");
            return (Criteria) this;
        }

        public Criteria andTvLessThan(Boolean value) {
            addCriterion("tv <", value, "tv");
            return (Criteria) this;
        }

        public Criteria andTvLessThanOrEqualTo(Boolean value) {
            addCriterion("tv <=", value, "tv");
            return (Criteria) this;
        }

        public Criteria andTvIn(List<Boolean> values) {
            addCriterion("tv in", values, "tv");
            return (Criteria) this;
        }

        public Criteria andTvNotIn(List<Boolean> values) {
            addCriterion("tv not in", values, "tv");
            return (Criteria) this;
        }

        public Criteria andTvBetween(Boolean value1, Boolean value2) {
            addCriterion("tv between", value1, value2, "tv");
            return (Criteria) this;
        }

        public Criteria andTvNotBetween(Boolean value1, Boolean value2) {
            addCriterion("tv not between", value1, value2, "tv");
            return (Criteria) this;
        }

        public Criteria andTvsatisfyIsNull() {
            addCriterion("tvSatisfy is null");
            return (Criteria) this;
        }

        public Criteria andTvsatisfyIsNotNull() {
            addCriterion("tvSatisfy is not null");
            return (Criteria) this;
        }

        public Criteria andTvsatisfyEqualTo(Boolean value) {
            addCriterion("tvSatisfy =", value, "tvsatisfy");
            return (Criteria) this;
        }

        public Criteria andTvsatisfyNotEqualTo(Boolean value) {
            addCriterion("tvSatisfy <>", value, "tvsatisfy");
            return (Criteria) this;
        }

        public Criteria andTvsatisfyGreaterThan(Boolean value) {
            addCriterion("tvSatisfy >", value, "tvsatisfy");
            return (Criteria) this;
        }

        public Criteria andTvsatisfyGreaterThanOrEqualTo(Boolean value) {
            addCriterion("tvSatisfy >=", value, "tvsatisfy");
            return (Criteria) this;
        }

        public Criteria andTvsatisfyLessThan(Boolean value) {
            addCriterion("tvSatisfy <", value, "tvsatisfy");
            return (Criteria) this;
        }

        public Criteria andTvsatisfyLessThanOrEqualTo(Boolean value) {
            addCriterion("tvSatisfy <=", value, "tvsatisfy");
            return (Criteria) this;
        }

        public Criteria andTvsatisfyIn(List<Boolean> values) {
            addCriterion("tvSatisfy in", values, "tvsatisfy");
            return (Criteria) this;
        }

        public Criteria andTvsatisfyNotIn(List<Boolean> values) {
            addCriterion("tvSatisfy not in", values, "tvsatisfy");
            return (Criteria) this;
        }

        public Criteria andTvsatisfyBetween(Boolean value1, Boolean value2) {
            addCriterion("tvSatisfy between", value1, value2, "tvsatisfy");
            return (Criteria) this;
        }

        public Criteria andTvsatisfyNotBetween(Boolean value1, Boolean value2) {
            addCriterion("tvSatisfy not between", value1, value2, "tvsatisfy");
            return (Criteria) this;
        }

        public Criteria andTvpriceIsNull() {
            addCriterion("tvPrice is null");
            return (Criteria) this;
        }

        public Criteria andTvpriceIsNotNull() {
            addCriterion("tvPrice is not null");
            return (Criteria) this;
        }

        public Criteria andTvpriceEqualTo(Float value) {
            addCriterion("tvPrice =", value, "tvprice");
            return (Criteria) this;
        }

        public Criteria andTvpriceNotEqualTo(Float value) {
            addCriterion("tvPrice <>", value, "tvprice");
            return (Criteria) this;
        }

        public Criteria andTvpriceGreaterThan(Float value) {
            addCriterion("tvPrice >", value, "tvprice");
            return (Criteria) this;
        }

        public Criteria andTvpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("tvPrice >=", value, "tvprice");
            return (Criteria) this;
        }

        public Criteria andTvpriceLessThan(Float value) {
            addCriterion("tvPrice <", value, "tvprice");
            return (Criteria) this;
        }

        public Criteria andTvpriceLessThanOrEqualTo(Float value) {
            addCriterion("tvPrice <=", value, "tvprice");
            return (Criteria) this;
        }

        public Criteria andTvpriceIn(List<Float> values) {
            addCriterion("tvPrice in", values, "tvprice");
            return (Criteria) this;
        }

        public Criteria andTvpriceNotIn(List<Float> values) {
            addCriterion("tvPrice not in", values, "tvprice");
            return (Criteria) this;
        }

        public Criteria andTvpriceBetween(Float value1, Float value2) {
            addCriterion("tvPrice between", value1, value2, "tvprice");
            return (Criteria) this;
        }

        public Criteria andTvpriceNotBetween(Float value1, Float value2) {
            addCriterion("tvPrice not between", value1, value2, "tvprice");
            return (Criteria) this;
        }

        public Criteria andTvendtimeIsNull() {
            addCriterion("tvEndTime is null");
            return (Criteria) this;
        }

        public Criteria andTvendtimeIsNotNull() {
            addCriterion("tvEndTime is not null");
            return (Criteria) this;
        }

        public Criteria andTvendtimeEqualTo(String value) {
            addCriterion("tvEndTime =", value, "tvendtime");
            return (Criteria) this;
        }

        public Criteria andTvendtimeNotEqualTo(String value) {
            addCriterion("tvEndTime <>", value, "tvendtime");
            return (Criteria) this;
        }

        public Criteria andTvendtimeGreaterThan(String value) {
            addCriterion("tvEndTime >", value, "tvendtime");
            return (Criteria) this;
        }

        public Criteria andTvendtimeGreaterThanOrEqualTo(String value) {
            addCriterion("tvEndTime >=", value, "tvendtime");
            return (Criteria) this;
        }

        public Criteria andTvendtimeLessThan(String value) {
            addCriterion("tvEndTime <", value, "tvendtime");
            return (Criteria) this;
        }

        public Criteria andTvendtimeLessThanOrEqualTo(String value) {
            addCriterion("tvEndTime <=", value, "tvendtime");
            return (Criteria) this;
        }

        public Criteria andTvendtimeLike(String value) {
            addCriterion("tvEndTime like", value, "tvendtime");
            return (Criteria) this;
        }

        public Criteria andTvendtimeNotLike(String value) {
            addCriterion("tvEndTime not like", value, "tvendtime");
            return (Criteria) this;
        }

        public Criteria andTvendtimeIn(List<String> values) {
            addCriterion("tvEndTime in", values, "tvendtime");
            return (Criteria) this;
        }

        public Criteria andTvendtimeNotIn(List<String> values) {
            addCriterion("tvEndTime not in", values, "tvendtime");
            return (Criteria) this;
        }

        public Criteria andTvendtimeBetween(String value1, String value2) {
            addCriterion("tvEndTime between", value1, value2, "tvendtime");
            return (Criteria) this;
        }

        public Criteria andTvendtimeNotBetween(String value1, String value2) {
            addCriterion("tvEndTime not between", value1, value2, "tvendtime");
            return (Criteria) this;
        }

        public Criteria andDistrictIdIsNull() {
            addCriterion("district_id is null");
            return (Criteria) this;
        }

        public Criteria andDistrictIdIsNotNull() {
            addCriterion("district_id is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictIdEqualTo(Long value) {
            addCriterion("district_id =", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdNotEqualTo(Long value) {
            addCriterion("district_id <>", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdGreaterThan(Long value) {
            addCriterion("district_id >", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdGreaterThanOrEqualTo(Long value) {
            addCriterion("district_id >=", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdLessThan(Long value) {
            addCriterion("district_id <", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdLessThanOrEqualTo(Long value) {
            addCriterion("district_id <=", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdIn(List<Long> values) {
            addCriterion("district_id in", values, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdNotIn(List<Long> values) {
            addCriterion("district_id not in", values, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdBetween(Long value1, Long value2) {
            addCriterion("district_id between", value1, value2, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdNotBetween(Long value1, Long value2) {
            addCriterion("district_id not between", value1, value2, "districtId");
            return (Criteria) this;
        }

        public Criteria andUsernameIdIsNull() {
            addCriterion("username_id is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIdIsNotNull() {
            addCriterion("username_id is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameIdEqualTo(Long value) {
            addCriterion("username_id =", value, "usernameId");
            return (Criteria) this;
        }

        public Criteria andUsernameIdNotEqualTo(Long value) {
            addCriterion("username_id <>", value, "usernameId");
            return (Criteria) this;
        }

        public Criteria andUsernameIdGreaterThan(Long value) {
            addCriterion("username_id >", value, "usernameId");
            return (Criteria) this;
        }

        public Criteria andUsernameIdGreaterThanOrEqualTo(Long value) {
            addCriterion("username_id >=", value, "usernameId");
            return (Criteria) this;
        }

        public Criteria andUsernameIdLessThan(Long value) {
            addCriterion("username_id <", value, "usernameId");
            return (Criteria) this;
        }

        public Criteria andUsernameIdLessThanOrEqualTo(Long value) {
            addCriterion("username_id <=", value, "usernameId");
            return (Criteria) this;
        }

        public Criteria andUsernameIdIn(List<Long> values) {
            addCriterion("username_id in", values, "usernameId");
            return (Criteria) this;
        }

        public Criteria andUsernameIdNotIn(List<Long> values) {
            addCriterion("username_id not in", values, "usernameId");
            return (Criteria) this;
        }

        public Criteria andUsernameIdBetween(Long value1, Long value2) {
            addCriterion("username_id between", value1, value2, "usernameId");
            return (Criteria) this;
        }

        public Criteria andUsernameIdNotBetween(Long value1, Long value2) {
            addCriterion("username_id not between", value1, value2, "usernameId");
            return (Criteria) this;
        }

        public Criteria andDatetimeIsNull() {
            addCriterion("datetime is null");
            return (Criteria) this;
        }

        public Criteria andDatetimeIsNotNull() {
            addCriterion("datetime is not null");
            return (Criteria) this;
        }

        public Criteria andDatetimeEqualTo(Date value) {
            addCriterion("datetime =", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeNotEqualTo(Date value) {
            addCriterion("datetime <>", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeGreaterThan(Date value) {
            addCriterion("datetime >", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("datetime >=", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeLessThan(Date value) {
            addCriterion("datetime <", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("datetime <=", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeIn(List<Date> values) {
            addCriterion("datetime in", values, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeNotIn(List<Date> values) {
            addCriterion("datetime not in", values, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeBetween(Date value1, Date value2) {
            addCriterion("datetime between", value1, value2, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("datetime not between", value1, value2, "datetime");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIsNull() {
            addCriterion("isdelete is null");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIsNotNull() {
            addCriterion("isdelete is not null");
            return (Criteria) this;
        }

        public Criteria andIsdeleteEqualTo(Boolean value) {
            addCriterion("isdelete =", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotEqualTo(Boolean value) {
            addCriterion("isdelete <>", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteGreaterThan(Boolean value) {
            addCriterion("isdelete >", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isdelete >=", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLessThan(Boolean value) {
            addCriterion("isdelete <", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLessThanOrEqualTo(Boolean value) {
            addCriterion("isdelete <=", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIn(List<Boolean> values) {
            addCriterion("isdelete in", values, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotIn(List<Boolean> values) {
            addCriterion("isdelete not in", values, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteBetween(Boolean value1, Boolean value2) {
            addCriterion("isdelete between", value1, value2, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isdelete not between", value1, value2, "isdelete");
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