package com.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.IArticleDAO;
import com.entities.Article;
import com.exception.InvalidArticleException;

//Provide necessary annotation
@Service
public class ArticleServiceImpl implements IArticleService {

	// Provide necessary annotation
	@Autowired
	private IArticleDAO articleDAO;

	public Article addArticle(Article article) {
	    
		return articleDAO.addArticle(article);
	}

	public Article viewArticleById(int articleId) throws InvalidArticleException {
	    
		return articleDAO.viewArticleById(articleId);
	}


	public List<Article> viewArticlesByAuthorAndArticleType(String author, String articleType) {
	    
		return articleDAO.viewArticlesByAuthorAndArticleType(author, articleType);
	}
	

	public Article updateLikesCount(int articleId, int likesCount) throws InvalidArticleException {
	    
		return articleDAO.updateLikesCount(articleId, likesCount);
	}


	public Map<Integer,Integer> getReplyCountArticleWise() {
	    
	    return articleDAO.getReplyCountArticleWise();
	}

}
