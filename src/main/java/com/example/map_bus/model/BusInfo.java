package com.example.map_bus.model;

import lombok.Data;

import javax.persistence.*;

/*
 *  버스 정보
 *  busId: 차량 번호
 *  routId: 노선 ID
 * */
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
