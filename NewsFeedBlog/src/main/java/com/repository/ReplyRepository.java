package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.entities.Reply;
import java.util.List;


//Provide necessary annotation
@Repository
public interface ReplyRepository extends JpaRepository<Reply, Integer>{

	// Provide necessary methods to view replies by user and view replies by based on article title
	List<Reply> findByUser(String user);
	List<Reply> findByArticleObj_ArticleTitle(String articleType);
}
