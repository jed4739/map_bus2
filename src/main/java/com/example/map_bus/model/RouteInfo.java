package com.example.map_bus.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

/*
 *	노선 정보
 *	routeId: 노선 ID
 *  cityCode: 도시코드
 * 	routeNm: 노선명
 * 	routeTp: 노선유형
 * 	startStopNm: 기점
 * 	endStopNm: 종점
 * */
@Entity
@Data
@NoArgsConstructor
public class RouteInfo {
	@Id
	@Column(name = "route_id")
	private String routeId;

	@Id
	@ManyToOne
	@JoinColumn(name = "city_code")
	private CityCode cityCode;

	@Column(name = "route_nm")
	private String routeNm;

	@Column(name = "route_tp")
	private String routeTp;

	@Column(name = "start_stop_nm")
	private String startStopNm;

	@Column(name = "end_stop_nm")
	private String endStopNm;
}
