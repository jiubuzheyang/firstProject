package com.study.myfirst.service;

import com.study.myfirst.MongoDBRepository.CarRepository;
import com.study.myfirst.dao.HelloMapper;
import com.study.myfirst.entity.Car;
import com.study.myfirst.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 91202
 */
@Service
public class HelloServiceImpl implements HelloService {

    @Autowired
    private CarRepository carRepository;

    @Autowired
    private HelloMapper mapper;

    @Override
    public void setCar() {
        Car car = new Car();
        car.setId(2L);
        car.setName("宝马");
        car.setPrice("$5000.00");
        carRepository.save(car);
    }

    @Override
    public void setUser() {
        User user = new User(1, "张三", "123@email.com", 1);
        mapper.insert(user);
    }

}
