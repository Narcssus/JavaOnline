package com.entity;

public class TmQuestionSet {
    private String questionId;

    private String qusetionDesc;

    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId == null ? null : questionId.trim();
    }

    public String getQusetionDesc() {
        return qusetionDesc;
    }

    public void setQusetionDesc(String qusetionDesc) {
        this.qusetionDesc = qusetionDesc == null ? null : qusetionDesc.trim();
    }
}