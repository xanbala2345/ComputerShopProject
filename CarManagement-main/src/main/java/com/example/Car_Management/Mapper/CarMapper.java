package com.example.Car_Management.Mapper;

import com.example.Car_Management.dto.Request.CarRequest;
import com.example.Car_Management.dto.Response.CarResponse;
import com.example.Car_Management.entity.CarDetails;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CarMapper {

    CarResponse toCarResponse(CarDetails carDetails);

    CarDetails toCarEntity(CarRequest carRequest);

    List<CarResponse> toCarResponseList(List<CarDetails> carDetailsList);
}