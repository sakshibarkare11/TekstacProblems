package com.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.entities.Train;
import com.exception.InvalidTrainException;
import com.service.ITrainService;

import jakarta.validation.Valid;

//Provide necessary Annotation
@RestController
public class TrainController {
    
    //Provide necessary Annotation
	@Autowired
    private ITrainService trainService;
		
    // Provide necessary Annotation and fill code in the below methods
    
  @PostMapping("/addTrain")
    public ResponseEntity<Train> addTrain(@Valid @RequestBody Train train) {
      Train t1 =   trainService.addTrain(train);
	  return ResponseEntity.ok(t1);
    }
    
   @PutMapping("/updateBaseFare/{trainId}/{baseFare}")
    public ResponseEntity<Train> updateBaseFare(@PathVariable String trainId,@PathVariable  double baseFare) throws InvalidTrainException {
       Train t2 = trainService.updateBaseFare(trainId, baseFare);
	   return ResponseEntity.ok(t2);
    }
    
 
   @GetMapping("/viewTrainById/{trainId}")
    public ResponseEntity<Train> viewTrainById(@PathVariable String trainId) throws InvalidTrainException {
	   Train t3 = trainService.viewTrainById(trainId);
	   return ResponseEntity.ok(t3);
    }
    
   @GetMapping("/viewTrainsBySourceAndDestination/{source}/{destination}")
    public ResponseEntity<List<Train>> viewTrainsBySourceAndDestination(@PathVariable String source,@PathVariable String destination) {
	   List<Train> t4 = trainService.viewTrainsBySourceAndDestination(source, destination);
	   return ResponseEntity.ok(t4);
    }
    
   
    public ResponseEntity<Map<String, Integer>> getTrainWiseTotalSeatCapacity() {
    	Map<String, Integer> t5 = trainService.getTrainWiseTotalSeatCapacity();
    	return ResponseEntity.ok(t5);
    }
}
