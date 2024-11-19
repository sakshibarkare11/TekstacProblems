package com.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entities.Coach;
import com.entities.Train;
import com.exception.InvalidCoachException;
import com.exception.InvalidTrainException;
import com.repository.CoachRepository;
import com.repository.TrainRepository;

@Service
public class CoachServiceImpl implements ICoachService {

    // Provide necessary Annotation
	@Autowired
    private CoachRepository coachRepository;

    // Provide necessary Annotation
	@Autowired
    private TrainRepository trainRepository;
  
   
    public Coach addCoach(Coach coach, String trainId) throws InvalidTrainException {
     
		// Fill the code
    	Train train11 = trainRepository.findById(trainId).orElseThrow(()-> new InvalidTrainException());
    	coach.setTrainObj(train11);
		
    	return coachRepository.save(coach);
    }

  
    public Coach updateNextMaintenanceDate(String coachId, LocalDate nextMaintenanceDate) throws InvalidCoachException {
       
		// Fill the code
    	Coach coach11 = coachRepository.findById(coachId).orElseThrow(()-> new InvalidCoachException());
    	coach11.setNextMaintenanceDate(nextMaintenanceDate);
		return coachRepository.save(coach11);
    }

   
    public List<Coach> viewCoachesBySeatCapacity(int seatCapacity) {
       
		// Fill the code
//    	List<Coach> coach2 = coachRepository.findBySeatCapacity(seatCapacity);
//		return coach2;
    	return null;
    }

   
    public List<Coach> viewCoachesByTrainId(String trainId) {
       
		// Fill the code
//    	List<Coach> coach3 = coachRepository.findByTrainId(trainId);
//		return coach3;
    	return null;
    }

   
    public Coach removeCoach(String coachId) throws InvalidCoachException {
        
		// Fill the code
    	Coach coach4 = coachRepository.findById(coachId).orElseThrow(()-> new InvalidCoachException());
    	coach4.getCoachId();
		coachRepository.delete(coach4);
		 return coach4;
    }
}
