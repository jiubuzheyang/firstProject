package com.study.myfirst.MongoDBRepository;

import com.study.myfirst.entity.Car;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CarRepository extends MongoRepository<Car, Long> {
}
