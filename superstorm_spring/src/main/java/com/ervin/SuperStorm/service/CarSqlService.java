package com.ervin.SuperStorm.service;

import com.ervin.SuperStorm.dao.CarSqlDao;
import com.ervin.SuperStorm.po.Car;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CarSqlService {
    @Resource
    CarSqlDao carSqlDao;

    public PageInfo<Car> getAllCar(Integer current, Integer pageSize){
        PageHelper.startPage(current,pageSize);// 分页
        List<Car> carList = carSqlDao.getAllCar(); // 查询
        PageInfo<Car> pageInfo = new PageInfo<>(carList);
        return pageInfo;
    }

    public PageInfo<Car> getOneCar(Integer carId,Integer current,Integer pageSize){
        PageHelper.startPage(current,pageSize);// 分页
        List<Car> carList = carSqlDao.getOneCar(carId); // 查询
        PageInfo<Car> pageInfo = new PageInfo<>(carList);
        return pageInfo;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void createCar(Car car){
        carSqlDao.createCar(car);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void updateCar(Car car){
        carSqlDao.updateCar(car);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void deleteCar(Integer userId){
        carSqlDao.deleteCar(userId);
    }
}
