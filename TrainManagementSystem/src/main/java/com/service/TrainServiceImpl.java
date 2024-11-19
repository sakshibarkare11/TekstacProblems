

package com.service;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entities.Train;
import com.exception.InvalidTrainException;
import com.repository.TrainRepository;

@Service
public class TrainServiceImpl implements ITrainService {

    // Provide necessary Annotation
	@Autowired
    private TrainRepository trainRepository;

   
//    public Train addTrain(Train train) {
//        return trainRepository.save(train);
//    }
//
//  
//    public Train updateBaseFare(String trainId, double baseFare) throws InvalidTrainException {
//      	
//	    // fill code
//    	Train train = trainRepository.findById(trainId).orElseThrow(()-> new InvalidTrainException());
//    	train.setBaseFare(baseFare);
//    	
//    	
//	    return trainRepository.save(train);
//    }
//
//   
//    public Train viewTrainById(String trainId) throws InvalidTrainException {
//       	
//	    // fill code
//    	Train train = trainRepository.findById(trainId).orElseThrow(()-> new InvalidTrainException());
//	    return train;
//    }
//
//  
//    public List<Train> viewTrainsBySourceAndDestination(String source, String destination) {
//        	
//	    // fill code
//    	List<Train> train1 = trainRepository.findBySourceAndDestination(source,destination);
//	    return train1;
//    }
//
//   
//    public Map<String, Integer> getTrainWiseTotalSeatCapacity() {
//    		
//	    // fill code
//    	
//	    return null;
//    }
	
	public Train addTrain(Train train) {
		return trainRepository.save(train);
    }

  
    public Train updateBaseFare(String trainId, double baseFare) throws InvalidTrainException {
      	
	    // fill code
    	Train t1 = trainRepository.findById(trainId).orElseThrow(()-> new InvalidTrainException());
    	t1.setBaseFare(baseFare);
    	return t1;
    }

   
    public Train viewTrainById(String trainId) throws InvalidTrainException {
	    // fill code
    	Train t2= trainRepository.findById(trainId).orElseThrow(()-> new InvalidTrainException());
    	return t2;
    }

  
    public List<Train> viewTrainsBySourceAndDestination(String source, String destination) {
	    // fill code
    	List <Train> t1= trainRepository.findBySourceAndDestination(source, destination);
    	return t1;
    }

   
    public Map<String, Integer> getTrainWiseTotalSeatCapacity() {
	    // fill code
//    	List<Object[]> trainwise = trainRepository.findByTrainWiseTotalSeatCapacity();
//		Map<String, Integer> map= new HashMap<>();
//		for (Object[] objects : trainwise) {
//			
//			String id= (String) objects[0];
//			Double sum= (Integer) objects[1];
//			map.put(id, sum);
//		}
//		return map;
	    return null;
    }
}
