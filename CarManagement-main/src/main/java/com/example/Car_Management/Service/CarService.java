package com.example.Car_Management.Service;

import com.example.Car_Management.dto.Request.CarRequest;
import com.example.Car_Management.entity.CarDetails;
import com.example.Car_Management.dto.Response.CarResponse;

import java.util.List;

public interface CarService {
  public List<CarResponse> getAllCars(int page,int count);
  public CarResponse GetCarByID(Integer id);
  public String DeleteCarByID(Integer id);
  public String AddCar(CarRequest carRequest);
  public String UpdateCar(Integer id,CarDetails carDetails);
}
