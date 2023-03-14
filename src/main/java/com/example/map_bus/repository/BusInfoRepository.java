package com.example.map_bus.repository;

import com.example.map_bus.model.BusInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusInfoRepository extends JpaRepository<BusInfo, String> {

}
