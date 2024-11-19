package com.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.entities.Article;
import com.exception.InvalidArticleException;

public interface IArticleService {
    
    public Article addArticle(Article article);

	public Article viewArticleById(int articleId) throws InvalidArticleException;


	public List<Article> viewArticlesByAuthorAndArticleType(String author, String articleType);

	public Article updateLikesCount(int articleId, int likesCount) throws InvalidArticleException;

	public Map<Integer,Integer> getReplyCountArticleWise();
}
