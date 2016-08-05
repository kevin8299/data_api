package com.data.controller;

import com.data.model.Geo;
import com.data.service.TestService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import com.alibaba.fastjson.JSON;

/**
 * Created by Administrator on 2016/5/9.
 */
@Controller
public class MainController {

    @Autowired
    private TestService testService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        long count = testService.test();
        System.out.println("zgl ;  ------ " + testService.test());
        model.addAttribute("count" , count);
        model.addAttribute("scoreCount", testService.scoreCount());
        model.addAttribute("altCount", testService.altCount());
        return "index";
    }

    @RequestMapping(value = "/geoTest", method = RequestMethod.GET)
    @ResponseBody
    public String geoTest(){
        List<Geo> some = testService.altSome();
        String o = JSON.toJSONString(some);
        return o;
    }


}
