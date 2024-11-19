package com.entities;

import java.util.List;

import org.hibernate.validator.constraints.Range;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
public class Article {

	// Provide necessary Annotation
	@Id
	@Min(value = 1,message = "Article id should be greater than 0")
	private int articleId;
	@NotEmpty(message = "Provide value for author")
	private String author;
	@NotEmpty(message = "Provide value for article title")
	private String articleTitle;
	@NotEmpty(message = "Provide value for article content")
	private String articleContent;
	@NotEmpty(message = "Provide value for article type")
	private String articleType;
	@NotEmpty(message = "Provide value for tag")
	private String tag;
	@Min(value = 0,message = "Likes count should be 0 or greater")
	private int likesCount;
	@Range(min = 1,max = 5,message  = "Rating should be between 1 and 5")
	private int rating;

	
	// Provide necessary Annotations
	
	@OneToMany(mappedBy = "articleObj")
	private List<Reply> replyList;

	public Article() {
		super();
	}



}