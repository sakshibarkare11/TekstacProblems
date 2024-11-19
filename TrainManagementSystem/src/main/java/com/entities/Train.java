package com.entities;

import java.util.List;

import org.hibernate.validator.constraints.Range;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
public class Train {

    // Provide necessary Annotation
	@Id
	@NotEmpty(message = "Provide value for train id")
    private String trainId;
	@NotEmpty(message = "Provide value for train name")
    private String trainName;
	@NotEmpty(message = "Provide value for source")
    private String source;
	@NotEmpty(message = "Provide value for destination")
    private String destination;
	@Min(value = 1, message = "Base fare should be positive and nonzero")
    private double baseFare;
	@NotEmpty(message = "Provide value for train status")
    private String trainStatus;
	@Range(min = 40 , max = 200, message = "Speed should be between 40 and 200")
    private int speed;
    // Provide necessary Annotations
	@OneToMany(mappedBy = "trainObj")
	@JsonIgnore
    private List<Coach> coachList;
    
    
    public Train()
    {
    	super();
    }
}
