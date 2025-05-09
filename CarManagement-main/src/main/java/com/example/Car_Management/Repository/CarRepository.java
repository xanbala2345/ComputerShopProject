package com.example.Car_Management.Repository;

import com.example.Car_Management.entity.CarDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<CarDetails,Integer> {
}
