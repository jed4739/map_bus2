package com.example.map_bus.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

/*
 *	도시 코드
 *	cityCode: 도시코드
 * 	cityNm: 도시명
 * */
@Entity
@Data
@NoArgsConstructor
public class CityCode {
	@Id
	@Column(name = "city_code")
	private String cityCode;

	@Column(name = "city_nm")
	private String cityNm;
}
