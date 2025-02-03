package com.study.myfirst.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


/**
 * @author 91202
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collation = "car")
public class Car {

    @Id
    private long id;

    @Field("price")
    private String price;

    @Field("name")
    private String name;

}
