package com.example.map_bus.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

/*
 *	배차 간격
 *	routeId: 노선 ID
 * 	startVehicleTime: 첫차시간
 * 	endVehicleTime: 막차시간
 * 	intervalTime: 배차간격(평일)
 * 	intervalSatTime: 배차간격(토요일)
 * 	intervalSunTime: 배차간격(일요일)
 * */
@Entity
@Data
@NoArgsConstructor
public class RouteInterval {
	@ManyToOne
	@JoinColumn(name = "route_id")
	private RouteInfo routeId;

	@Column(name = "start_vehicle_time")
	private int startVehicleTime;

	@Column(name = "end_vehicle_time")
	private int endVehicleTime;

	@Column(name = "interval_time")
	private int intervalTime;

	@Column(name = "interval_sat_time")
	private int intervalSatTime;

	@Column(name = "interval_sun_time")
	private int intervalSunTime;
}
