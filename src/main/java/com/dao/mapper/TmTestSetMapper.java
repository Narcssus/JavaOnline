package com.dao.mapper;

import com.entity.TmTestSet;
import com.entity.TmTestSetExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author NarcMybatisGenerator
 * @date 2020-03-08
*/
@Mapper
public interface TmTestSetMapper {
    long countByExample(TmTestSetExample example);

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