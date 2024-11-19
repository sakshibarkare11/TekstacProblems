package com.controller;


import java.util.List;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.entities.Coach;
import com.exception.InvalidCoachException;
import com.exception.InvalidTrainException;
import com.service.ICoachService;

import jakarta.validation.Valid;

//Provide necessary Annotation
@RestController
public class CoachController {

    //Provide necessary Annotation
	@Autowired
    private ICoachService coachService;
    
    // Provide necessary Annotation and fill code in the below methods

 
	@PostMapping("/addCoach")
    public ResponseEntity<Coach> addCoach(@Valid @RequestBody Coach coach,@PathVariable String trainId) throws InvalidTrainException {
       
	    Coach c1 = coachService.addCoach(coach, trainId);
		return ResponseEntity.ok(c1);
    }

   
  
	@PutMapping("/updateNextMaintenanceDate/{coachId}/{nextMaintenanceDate}")
    public ResponseEntity<Coach> updateNextMaintenanceDate(@PathVariable String coachId,@PathVariable LocalDate nextMaintenanceDate) throws InvalidCoachException {

		Coach c2 = coachService.updateNextMaintenanceDate(coachId, nextMaintenanceDate);
	    return ResponseEntity.ok(c2);
    }

  
	@GetMapping("/viewCoachesBySeatCapacity/{seatCapacity}")
    public ResponseEntity<List<Coach>> viewCoachesBySeatCapacity(@PathVariable int seatCapacity) {
		List<Coach> c3 = coachService.viewCoachesBySeatCapacity(seatCapacity);
	    return ResponseEntity.ok(c3);
    }

   
	@GetMapping("/viewCoachesByTrainId/{trainId}")
    public ResponseEntity<List<Coach>> viewCoachesByTrainId(@PathVariable String trainId) {
		List<Coach> c4 = coachService.viewCoachesByTrainId(trainId);
	    return ResponseEntity.ok(c4);
    }

 
	@DeleteMapping("/removeCoach/{coachId}")
    public ResponseEntity<Coach> removeCoach(@PathVariable String coachId) throws InvalidCoachException {
        Coach c5 = coachService.removeCoach(coachId);
	return ResponseEntity.ok(c5);
    }
}
