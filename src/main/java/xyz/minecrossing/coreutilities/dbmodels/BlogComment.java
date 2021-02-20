package xyz.minecrossing.coreutilities.dbmodels;

import java.time.LocalDateTime;
import java.util.UUID;

public class BlogComment {
	private UUID blogCommentID;
	private UUID blogPostID;
	private UUID userID;
	private String message;
	private LocalDateTime createdDate;

	public BlogComment() {
	}

	public BlogComment(UUID blogCommentID, UUID blogPostID, UUID userID, String message, LocalDateTime createdDate) {
		this.blogCommentID = blogCommentID;
		this.blogPostID = blogPostID;
		this.userID = userID;
		this.message = message;
		this.createdDate = createdDate;
	}

	public UUID getBlogCommentID() {
		return blogCommentID;
	}

	public void setBlogCommentID(UUID blogCommentID) {
		this.blogCommentID = blogCommentID;
	}

	public UUID getBlogPostID() {
		return blogPostID;
	}

	public void setBlogPostID(UUID blogPostID) {
		this.blogPostID = blogPostID;
	}

	public UUID getUserID() {
		return userID;
	}

	public void setUserID(UUID userID) {
		this.userID = userID;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}
}
