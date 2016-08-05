package com.data.mapper;

import com.data.model.Score;
import com.data.model.ScoreExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScoreMapper {
    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: score
     * @author MyBatis Generator
     */
    int countByExample(ScoreExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: score
     * @author MyBatis Generator
     */
    int deleteByExample(ScoreExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: score
     * @author MyBatis Generator
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: score
     * @author MyBatis Generator
     */
    int insert(Score record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: score
     * @author MyBatis Generator
     */
    int insertSelective(Score record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: score
     * @author MyBatis Generator
     */
    List<Score> selectByExample(ScoreExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: score
     * @author MyBatis Generator
     */
    Score selectByPrimaryKey(Integer id);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: score
     * @author MyBatis Generator
     */
    int updateByExampleSelective(@Param("record") Score record, @Param("example") ScoreExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: score
     * @author MyBatis Generator
     */
    int updateByExample(@Param("record") Score record, @Param("example") ScoreExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: score
     * @author MyBatis Generator
     */
    int updateByPrimaryKeySelective(Score record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: score
     * @author MyBatis Generator
     */
    int updateByPrimaryKey(Score record);
}