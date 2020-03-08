package com.dao.service;

import com.dao.mapper.TmTestSetMapper;
import com.dao.mapper.TmTestSetMapperExtend;
import com.entity.TmTestSet;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * DaoService
 * @author NarcMybatisGenerator
 * @date 2020-03-08
 */
@Service
public class TmTestSetDaoService {
    @Resource
    private TmTestSetMapper tmTestSetMapper;

    @Resource
    private TmTestSetMapperExtend tmTestSetMapperExtend;
}