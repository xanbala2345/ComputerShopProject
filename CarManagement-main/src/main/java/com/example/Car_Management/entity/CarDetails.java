package com.example.Car_Management.entity;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.sql.Date;

@Entity
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CarDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    Integer id;
    @Column(name = "Brand")
    String brand;

    @Column(name = "Model")
    @NotEmpty(message="Bos qoyula bilmez")

    String model;
    @Column(name = "Color")
    String color;
    @Column(name = "Engine")
    Double engine;
    @Column(name="Created")
    Date created;
    @Column(name = "GearBox")
    String gear;
    @Column(name = "Year")
    String year;
    @Column(name = "Price")
    Double price;
    @Column(name = "Mileage")
    Integer mileage;
    @Column(name="City")
    String city;
    @Column(name="Ban-type")
    String BanType;
    @Column(name="NewOrOld")
    Boolean newOrOld;
    @Column(name="Transmission")
    String Transmission;
    @Column(name="Seats")
    Integer seats;
    @Column(name="Owners")
    Integer Owners;
    @Column(name="Country")
      String Country;
    @Column(name="Status")
    String Status;

}
