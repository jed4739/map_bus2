package com.example.map_bus.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

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
