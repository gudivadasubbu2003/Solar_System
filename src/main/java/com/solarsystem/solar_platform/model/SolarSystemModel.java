package com.solarsystem.solar_platform.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "solar_system_models")
public class SolarSystemModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long SolarModelId;
	private String SolarName;
	private double CapacityKW;
	private double Baseprice;
	private SolarType solarType;

	public Long getSolarModelId() {
		return SolarModelId;
	}

	public void setSolarModelId(Long solarModelId) {
		SolarModelId = solarModelId;
	}

	public String getSolarName() {
		return SolarName;
	}

	public void setSolarName(String solarName) {
		SolarName = solarName;
	}

	public double getCapacityKW() {
		return CapacityKW;
	}

	public void setCapacityKW(int capacityKW) {
		CapacityKW = capacityKW;
	}

	public double getBaseprice() {
		return Baseprice;
	}

	public void setBaseprice(int baseprice) {
		Baseprice = baseprice;
	}

	public SolarType getSolarType() {
		return solarType;
	}

	public void setSolarType(SolarType solarType) {
		this.solarType = solarType;
	}

}
