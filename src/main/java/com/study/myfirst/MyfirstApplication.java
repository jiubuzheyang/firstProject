package com.study.myfirst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
//@EnableMongoRepositories(basePackages = "com.study.myfirst.MongoDBRepository")
public class MyfirstApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyfirstApplication.class, args);
    }

}
