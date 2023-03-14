package com.example.map_bus.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StopInfo extends JpaRepository<StopInfo, String> {

}
