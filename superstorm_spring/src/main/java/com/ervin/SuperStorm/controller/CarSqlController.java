package com.ervin.SuperStorm.controller;

import com.ervin.SuperStorm.po.Car;
import com.ervin.SuperStorm.service.CarSqlService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;
import com.github.pagehelper.PageInfo;

@RestController
//@RequestMapping("api")
public class CarSqlController {
    @Resource
    private CarSqlService carSqlService;

    // 搜索所有车 {code,msg,page:{current,total,pageSize,pageSizeOpts},table:{col,data}}
    @GetMapping("car")
    public PageInfo<Car> getAllCar(@RequestParam(value="current", required=false, defaultValue = "1") Integer current,
                                     @RequestParam(value="pageSize", required=false, defaultValue = "10") Integer pageSize){
        PageInfo<Car> carPageInfo;
        // 分页查全部车
        carPageInfo = carSqlService.getAllCar(current,pageSize);
        return carPageInfo;
    }

    // 搜索特定车
    @GetMapping("car/{carId:\\d+}")
    public Map<String,Object> getCar(@PathVariable Integer carId,
                                     @RequestParam(value="current", required=false, defaultValue = "1") Integer current,
                                     @RequestParam(value="pageSize", required=false, defaultValue = "10") Integer pageSize){
        Map<String,Object> map = new HashMap();
        map.put("code",200);
        map.put("msg","succeed");
        PageInfo<Car> carPageInfo;
        // 分页查一辆车
        carPageInfo = carSqlService.getOneCar(carId,current,pageSize);
        map.put("data",carPageInfo);
        return map;
    }

    @PostMapping("car")
    public Map<String,Object> createCar(@RequestBody Car carObj){
        carSqlService.createCar(carObj);
        Map<String,Object> map = new HashMap();
        map.put("code",200);
        map.put("msg","succeed");
        return null;
    }

    @PutMapping("car")
    public Map<String,Object> updateCar(@RequestBody Car carObj){
        carSqlService.updateCar(carObj);
        Map<String,Object> map = new HashMap();
        map.put("code",200);
        map.put("msg","succeed");
        return null;
    }

    @DeleteMapping("car/{carId}")
    public Map<String,Object> deleteCar(@PathVariable Integer carId){
        carSqlService.deleteCar(carId);
        Map<String,Object> map = new HashMap();
        map.put("code",200);
        map.put("msg","succeed");
        return null;
    }
}
