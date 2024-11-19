package com.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entities.Article;
import com.entities.Reply;
import com.exception.InvalidArticleException;
import com.exception.InvalidReplyException;
import com.repository.ArticleRepository;
import com.repository.ReplyRepository;

@Service
public class ReplyDAOImpl implements IReplyDAO {

	// Provide necessary Annotation
	@Autowired
	private ReplyRepository replyRepository;

	// Provide necessary Annotation
	@Autowired
	private ArticleRepository articleRepository;

	public Reply addReply(Reply reply, int articleId) throws InvalidArticleException {

		// fill code
		Optional<Article> ao = articleRepository.findById(articleId);
		if(ao.isPresent()) {
			Article a = ao.get();
			reply.setArticleObj(a);
			replyRepository.save(reply);
			return reply;
		}else {
			throw new InvalidArticleException();
		}
	}

	public Reply updateVisibility(int replyId, String visibility) throws InvalidReplyException {
		// fill code		
		Optional<Reply> ro = replyRepository.findById(replyId);
		if(ro.isPresent()) {
			Reply r  =ro.get();
			r.setVisibility(visibility);
			replyRepository.save(r);
			return r;
		}else {
			throw new InvalidReplyException();
		}

	}

	public List<Reply> viewRepliesByUser(String user) {

		// fill code

		return replyRepository.findByUser(user);
	}

	public List<Reply> viewRepliesByArticleTitle(String articleTitle) {

		// fill code

		return replyRepository.findByArticleObj_ArticleTitle(articleTitle);
	}

	public Reply deleteReply(int replyId) throws InvalidReplyException {
		
		Optional<Reply> ro  = replyRepository.findById(replyId);
		if(ro.isPresent()) {
			Reply r = ro.get();
			replyRepository.delete(r);
			return r;
		}else {
			throw new InvalidReplyException();
		}

	}

}
