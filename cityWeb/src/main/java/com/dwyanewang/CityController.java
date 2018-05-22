/**
 * CopyRight (C)  2017-2018  武汉文思特信息工程有限公司
 * Author : WangWei
 * CreateTime : 2018/05/22 16:22
 * ProjectName : multimodule-mybatis-all
 * Description : CityController
 * Version : V1.0
 */
package com.dwyanewang;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CityController {
    private final CityService cityService;

    @Autowired
    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    @RequestMapping("/api/list")
    public List<City> getList(City pojo){
        return cityService.select(pojo);
    }

    @RequestMapping("/api/update")
    public int updateCity(City pojo){
        return cityService.update(pojo);
    }

    @RequestMapping("api/insert")
    public int insertCity(City pojo){
        return cityService.insert(pojo);
    }

    @RequestMapping("api/delete/{id}")
    public int deleteCity(@PathVariable("id") Long id){
        return cityService.delete(id);
    }
}
