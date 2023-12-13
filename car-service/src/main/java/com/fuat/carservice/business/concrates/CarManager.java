package com.fuat.carservice.business.concrates;

import com.fuat.carservice.business.abstracts.CarService;
import com.fuat.carservice.entities.Car;
import com.fuat.carservice.repositories.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class CarManager implements CarService {
    private final CarRepository carRepository;

    @Override
    public List<Car> getAll(){
        return carRepository.findAll();
    }

    @Override
    public Optional<Car> findById(String carId){
     return carRepository.findById(carId);
    }
    @Override
    public Car addCar(Car car){
        return carRepository.save(car);
    }

}
