package com.data.service;

import com.data.mapper.GeoMapperExt;
import com.data.mapper.ScoreMapperExt;
import com.data.model.Geo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2016/6/15.
 */
@Service
public class TestService {

    @Autowired
    private GeoMapperExt geoMapperExt;

    @Autowired
    private ScoreMapperExt scoreMapperExt;

    public long test() {
        int count = geoMapperExt.count();

        int countScore = scoreMapperExt.count();
        System.out.println(count);

        Geo getOne = geoMapperExt.one(39.984702, 116.318417, 0);

        int scoreCount = scoreMapperExt.count();

        return getOne.getAltitude();
    }

    public int scoreCount(){
        int scoreCount = scoreMapperExt.count();
        return scoreCount;
    }

    public int altCount(){
        return geoMapperExt.some(492).size();
    }

    public List<Geo> altSome(){
        return geoMapperExt.some(492);
    }

}
