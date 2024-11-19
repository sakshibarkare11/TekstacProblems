package com.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

//Provide necessary Annotation wherever necessary
@Entity
@Getter
@Setter
@AllArgsConstructor
public class Reply {

	// Provide necessary Annotation
	@Id
	@Min(value = 0,message = "Reply id should be greater than 0")
	private int replyId;
	@NotEmpty(message = "Provide value for user")
	private String user;
	@NotEmpty(message = "Provide value for reply content")
	private String replyContent;
	@NotEmpty(message = "Provide value for reply type")
	private String replyType;
	@NotEmpty(message = "Provide value for visibility")
	private String visibility;
	// Provide necessary Annotations
	@ManyToOne
	@JoinColumn(name = "article_id")
	private Article articleObj;

	public Reply() {
		super();
	}


}
