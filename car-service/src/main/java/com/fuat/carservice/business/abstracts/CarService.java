package com.fuat.carservice.business.abstracts;

import com.fuat.carservice.entities.Car;

import java.util.List;
import java.util.Optional;

public interface CarService {
    List<Car> getAll();

    Optional<Car> findById(String carId);

    Car addCar(Car car);

}
