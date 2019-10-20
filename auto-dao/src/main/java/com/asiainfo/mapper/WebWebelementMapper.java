package com.asiainfo.mapper;

import com.asiainfo.entity.WebWebelement;
import com.asiainfo.entity.WebWebelementExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WebWebelementMapper {
    int countByExample(WebWebelementExample example);

    int deleteByExample(WebWebelementExample example);

    int insert(WebWebelement record);

    int insertSelective(WebWebelement record);

    List<WebWebelement> selectByExample(WebWebelementExample example);

    int updateByExampleSelective(@Param("record") WebWebelement record, @Param("example") WebWebelementExample example);

    int updateByExample(@Param("record") WebWebelement record, @Param("example") WebWebelementExample example);
}