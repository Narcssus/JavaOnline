package com.dao.mapper;

import com.dao.entity.TestDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestDTOMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TestDTO record);

    int insertSelective(TestDTO record);

    TestDTO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TestDTO record);

    int updateByPrimaryKeyWithBLOBs(TestDTO record);
}