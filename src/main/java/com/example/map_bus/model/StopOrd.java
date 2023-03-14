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
public class StopOrd {
	@ManyToOne
	@JoinColumn(name = "stop_id")
	private StopInfo stopId;

	@ManyToOne
	@JoinColumn(name = "route_id")
	private RouteInfo routeId;

	@Column(name = "stop_ord")
	private int stopOrd;

	@Column(name = "up_down_cd")
	private String upDownCd;
}
