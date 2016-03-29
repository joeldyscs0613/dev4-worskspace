package com.angularjspractice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.angularjspractice.model.Shipwreck;

public interface ShipwreckRepository extends JpaRepository<Shipwreck, Long> {

	
}
