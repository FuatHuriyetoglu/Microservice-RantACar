package com.fuat.carservice.entities;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(value = "cars")
public class Car {
    @Id
    private String carID;

    private String carName;
    private String model;
    private String color;
    private String date;
    private Boolean carStatus;
    private double dailyPrice;



}
