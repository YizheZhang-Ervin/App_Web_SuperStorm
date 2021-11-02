package com.ervin.SuperStorm.dao;

import com.ervin.SuperStorm.po.Car;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarSqlDao {
    List<Car> getAllCar();

    List<Car> getOneCar(Integer carId);

    void createCar(Car car);

    void updateCar(Car car);

    void deleteCar(Integer carId);
}
