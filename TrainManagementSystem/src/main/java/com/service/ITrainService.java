

package com.service;

import java.util.List;
import java.util.Map;

import com.entities.Train;
import com.exception.InvalidTrainException;

public interface ITrainService {
    public Train addTrain(Train train);
    public Train updateBaseFare(String trainId, double baseFare) throws InvalidTrainException;
    public Train viewTrainById(String trainId) throws InvalidTrainException;
    public List<Train> viewTrainsBySourceAndDestination(String source, String destination);
    public Map<String, Integer> getTrainWiseTotalSeatCapacity();
}
