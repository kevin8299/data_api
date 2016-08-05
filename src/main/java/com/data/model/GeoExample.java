package com.data.model;

import com.data.yy.Page;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class GeoExample {
    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: geo
     * @author MyBatis Generator
     */
    protected String orderByClause;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: geo
     * @author MyBatis Generator
     */
    protected Page page;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: geo
     * @author MyBatis Generator
     */
    protected boolean distinct;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: geo
     * @author MyBatis Generator
     */
    protected List<Criteria> oredCriteria;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: geo
     * @author MyBatis Generator
     */
    public GeoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: geo
     * @author MyBatis Generator
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: geo
     * @author MyBatis Generator
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: geo
     * @author MyBatis Generator
     */
    public void setPage(Page page) {
        this.page = page;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: geo
     * @author MyBatis Generator
     */
    public Page getPage() {
        return page;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: geo
     * @author MyBatis Generator
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: geo
     * @author MyBatis Generator
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: geo
     * @author MyBatis Generator
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: geo
     * @author MyBatis Generator
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: geo
     * @author MyBatis Generator
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: geo
     * @author MyBatis Generator
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: geo
     * @author MyBatis Generator
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: geo
     * @author MyBatis Generator
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * 本类由Mybatis Generator自动生成
     * 映射数据库: geo
     * @author MyBatis Generator
     */
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

        public Criteria andLatitudeIsNull() {
            addCriterion("Latitude is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("Latitude is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(Double value) {
            addCriterion("Latitude =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(Double value) {
            addCriterion("Latitude <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(Double value) {
            addCriterion("Latitude >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("Latitude >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(Double value) {
            addCriterion("Latitude <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(Double value) {
            addCriterion("Latitude <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<Double> values) {
            addCriterion("Latitude in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<Double> values) {
            addCriterion("Latitude not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(Double value1, Double value2) {
            addCriterion("Latitude between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(Double value1, Double value2) {
            addCriterion("Latitude not between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNull() {
            addCriterion("Longitude is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("Longitude is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(Double value) {
            addCriterion("Longitude =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(Double value) {
            addCriterion("Longitude <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(Double value) {
            addCriterion("Longitude >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("Longitude >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(Double value) {
            addCriterion("Longitude <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(Double value) {
            addCriterion("Longitude <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<Double> values) {
            addCriterion("Longitude in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<Double> values) {
            addCriterion("Longitude not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(Double value1, Double value2) {
            addCriterion("Longitude between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(Double value1, Double value2) {
            addCriterion("Longitude not between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andNothingIsNull() {
            addCriterion("Nothing is null");
            return (Criteria) this;
        }

        public Criteria andNothingIsNotNull() {
            addCriterion("Nothing is not null");
            return (Criteria) this;
        }

        public Criteria andNothingEqualTo(Long value) {
            addCriterion("Nothing =", value, "nothing");
            return (Criteria) this;
        }

        public Criteria andNothingNotEqualTo(Long value) {
            addCriterion("Nothing <>", value, "nothing");
            return (Criteria) this;
        }

        public Criteria andNothingGreaterThan(Long value) {
            addCriterion("Nothing >", value, "nothing");
            return (Criteria) this;
        }

        public Criteria andNothingGreaterThanOrEqualTo(Long value) {
            addCriterion("Nothing >=", value, "nothing");
            return (Criteria) this;
        }

        public Criteria andNothingLessThan(Long value) {
            addCriterion("Nothing <", value, "nothing");
            return (Criteria) this;
        }

        public Criteria andNothingLessThanOrEqualTo(Long value) {
            addCriterion("Nothing <=", value, "nothing");
            return (Criteria) this;
        }

        public Criteria andNothingIn(List<Long> values) {
            addCriterion("Nothing in", values, "nothing");
            return (Criteria) this;
        }

        public Criteria andNothingNotIn(List<Long> values) {
            addCriterion("Nothing not in", values, "nothing");
            return (Criteria) this;
        }

        public Criteria andNothingBetween(Long value1, Long value2) {
            addCriterion("Nothing between", value1, value2, "nothing");
            return (Criteria) this;
        }

        public Criteria andNothingNotBetween(Long value1, Long value2) {
            addCriterion("Nothing not between", value1, value2, "nothing");
            return (Criteria) this;
        }

        public Criteria andAltitudeIsNull() {
            addCriterion("Altitude is null");
            return (Criteria) this;
        }

        public Criteria andAltitudeIsNotNull() {
            addCriterion("Altitude is not null");
            return (Criteria) this;
        }

        public Criteria andAltitudeEqualTo(Long value) {
            addCriterion("Altitude =", value, "altitude");
            return (Criteria) this;
        }

        public Criteria andAltitudeNotEqualTo(Long value) {
            addCriterion("Altitude <>", value, "altitude");
            return (Criteria) this;
        }

        public Criteria andAltitudeGreaterThan(Long value) {
            addCriterion("Altitude >", value, "altitude");
            return (Criteria) this;
        }

        public Criteria andAltitudeGreaterThanOrEqualTo(Long value) {
            addCriterion("Altitude >=", value, "altitude");
            return (Criteria) this;
        }

        public Criteria andAltitudeLessThan(Long value) {
            addCriterion("Altitude <", value, "altitude");
            return (Criteria) this;
        }

        public Criteria andAltitudeLessThanOrEqualTo(Long value) {
            addCriterion("Altitude <=", value, "altitude");
            return (Criteria) this;
        }

        public Criteria andAltitudeIn(List<Long> values) {
            addCriterion("Altitude in", values, "altitude");
            return (Criteria) this;
        }

        public Criteria andAltitudeNotIn(List<Long> values) {
            addCriterion("Altitude not in", values, "altitude");
            return (Criteria) this;
        }

        public Criteria andAltitudeBetween(Long value1, Long value2) {
            addCriterion("Altitude between", value1, value2, "altitude");
            return (Criteria) this;
        }

        public Criteria andAltitudeNotBetween(Long value1, Long value2) {
            addCriterion("Altitude not between", value1, value2, "altitude");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("Date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("Date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(BigDecimal value) {
            addCriterion("Date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(BigDecimal value) {
            addCriterion("Date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(BigDecimal value) {
            addCriterion("Date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(BigDecimal value) {
            addCriterion("Date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<BigDecimal> values) {
            addCriterion("Date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<BigDecimal> values) {
            addCriterion("Date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Date not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDatestringIsNull() {
            addCriterion("DateString is null");
            return (Criteria) this;
        }

        public Criteria andDatestringIsNotNull() {
            addCriterion("DateString is not null");
            return (Criteria) this;
        }

        public Criteria andDatestringEqualTo(String value) {
            addCriterion("DateString =", value, "datestring");
            return (Criteria) this;
        }

        public Criteria andDatestringNotEqualTo(String value) {
            addCriterion("DateString <>", value, "datestring");
            return (Criteria) this;
        }

        public Criteria andDatestringGreaterThan(String value) {
            addCriterion("DateString >", value, "datestring");
            return (Criteria) this;
        }

        public Criteria andDatestringGreaterThanOrEqualTo(String value) {
            addCriterion("DateString >=", value, "datestring");
            return (Criteria) this;
        }

        public Criteria andDatestringLessThan(String value) {
            addCriterion("DateString <", value, "datestring");
            return (Criteria) this;
        }

        public Criteria andDatestringLessThanOrEqualTo(String value) {
            addCriterion("DateString <=", value, "datestring");
            return (Criteria) this;
        }

        public Criteria andDatestringLike(String value) {
            addCriterion("DateString like", value, "datestring");
            return (Criteria) this;
        }

        public Criteria andDatestringNotLike(String value) {
            addCriterion("DateString not like", value, "datestring");
            return (Criteria) this;
        }

        public Criteria andDatestringIn(List<String> values) {
            addCriterion("DateString in", values, "datestring");
            return (Criteria) this;
        }

        public Criteria andDatestringNotIn(List<String> values) {
            addCriterion("DateString not in", values, "datestring");
            return (Criteria) this;
        }

        public Criteria andDatestringBetween(String value1, String value2) {
            addCriterion("DateString between", value1, value2, "datestring");
            return (Criteria) this;
        }

        public Criteria andDatestringNotBetween(String value1, String value2) {
            addCriterion("DateString not between", value1, value2, "datestring");
            return (Criteria) this;
        }

        public Criteria andTimestringIsNull() {
            addCriterion("TimeString is null");
            return (Criteria) this;
        }

        public Criteria andTimestringIsNotNull() {
            addCriterion("TimeString is not null");
            return (Criteria) this;
        }

        public Criteria andTimestringEqualTo(String value) {
            addCriterion("TimeString =", value, "timestring");
            return (Criteria) this;
        }

        public Criteria andTimestringNotEqualTo(String value) {
            addCriterion("TimeString <>", value, "timestring");
            return (Criteria) this;
        }

        public Criteria andTimestringGreaterThan(String value) {
            addCriterion("TimeString >", value, "timestring");
            return (Criteria) this;
        }

        public Criteria andTimestringGreaterThanOrEqualTo(String value) {
            addCriterion("TimeString >=", value, "timestring");
            return (Criteria) this;
        }

        public Criteria andTimestringLessThan(String value) {
            addCriterion("TimeString <", value, "timestring");
            return (Criteria) this;
        }

        public Criteria andTimestringLessThanOrEqualTo(String value) {
            addCriterion("TimeString <=", value, "timestring");
            return (Criteria) this;
        }

        public Criteria andTimestringLike(String value) {
            addCriterion("TimeString like", value, "timestring");
            return (Criteria) this;
        }

        public Criteria andTimestringNotLike(String value) {
            addCriterion("TimeString not like", value, "timestring");
            return (Criteria) this;
        }

        public Criteria andTimestringIn(List<String> values) {
            addCriterion("TimeString in", values, "timestring");
            return (Criteria) this;
        }

        public Criteria andTimestringNotIn(List<String> values) {
            addCriterion("TimeString not in", values, "timestring");
            return (Criteria) this;
        }

        public Criteria andTimestringBetween(String value1, String value2) {
            addCriterion("TimeString between", value1, value2, "timestring");
            return (Criteria) this;
        }

        public Criteria andTimestringNotBetween(String value1, String value2) {
            addCriterion("TimeString not between", value1, value2, "timestring");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table geo
     * @author do_not_delete_during_merge MyBatis Generator
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 本类由Mybatis Generator自动生成
     * 映射数据库: geo
     * @author MyBatis Generator
     */
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