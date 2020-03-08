package com.dao.service;

import com.dao.mapper.TmQuestionSetMapper;
import com.dao.mapper.TmQuestionSetMapperExtend;
import com.entity.TmQuestionSet;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * DaoService
 * @author NarcMybatisGenerator
 * @date 2020-03-08
 */
@Service
public class TmQuestionSetDaoService {
    @Resource
    private TmQuestionSetMapper tmQuestionSetMapper;

    @Resource
    private TmQuestionSetMapperExtend tmQuestionSetMapperExtend;
}