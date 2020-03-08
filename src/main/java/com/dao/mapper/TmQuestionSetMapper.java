package com.dao.mapper;

import com.entity.TmQuestionSet;
import com.entity.TmQuestionSetExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author NarcMybatisGenerator
 * @date 2020-03-08
*/
@Mapper
public interface TmQuestionSetMapper {
    long countByExample(TmQuestionSetExample example);

    int deleteByExample(TmQuestionSetExample example);

    int deleteByPrimaryKey(String questionId);

    int insert(TmQuestionSet record);

    int insertSelective(TmQuestionSet record);

    List<TmQuestionSet> selectByExample(TmQuestionSetExample example);

    TmQuestionSet selectByPrimaryKey(String questionId);

    int updateByExampleSelective(@Param("record") TmQuestionSet record, @Param("example") TmQuestionSetExample example);

    int updateByExample(@Param("record") TmQuestionSet record, @Param("example") TmQuestionSetExample example);

    int updateByPrimaryKeySelective(TmQuestionSet record);

    int updateByPrimaryKey(TmQuestionSet record);
}