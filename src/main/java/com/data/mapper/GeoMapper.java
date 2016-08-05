package com.data.mapper;

import com.data.model.Geo;
import com.data.model.GeoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GeoMapper {
    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: geo
     * @author MyBatis Generator
     */
    int countByExample(GeoExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: geo
     * @author MyBatis Generator
     */
    int deleteByExample(GeoExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: geo
     * @author MyBatis Generator
     */
    int insert(Geo record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: geo
     * @author MyBatis Generator
     */
    int insertSelective(Geo record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: geo
     * @author MyBatis Generator
     */
    List<Geo> selectByExample(GeoExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: geo
     * @author MyBatis Generator
     */
    int updateByExampleSelective(@Param("record") Geo record, @Param("example") GeoExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: geo
     * @author MyBatis Generator
     */
    int updateByExample(@Param("record") Geo record, @Param("example") GeoExample example);
}