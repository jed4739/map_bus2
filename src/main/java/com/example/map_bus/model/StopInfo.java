package com.example.map_bus.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

/*
 *	정류소 정보
 *	stopId: 정류소 ID
 * 	stopNm: 정류소명
 * 	stopNo: 정류소 번호
 * 	routeId: 노선 ID
 * */
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
