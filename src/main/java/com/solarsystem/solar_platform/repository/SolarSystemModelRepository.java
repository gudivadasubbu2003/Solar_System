package com.solarsystem.solar_platform.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.solarsystem.solar_platform.model.SolarSystemModel;

@Repository
public interface SolarSystemModelRepository extends JpaRepository<SolarSystemModel, Long> {

}
