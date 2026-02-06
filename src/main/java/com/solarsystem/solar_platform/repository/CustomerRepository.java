package com.solarsystem.solar_platform.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.solarsystem.solar_platform.model.Customer;

@Repository
 interface  CustomerRepository extends JpaRepository<Customer,Long> {
	
}
