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
public class StopLocation {
	@ManyToOne
	@JoinColumn(name = "stop_id")
	private StopInfo stopId;
	
	@ManyToOne
	@JoinColumn(name = "city_code")
	private CityCode cityCode;

	@Column(name = "gps_x")
	private float gpsX;

	@Column(name = "gps_y")
	private float gpsY;
}
