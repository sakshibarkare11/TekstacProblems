package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.entities.Article;



//Provide necessary annotation
@Repository
public interface ArticleRepository extends JpaRepository<Article, Integer>{

	// Provide necessary methods to view articles by author and article type
	// and to get the reply count article wise
	List<Article> findByAuthorAndArticleType(String author, String articleType);
	

	

}
