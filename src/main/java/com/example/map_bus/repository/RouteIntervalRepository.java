package com.example.map_bus.repository;


import com.example.map_bus.model.RouteInterval;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RouteIntervalRepository extends JpaRepository<RouteInterval, String> {

}
