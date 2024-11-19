package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dao.IReplyDAO;
import com.entities.Reply;
import com.exception.InvalidArticleException;
import com.exception.InvalidReplyException;

//Provide necessary annotation
@Component
public class ReplyServiceImpl implements IReplyService {

	// Provide necessary annotation
	@Autowired
	private IReplyDAO replyDAO;

	public Reply addReply(Reply reply, int articleId) throws InvalidArticleException {
	    
		return replyDAO.addReply(reply, articleId);

	}

	public Reply updateVisibility(int replyId, String visibility) throws InvalidReplyException {
	    
		return replyDAO.updateVisibility(replyId, visibility);
	}

	public List<Reply> viewRepliesByUser(String user) {
	    
		return replyDAO.viewRepliesByUser(user);
	}

	public Reply deleteReply(int replyId) throws InvalidReplyException {
	    
		return replyDAO.deleteReply(replyId);
	}

	public List<Reply> viewRepliesByArticleTitle(String articleTitle) {
	    
		return replyDAO.viewRepliesByArticleTitle(articleTitle);
	}
}
