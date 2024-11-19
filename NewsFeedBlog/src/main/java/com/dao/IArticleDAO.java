package com.dao;

import java.util.List;
import java.util.Map;


import com.entities.Article;
import com.exception.InvalidArticleException;

public interface IArticleDAO {

	public Article addArticle(Article article);

	public Article viewArticleById(int articleId) throws InvalidArticleException;

	public List<Article> viewArticlesByAuthorAndArticleType(String author, String articleType);

	public Article updateLikesCount(int articleId, int likesCount) throws InvalidArticleException;

	public Map<Integer,Integer> getReplyCountArticleWise();

}
