
package com.example.Car_Management.ServiceImpl;

import com.example.Car_Management.dto.Request.CarRequest;
import com.example.Car_Management.dto.Response.CarResponse;
import com.example.Car_Management.entity.CarDetails;
import com.example.Car_Management.Exception.UserNotFound;
import com.example.Car_Management.Repository.CarRepository;
import com.example.Car_Management.Service.CarService;
import com.example.Car_Management.Mapper.CarMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ServiceImpl implements CarService {

    private final CarRepository carRepository;
    private final CarMapper carMapper;

    public ServiceImpl(CarRepository carRepository, CarMapper carMapper) {
        this.carRepository = carRepository;
        this.carMapper = carMapper;
    }

    @Override
    public List<CarResponse> getAllCars(int page, int count) {
        Page<CarDetails> pagedCars = carRepository.findAll(PageRequest.of(page, count));
        return pagedCars.getContent().stream()
                .map(carMapper::toCarResponse)
                .collect(Collectors.toList());
    }
    @Override
    public CarResponse GetCarByID(Integer id) {
        return carRepository.findById(id)
                .stream()
                .map(carMapper::toCarResponse)
                .findFirst()
                .orElseThrow(() -> new UserNotFound("Car not found with id: " + id));
    }

    @Override
    public String DeleteCarByID(Integer id) {
        carRepository.deleteById(id);
        return "Car Deleted";
    }

    @Override
    public String AddCar(CarRequest carRequest) {
        CarDetails carDetails = carMapper.toCarEntity(carRequest);
        carRepository.save(carDetails);
        return "Car Added";
    }

    @Override
    public String UpdateCar(Integer id, CarDetails carDetails) {
        CarDetails existingCar = carRepository.findById(id)
                .orElseThrow(() -> new UserNotFound("Car not found with id: " + id));

        existingCar.setBrand(carDetails.getBrand());
        existingCar.setModel(carDetails.getModel());
        existingCar.setColor(carDetails.getColor());
        existingCar.setEngine(carDetails.getEngine());
        existingCar.setCreated(existingCar.getCreated());
        existingCar.setGear(carDetails.getGear());
        existingCar.setYear(carDetails.getYear());
        existingCar.setPrice(carDetails.getPrice());
        existingCar.setMileage(carDetails.getMileage());
        existingCar.setCity(carDetails.getCity());
        existingCar.setBanType(carDetails.getBanType());
        existingCar.setNewOrOld(carDetails.getNewOrOld());
        existingCar.setTransmission(carDetails.getTransmission());
        existingCar.setSeats(carDetails.getSeats());
        existingCar.setOwners(carDetails.getOwners());
        existingCar.setCountry(carDetails.getCountry());
        existingCar.setStatus(carDetails.getStatus());

        carRepository.save(existingCar);
        return "Car Updated";
    }
}
