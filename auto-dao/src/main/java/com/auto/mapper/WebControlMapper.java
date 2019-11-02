package com.auto.mapper;

import com.auto.entity.WebControl;
import com.auto.entity.WebControlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WebControlMapper {
    int countByExample(WebControlExample example);

    int deleteByExample(WebControlExample example);

    int deleteByPrimaryKey(Integer controlid);

    int insert(WebControl record);

    int insertSelective(WebControl record);

    List<WebControl> selectByExample(WebControlExample example);

    WebControl selectByPrimaryKey(Integer controlid);

    int updateByExampleSelective(@Param("record") WebControl record, @Param("example") WebControlExample example);

    int updateByExample(@Param("record") WebControl record, @Param("example") WebControlExample example);

    int updateByPrimaryKeySelective(WebControl record);

    int updateByPrimaryKey(WebControl record);
}