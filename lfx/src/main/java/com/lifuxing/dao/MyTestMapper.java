package com.lifuxing.dao;

import com.lifuxing.entity.MyTest;
import com.lifuxing.entity.MyTestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MyTestMapper {
    int countByExample(MyTestExample example);

    int deleteByExample(MyTestExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MyTest record);

    int insertSelective(MyTest record);

    List<MyTest> selectByExample(MyTestExample example);

    MyTest selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MyTest record, @Param("example") MyTestExample example);

    int updateByExample(@Param("record") MyTest record, @Param("example") MyTestExample example);

    int updateByPrimaryKeySelective(MyTest record);

    int updateByPrimaryKey(MyTest record);
}