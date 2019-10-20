package com.asiainfo.mapper;

import com.asiainfo.entity.WebCaseHis;
import com.asiainfo.entity.WebCaseHisExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WebCaseHisMapper {
    int countByExample(WebCaseHisExample example);

    int deleteByExample(WebCaseHisExample example);

    int insert(WebCaseHis record);

    int insertSelective(WebCaseHis record);

    List<WebCaseHis> selectByExample(WebCaseHisExample example);

    int updateByExampleSelective(@Param("record") WebCaseHis record, @Param("example") WebCaseHisExample example);

    int updateByExample(@Param("record") WebCaseHis record, @Param("example") WebCaseHisExample example);
}