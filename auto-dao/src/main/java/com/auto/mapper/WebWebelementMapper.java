package com.auto.mapper;

import com.auto.entity.WebWebelement;
import com.auto.entity.WebWebelementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WebWebelementMapper {
    int countByExample(WebWebelementExample example);

    int deleteByExample(WebWebelementExample example);

    int insert(WebWebelement record);

    int insertSelective(WebWebelement record);

    List<WebWebelement> selectByExample(WebWebelementExample example);

    int updateByExampleSelective(@Param("record") WebWebelement record, @Param("example") WebWebelementExample example);

    int updateByExample(@Param("record") WebWebelement record, @Param("example") WebWebelementExample example);
}