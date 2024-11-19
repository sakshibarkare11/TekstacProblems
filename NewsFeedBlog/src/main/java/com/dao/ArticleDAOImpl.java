package com.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.entities.Article;
import com.exception.InvalidArticleException;
import com.repository.ArticleRepository;

@Component
public class ArticleDAOImpl implements IArticleDAO {

	// Provide necessary Annotation
	@Autowired
	private ArticleRepository articleRepository;

	public Article addArticle(Article article) {
	    
		// fill code

		return articleRepository.save(article);
		
	}

	public Article viewArticleById(int articleId) throws InvalidArticleException {

		// fill code
		
		Optional<Article> a  = articleRepository.findById(articleId);
		if(a.isPresent()) {
			return a.get();
		}else {
			throw new InvalidArticleException();
		}
//		
	}

	public List<Article> viewArticlesByAuthorAndArticleType(String author, String articleType) {
	    
	    // fill code

		return articleRepository.findByAuthorAndArticleType(author, articleType);
		
	}
	
	
	public Article updateLikesCount(int articleId, int likesCount) throws InvalidArticleException {
	    
	    // fill code
		Optional<Article>  ao = articleRepository.findById(articleId);
		if(ao.isPresent()) {
			Article a= ao.get();
			a.setLikesCount(a.getLikesCount()+likesCount);
			articleRepository.save(a);
			return a;
		}else {
			throw new InvalidArticleException();
		}
	
	}
	
	
	public Map<Integer,Integer> getReplyCountArticleWise() {
	    
	     
	    // fill code
		List<Article> l = articleRepository.findAll();
		
		Map<Integer, Integer> map = new HashMap<>();
		for (Article article : l) {
			map.put(article.getArticleId(), map.getOrDefault(article.getArticleId(), 0)+article.getReplyList().size());
		}
		

		return map;
	
	}
}
