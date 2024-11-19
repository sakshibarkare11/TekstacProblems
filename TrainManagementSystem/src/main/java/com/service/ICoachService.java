


package com.service;

import java.time.LocalDate;
import java.util.List;

import com.entities.Coach;
import com.exception.InvalidCoachException;
import com.exception.InvalidTrainException;

public interface ICoachService {
    public Coach addCoach(Coach coach, String trainId) throws InvalidTrainException;
    public Coach updateNextMaintenanceDate(String coachId, LocalDate nextMaintenanceDate) throws InvalidCoachException;
    public List<Coach> viewCoachesBySeatCapacity(int seatCapacity);
    public List<Coach> viewCoachesByTrainId(String trainId);
    public Coach removeCoach(String coachId) throws InvalidCoachException;
}
