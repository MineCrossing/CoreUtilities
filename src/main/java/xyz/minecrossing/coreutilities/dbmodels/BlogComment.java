package xyz.minecrossing.coreutilities.dbmodels;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class BlogComment implements IDatabaseModel<String> {
	private UUID blogCommentID;
	private UUID blogPostID;
	private UUID userID;
	private String message;
	private LocalDateTime createdDate;

	public final static String BLOG_COMMENT_ID_COL = "blog_comment_id";
	public final static String BLOG_POST_ID_COL = "blog_post_id";
	public final static String USER_ID_COL = "user_id";
	public final static String MESSAGE_COL = "message";
	public final static String CREATED_DATE_COL = "created_date";

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

	@Override
	public String getKey() {
		return userID.toString();
	}

	@Override
	public List<String> getColumnNames() {
		return List.of(
				BLOG_COMMENT_ID_COL,
				BLOG_POST_ID_COL,
				USER_ID_COL,
				MESSAGE_COL,
				CREATED_DATE_COL);
	}
}
