package com.data.mapper;

import com.data.model.Geo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GeoMapperExt extends GeoMapper {
    int count();
    Geo one(@Param("lat") double lat, @Param("lon") double lon, @Param("third")int a);
    List<Geo> some(@Param("alt") long alt);
}
