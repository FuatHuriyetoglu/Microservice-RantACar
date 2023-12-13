package com.fuat.carservice.repositories;

import com.fuat.carservice.entities.Car;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CarRepository extends MongoRepository <Car, String> {
}
