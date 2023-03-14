package com.example.map_bus.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

/*
 *	버스 위치
 *	stopId: 정류소 위치
 * 	busId: 차량 번호
 * 	routeNm: 노선명
 * 	routeTp: 노선유형
 * 	stopNm: 정류소 이름
 * 	stopOrd: 정류소 순서
 *  gpsX: X좌표
 *  gpsY: Y좌표
 * */
@Entity
@Data
@NoArgsConstructor
public class BusLocation {
	@ManyToOne
	@JoinColumn(name = "stop_id")
	private StopInfo stopId;

	@ManyToOne
	@JoinColumn(name = "bus_id")
	private BusInfo busId;

	@Column(name = "route_nm")
	private String routeNm;

	@Column(name = "route_tp")
	private String routeTp;

	@Column(name = "stop_nm")
	private String stopNm;

	@Column(name = "stop_ord")
	private int stopOrd;

	@Column(name = "gps_x")
	private float gpsX;

	@Column(name = "gps_y")
	private float gpsY;
}
