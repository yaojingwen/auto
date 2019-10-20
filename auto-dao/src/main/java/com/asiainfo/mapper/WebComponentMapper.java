package com.asiainfo.mapper;

import com.asiainfo.entity.WebComponent;
import com.asiainfo.entity.WebComponentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WebComponentMapper {
    int countByExample(WebComponentExample example);

    int deleteByExample(WebComponentExample example);

    int insert(WebComponent record);

    int insertSelective(WebComponent record);

    List<WebComponent> selectByExample(WebComponentExample example);

    int updateByExampleSelective(@Param("record") WebComponent record, @Param("example") WebComponentExample example);

    int updateByExample(@Param("record") WebComponent record, @Param("example") WebComponentExample example);
}