package com.entity.example;

import java.util.ArrayList;
import java.util.List;

public class TmTestSetExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TmTestSetExample() {
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

        public Criteria andTestIdIsNull() {
            addCriterion("TEST_ID is null");
            return (Criteria) this;
        }

        public Criteria andTestIdIsNotNull() {
            addCriterion("TEST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTestIdEqualTo(String value) {
            addCriterion("TEST_ID =", value, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdNotEqualTo(String value) {
            addCriterion("TEST_ID <>", value, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdGreaterThan(String value) {
            addCriterion("TEST_ID >", value, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdGreaterThanOrEqualTo(String value) {
            addCriterion("TEST_ID >=", value, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdLessThan(String value) {
            addCriterion("TEST_ID <", value, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdLessThanOrEqualTo(String value) {
            addCriterion("TEST_ID <=", value, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdLike(String value) {
            addCriterion("TEST_ID like", value, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdNotLike(String value) {
            addCriterion("TEST_ID not like", value, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdIn(List<String> values) {
            addCriterion("TEST_ID in", values, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdNotIn(List<String> values) {
            addCriterion("TEST_ID not in", values, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdBetween(String value1, String value2) {
            addCriterion("TEST_ID between", value1, value2, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdNotBetween(String value1, String value2) {
            addCriterion("TEST_ID not between", value1, value2, "testId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdIsNull() {
            addCriterion("QUESTION_ID is null");
            return (Criteria) this;
        }

        public Criteria andQuestionIdIsNotNull() {
            addCriterion("QUESTION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionIdEqualTo(String value) {
            addCriterion("QUESTION_ID =", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdNotEqualTo(String value) {
            addCriterion("QUESTION_ID <>", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdGreaterThan(String value) {
            addCriterion("QUESTION_ID >", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdGreaterThanOrEqualTo(String value) {
            addCriterion("QUESTION_ID >=", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdLessThan(String value) {
            addCriterion("QUESTION_ID <", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdLessThanOrEqualTo(String value) {
            addCriterion("QUESTION_ID <=", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdLike(String value) {
            addCriterion("QUESTION_ID like", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdNotLike(String value) {
            addCriterion("QUESTION_ID not like", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdIn(List<String> values) {
            addCriterion("QUESTION_ID in", values, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdNotIn(List<String> values) {
            addCriterion("QUESTION_ID not in", values, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdBetween(String value1, String value2) {
            addCriterion("QUESTION_ID between", value1, value2, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdNotBetween(String value1, String value2) {
            addCriterion("QUESTION_ID not between", value1, value2, "questionId");
            return (Criteria) this;
        }

        public Criteria andTestInputIsNull() {
            addCriterion("TEST_INPUT is null");
            return (Criteria) this;
        }

        public Criteria andTestInputIsNotNull() {
            addCriterion("TEST_INPUT is not null");
            return (Criteria) this;
        }

        public Criteria andTestInputEqualTo(String value) {
            addCriterion("TEST_INPUT =", value, "testInput");
            return (Criteria) this;
        }

        public Criteria andTestInputNotEqualTo(String value) {
            addCriterion("TEST_INPUT <>", value, "testInput");
            return (Criteria) this;
        }

        public Criteria andTestInputGreaterThan(String value) {
            addCriterion("TEST_INPUT >", value, "testInput");
            return (Criteria) this;
        }

        public Criteria andTestInputGreaterThanOrEqualTo(String value) {
            addCriterion("TEST_INPUT >=", value, "testInput");
            return (Criteria) this;
        }

        public Criteria andTestInputLessThan(String value) {
            addCriterion("TEST_INPUT <", value, "testInput");
            return (Criteria) this;
        }

        public Criteria andTestInputLessThanOrEqualTo(String value) {
            addCriterion("TEST_INPUT <=", value, "testInput");
            return (Criteria) this;
        }

        public Criteria andTestInputLike(String value) {
            addCriterion("TEST_INPUT like", value, "testInput");
            return (Criteria) this;
        }

        public Criteria andTestInputNotLike(String value) {
            addCriterion("TEST_INPUT not like", value, "testInput");
            return (Criteria) this;
        }

        public Criteria andTestInputIn(List<String> values) {
            addCriterion("TEST_INPUT in", values, "testInput");
            return (Criteria) this;
        }

        public Criteria andTestInputNotIn(List<String> values) {
            addCriterion("TEST_INPUT not in", values, "testInput");
            return (Criteria) this;
        }

        public Criteria andTestInputBetween(String value1, String value2) {
            addCriterion("TEST_INPUT between", value1, value2, "testInput");
            return (Criteria) this;
        }

        public Criteria andTestInputNotBetween(String value1, String value2) {
            addCriterion("TEST_INPUT not between", value1, value2, "testInput");
            return (Criteria) this;
        }

        public Criteria andTestOutputIsNull() {
            addCriterion("TEST_OUTPUT is null");
            return (Criteria) this;
        }

        public Criteria andTestOutputIsNotNull() {
            addCriterion("TEST_OUTPUT is not null");
            return (Criteria) this;
        }

        public Criteria andTestOutputEqualTo(String value) {
            addCriterion("TEST_OUTPUT =", value, "testOutput");
            return (Criteria) this;
        }

        public Criteria andTestOutputNotEqualTo(String value) {
            addCriterion("TEST_OUTPUT <>", value, "testOutput");
            return (Criteria) this;
        }

        public Criteria andTestOutputGreaterThan(String value) {
            addCriterion("TEST_OUTPUT >", value, "testOutput");
            return (Criteria) this;
        }

        public Criteria andTestOutputGreaterThanOrEqualTo(String value) {
            addCriterion("TEST_OUTPUT >=", value, "testOutput");
            return (Criteria) this;
        }

        public Criteria andTestOutputLessThan(String value) {
            addCriterion("TEST_OUTPUT <", value, "testOutput");
            return (Criteria) this;
        }

        public Criteria andTestOutputLessThanOrEqualTo(String value) {
            addCriterion("TEST_OUTPUT <=", value, "testOutput");
            return (Criteria) this;
        }

        public Criteria andTestOutputLike(String value) {
            addCriterion("TEST_OUTPUT like", value, "testOutput");
            return (Criteria) this;
        }

        public Criteria andTestOutputNotLike(String value) {
            addCriterion("TEST_OUTPUT not like", value, "testOutput");
            return (Criteria) this;
        }

        public Criteria andTestOutputIn(List<String> values) {
            addCriterion("TEST_OUTPUT in", values, "testOutput");
            return (Criteria) this;
        }

        public Criteria andTestOutputNotIn(List<String> values) {
            addCriterion("TEST_OUTPUT not in", values, "testOutput");
            return (Criteria) this;
        }

        public Criteria andTestOutputBetween(String value1, String value2) {
            addCriterion("TEST_OUTPUT between", value1, value2, "testOutput");
            return (Criteria) this;
        }

        public Criteria andTestOutputNotBetween(String value1, String value2) {
            addCriterion("TEST_OUTPUT not between", value1, value2, "testOutput");
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