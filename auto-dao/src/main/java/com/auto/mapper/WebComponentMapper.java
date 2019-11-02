package com.auto.mapper;

import com.auto.entity.WebComponent;
import com.auto.entity.WebComponentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WebComponentMapper {
    int countByExample(WebComponentExample example);

    int deleteByExample(WebComponentExample example);

    int insert(WebComponent record);

    int insertSelective(WebComponent record);

    List<WebComponent> selectByExample(WebComponentExample example);

    int updateByExampleSelective(@Param("record") WebComponent record, @Param("example") WebComponentExample example);

    int updateByExample(@Param("record") WebComponent record, @Param("example") WebComponentExample example);
}