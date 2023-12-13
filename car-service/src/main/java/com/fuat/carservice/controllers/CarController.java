package com.fuat.carservice.controllers;

import com.fuat.carservice.business.abstracts.CarService;
import com.fuat.carservice.entities.Car;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/cars")
@RequiredArgsConstructor
public class CarController {
    private final CarService carService;

    @PostMapping ("/addCar")
    public ResponseEntity<Car> addCar(@RequestBody Car car){
        Car addCar = carService.addCar(car);
        return ResponseEntity.status(HttpStatus.OK).body(addCar);
    }
}
