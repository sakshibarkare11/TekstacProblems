

package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.entities.Train;

//Provide necessary annotation
@Repository
public interface TrainRepository extends JpaRepository<Train, String> {

	List<Train> findBySourceAndDestination(String source, String destination);

//	@Query(value = "select c.trainId, sum(r.distance) from train c join ride r using(car_id) group by c.car_id order by c.car_id", nativeQuery = true)
	List<Object[]> findByTrainWiseTotalSeatCapacity();
    

	// Provide necessary methods to view trains by source and destination and to get the total seatCapacity trainwise

    
}
