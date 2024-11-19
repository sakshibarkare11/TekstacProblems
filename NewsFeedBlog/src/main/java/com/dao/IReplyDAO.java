package com.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.entities.Reply;
import com.exception.InvalidArticleException;
import com.exception.InvalidReplyException;

public interface IReplyDAO {
	public Reply addReply(Reply reply, int articleId) throws InvalidArticleException;

	public Reply updateVisibility(int replyId, String visibility) throws InvalidReplyException;

	public List<Reply> viewRepliesByArticleTitle(String articleTitle);

	public List<Reply> viewRepliesByUser(String user);

	public Reply deleteReply(int replyId) throws InvalidReplyException;
}
