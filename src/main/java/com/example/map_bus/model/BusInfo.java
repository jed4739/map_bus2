package com.example.map_bus.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class BusInfo {
    @Id
    @Column(name = "bus_id")
    private String busId;

    @ManyToOne
    @JoinColumn(name = "route_id")
    private RouteInfo routId;
}
