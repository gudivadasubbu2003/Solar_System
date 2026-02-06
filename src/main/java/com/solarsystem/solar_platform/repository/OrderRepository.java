package com.solarsystem.solar_platform.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.solarsystem.solar_platform.model.Order;


@Repository
public interface OrderRepository extends JpaRepository<Order,Long>{

}
