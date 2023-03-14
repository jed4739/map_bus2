package com.example.map_bus.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

/*
 *	정류소 순서
 *	stopId: 정류소 ID
 * 	routeId: 노선 ID
 * 	stopOrd: 정류소 순서
 * 	upDownCd: 상하행 구분코드
 * */
@Entity
@Data
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
