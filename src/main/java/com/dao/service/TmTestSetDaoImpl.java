package com.dao.service;

import com.dao.TmTestSetDao;
import com.dao.mapper.TmTestSetMapper;
import com.entity.TmTestSet;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author : Narcssus
 * @date : 2020/3/7 15:14
 */
@Service
public class TmTestSetDaoImpl  {

    @Resource
    private TmTestSetMapper tmTestSetMapper;

    public void insert(TmTestSet record){
        tmTestSetMapper.insert(record);
    }

}
