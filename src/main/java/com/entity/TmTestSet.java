package com.entity;

import javax.validation.constraints.*;
import lombok.Data;

/**
 * tm_test_set
 * 1234
 * 
 * @author Narc
 * @date 2020-03-08
 */
@Data
public class TmTestSet {
    /**
     * TEST_ID
     * 主键
     */
    @Size(max=64)
    @NotNull
    private String testId;

    /**
     * QUESTION_ID
     * 问题编号
     */
    @Size(max=64)
    private String questionId;

    /**
     * TEST_INPUT
     * 测试集输入
     */
    @Size(max=255)
    private String testInput;

    /**
     * TEST_OUTPUT
     * 
     */
    @Size(max=255)
    private String testOutput;
}