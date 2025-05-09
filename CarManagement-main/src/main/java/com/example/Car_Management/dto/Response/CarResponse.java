package com.example.Car_Management.dto.Response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
@NoArgsConstructor
public class CarResponse {
    private Integer id;
    private String brand;
    private String model;
    private String color;
    private Double engine;
    private Date created;
    private String gear;
    private String year;
    private Double price;
    private Integer mileage;
    private String city;
    private String banType;
    private Boolean newOrOld;
    private String transmission;
    private Integer seats;
    private Integer owners;
    private String country;
    private String status;

    public CarResponse(Integer id, String brand, String model, String color, Double engine, Date created, String gear, String year, Double price, Integer mileage, String city, String banType, Boolean newOrOld, String transmission, Integer seats, Integer owners, String country, String status) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.engine = engine;
        this.created = created;  // created sahəsini əlavə etdik
        this.gear = gear;
        this.year = year;
        this.price = price;
        this.mileage = mileage;
        this.city = city;
        this.banType = banType;
        this.newOrOld = newOrOld;
        this.transmission = transmission;
        this.seats = seats;
        this.owners = owners;
        this.country = country;
        this.status = status;
    }


}
