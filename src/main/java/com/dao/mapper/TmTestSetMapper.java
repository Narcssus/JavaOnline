package com.dao.mapper;

import com.entity.TmTestSet;
import com.entity.example.TmTestSetExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TmTestSetMapper {
    int countByExample(TmTestSetExample example);

    int deleteByExample(TmTestSetExample example);

    int deleteByPrimaryKey(String testId);

    int insert(TmTestSet record);

    int insertSelective(TmTestSet record);

    List<TmTestSet> selectByExample(TmTestSetExample example);

    TmTestSet selectByPrimaryKey(String testId);

    int updateByExampleSelective(@Param("record") TmTestSet record, @Param("example") TmTestSetExample example);

    int updateByExample(@Param("record") TmTestSet record, @Param("example") TmTestSetExample example);

    int updateByPrimaryKeySelective(TmTestSet record);

    int updateByPrimaryKey(TmTestSet record);
}