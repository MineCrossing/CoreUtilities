package xyz.minecrossing.coreutilities.dbmodels;

import java.time.LocalDateTime;

public class BlogComment implements IDatabaseModel<String> {
	@ColName(col = "blog_comment_id")
	private String blogCommentID;

	@ColName(col = "blog_post_id")
	private String blogPostID;

	@ColName(col = "user_id")
	private String userID;

	@ColName(col = "message")
	private String message;

	@ColName(col = "created_date")
	private LocalDateTime createdDate;

	public final static String BLOG_COMMENT_ID_COL = "blog_comment_id";
	public final static String BLOG_POST_ID_COL = "blog_post_id";
	public final static String USER_ID_COL = "user_id";
	public final static String MESSAGE_COL = "message";
	public final static String CREATED_DATE_COL = "created_date";

	public BlogComment() {
	}

	public BlogComment(String blogCommentID, String blogPostID, String userID, String message, LocalDateTime createdDate) {
		this.blogCommentID = blogCommentID;
		this.blogPostID = blogPostID;
		this.userID = userID;
		this.message = message;
		this.createdDate = createdDate;
	}

	public String getBlogCommentID() {
		return blogCommentID;
	}

	public void setBlogCommentID(String blogCommentID) {
		this.blogCommentID = blogCommentID;
	}

	public String getBlogPostID() {
		return blogPostID;
	}

	public void setBlogPostID(String blogPostID) {
		this.blogPostID = blogPostID;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
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

	@Override
	public String getKey() {
		return userID.toString();
	}
}
