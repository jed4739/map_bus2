package com.example.map_bus.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class StopInfo {
	@Id
	@Column(name = "stop_id")
	private String stopId;

	@Column(name = "stop_nm")
	private String stopNm;

	@Column(name = "stop_no")
	private int stopNo;

	@Column(name = "route_id")
	private String routeId;
}
