package com.cj.tangtuan.controller;

import com.cj.tangtuan.entity.other.Region;
import com.cj.tangtuan.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by XD on 2017/12/1.
 * 地区信息查询
 */
@Controller
public class RegionController {

    @Autowired
    private RegionService regionService;

    /**
     * 查询所有的地区，按格式封装
     * @return
     */
    @GetMapping("/Region")
    @ResponseBody
    public Object findRegion(){
        List<Region> initCityPicker = regionService.findAllProvinces();

        return initCityPicker;
    }

    //查询还没有省级代理的省。type=3，查询所有没有代理的省，type=33,查询所有的省
//    @GetMapping("/findProvinces")
    @ResponseBody
    public Object findProvinces(Integer type){
        return regionService.findProvinces(type);
    }

    //查询还没有市级代理的市。type=4，查询所有省下面没有代理的市，type=44,查询所有的省下面的市
//    @GetMapping("/findCity")
    @ResponseBody
    public Object findCity(String provinceid,Integer type){
        return regionService.findCity(provinceid,type);
    }

    //查询还没有区县级代理的区县。type=5，查询所有市下面没有代理的区县，type=55,查询所有的市下面的区县
//    @GetMapping("/findArea")
    @ResponseBody
    public Object findArea(String cityid,Integer type){
        return regionService.findArea(cityid,type);
    }
}
