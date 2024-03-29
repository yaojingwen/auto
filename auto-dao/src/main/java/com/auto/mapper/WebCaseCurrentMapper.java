package com.auto.mapper;

import com.auto.entity.WebCaseCurrent;
import com.auto.entity.WebCaseCurrentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WebCaseCurrentMapper {
    int countByExample(WebCaseCurrentExample example);

    int deleteByExample(WebCaseCurrentExample example);

    int insert(WebCaseCurrent record);

    int insertSelective(WebCaseCurrent record);

    List<WebCaseCurrent> selectByExample(WebCaseCurrentExample example);

    int updateByExampleSelective(@Param("record") WebCaseCurrent record, @Param("example") WebCaseCurrentExample example);

    int updateByExample(@Param("record") WebCaseCurrent record, @Param("example") WebCaseCurrentExample example);
}