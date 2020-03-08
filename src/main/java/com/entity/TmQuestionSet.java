package com.entity;

import javax.validation.constraints.*;
import lombok.Data;

/**
 * tm_question_set
 * 问题集合表
 * 
 * @author Narc
 * @date 2020-03-08
 */
@Data
public class TmQuestionSet {
    /**
     * QUESTION_ID
     * 主键
     */
    @Size(max=64)
    @NotNull
    private String questionId;

    /**
     * QUESTION_DESC
     * 问题描述
     */
    @Size(max=255)
    private String questionDesc;
}