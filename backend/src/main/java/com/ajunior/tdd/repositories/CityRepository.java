package com.ajunior.tdd.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ajunior.tdd.entities.City;

public interface CityRepository extends JpaRepository<City, Long>{

}
