package com.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.entities.Article;
import com.exception.InvalidArticleException;
import com.service.IArticleService;

import jakarta.validation.Valid;

//Provide necessary Annotation
@RestController
public class ArticleController {

	// Provide necessary Annotation
	@Autowired
	private IArticleService articleService;

	// Provide necessary Annotation for the below methods and fill the code
	@PostMapping("/addArticle")
	public Article addArticle(@RequestBody @Valid Article article) {
	    
	    // Fill the code here
		
		return articleService.addArticle(article);
	}
	@GetMapping("/viewArticleById/{articleId}")
	public Article viewArticleById(@Valid @PathVariable("articleId") int articleId) throws InvalidArticleException {
	    
	    // Fill the code here
		
		return articleService.viewArticleById(articleId);
	}

	@GetMapping("/viewArticlesByAuthorAndArticleType/{author}/{articleType}")
	public List<Article> viewArticlesByAuthorAndArticleType(@PathVariable("author") @Valid String author,@Valid @PathVariable("articleType") String articleType) {
	    
	    // Fill the code here
		return articleService.viewArticlesByAuthorAndArticleType(author, articleType);
	}
	
	@PutMapping("/updateLikesCount/{articleId}/{likesCount}")
	public Article updateLikesCount( @Valid @PathVariable("articleId") int articleId, @Valid @PathVariable("likesCount") int likesCount) throws InvalidArticleException  {
	
	    // Fill the code here
		return articleService.updateLikesCount(articleId, likesCount);
	}
	
	
	@GetMapping("/getReplyCountArticleWise")
	public Map<Integer,Integer> getReplyCountArticleWise() {
	    
	    // Fill the code here
		return articleService.getReplyCountArticleWise();
		
	}

	

}
