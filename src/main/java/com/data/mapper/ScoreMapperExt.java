package com.data.mapper;

import org.springframework.stereotype.Repository;

@Repository
public interface ScoreMapperExt extends ScoreMapper {
    int count();
}
