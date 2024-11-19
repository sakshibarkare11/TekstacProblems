package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.entities.Reply;
import com.exception.InvalidArticleException;
import com.exception.InvalidReplyException;
import com.service.IReplyService;


//Provide necessary Annotation
@RestController
public class ReplyController {

	// Provide necessary Annotation
	@Autowired
	private IReplyService replyService;

	// Provide necessary Annotation for the below methods and fill the code
	@PostMapping("/addReply/{articleId}")
	public Reply addReply(@RequestBody  Reply reply,@PathVariable int articleId) throws InvalidArticleException {
	    
	    // Fill the code here
		return replyService.addReply(reply, articleId);

	}
	@PutMapping("/updateVisibility/{replyId}/{visibility}")
	public Reply updateVisibility(@PathVariable int replyId,@PathVariable String visibility) throws InvalidReplyException {
	    
	    // Fill the code here
		return replyService.updateVisibility(replyId, visibility);
	}
	@GetMapping("/viewRepliesByArticleTitle/{articleTitle}")
	public List<Reply> viewRepliesByArticleTitle(@PathVariable String articleTitle) {
	    
	    // Fill the code here
		return replyService.viewRepliesByArticleTitle(articleTitle);
	}
	@GetMapping("/viewRepliesByUser/{user}")
	public List<Reply> viewRepliesByUser(@PathVariable String user) {
	    
	    // Fill the code here
		return replyService.viewRepliesByUser(user);
	}
	@DeleteMapping("/deleteReply/{replyId}")
	public Reply deleteReply(@PathVariable int replyId) throws InvalidReplyException {
	    
	    // Fill the code here
		return replyService.deleteReply(replyId);
	}

}
