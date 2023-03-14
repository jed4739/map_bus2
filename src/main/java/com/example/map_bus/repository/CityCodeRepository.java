package com.example.map_bus.repository;

import com.example.map_bus.model.CityCode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityCodeRepository extends JpaRepository<CityCode, String> {

}
