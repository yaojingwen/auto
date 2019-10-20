package com.asiainfo.mapper;

import com.asiainfo.entity.WebControl;
import com.asiainfo.entity.WebControlExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WebControlMapper {
    int countByExample(WebControlExample example);

    int deleteByExample(WebControlExample example);

    int insert(WebControl record);

    int insertSelective(WebControl record);

    List<WebControl> selectByExample(WebControlExample example);

    int updateByExampleSelective(@Param("record") WebControl record, @Param("example") WebControlExample example);

    int updateByExample(@Param("record") WebControl record, @Param("example") WebControlExample example);
}