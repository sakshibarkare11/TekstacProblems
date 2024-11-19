package com.entities;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

//Provide necessary Annotation wherever necessary
@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
public class Coach {

    // Provide necessary Annotation
	@Id
	@NotEmpty(message = "Provide value for coach id")
    private String coachId;
	@NotEmpty(message = "Provide value for coach name")
    private String coachName;
	@NotEmpty(message = "Provide value for coach type")
    private String coachType;
	@Min(value = 0 , message = "Additional charges should be positive or zero")
    private double additionalCharges;
	@Min(value = 1 , message = "Seat capacity should be positive and nonzero")
    private int seatCapacity;
	@FutureOrPresent(message = "Next maintenance date should be current or future date")
    private LocalDate nextMaintenanceDate;
    // Provide necessary Annotations
	@ManyToOne
	@JoinColumn(name = "train_id")
	@JsonIgnore
    private Train trainObj;
    
    
    public Coach()
    {
    	
    }
}
