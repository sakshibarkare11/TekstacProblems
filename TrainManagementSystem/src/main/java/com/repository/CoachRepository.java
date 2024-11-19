package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entities.Coach;

//Provide necessary annotation
@Repository
public interface CoachRepository extends JpaRepository<Coach, String> {

//	List<Coach> findBySeatCapacity(int seatCapacity);
//
//	List<Coach> findByTrainId(String trainId);

	// Provide necessary methods to view coaches by seatCapacity and to view coaches by train id
   
}
