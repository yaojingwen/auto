package com.auto.mapper;

import com.auto.entity.WebCase;
import com.auto.entity.WebCaseExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WebCaseMapper {
    int countByExample(WebCaseExample example);

    int deleteByExample(WebCaseExample example);

    int insert(WebCase record);

    int insertSelective(WebCase record);

    List<WebCase> selectByExample(WebCaseExample example);

    int updateByExampleSelective(@Param("record") WebCase record, @Param("example") WebCaseExample example);

    int updateByExample(@Param("record") WebCase record, @Param("example") WebCaseExample example);
}