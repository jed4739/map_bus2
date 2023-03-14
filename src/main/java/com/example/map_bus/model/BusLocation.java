package com.example.map_bus.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

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
