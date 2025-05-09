package com.example.Car_Management.Controller;

import com.example.Car_Management.Exception.UserNotFound;
import com.example.Car_Management.dto.Request.CarRequest;
import com.example.Car_Management.entity.CarDetails;
import com.example.Car_Management.ServiceImpl.ServiceImpl;
import com.example.Car_Management.dto.Response.CarResponse;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Car")
public class CarController {
    ServiceImpl service;

    public CarController(ServiceImpl service) {
        this.service = service;
    }

    @PostMapping("/add")
    public String addCar(@Valid  @RequestBody CarRequest carRequest) {

        return service.AddCar(carRequest);
    }

    @PutMapping("/update/{id}")
    public String updateCar(@PathVariable Integer id, @RequestBody CarDetails carDetails) {
        return service.UpdateCar(id, carDetails);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteCar(@PathVariable Integer id) {

        return service.DeleteCarByID(id);
    }

    @GetMapping("/all")
    public List<CarResponse> getAllCars(@RequestParam(value="page") int page,@RequestParam(value = "count") int count) {

            return service.getAllCars(page,count);

    }

    @GetMapping("/{id}")
    public CarResponse getCarById(@PathVariable Integer id) {
        return service.GetCarByID(id);
    }
}
