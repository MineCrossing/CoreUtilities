package xyz.minecrossing.coreutilities.dbmodels.builders;

import xyz.minecrossing.coreutilities.dbmodels.BlogComment;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;

public class BlogCommentBuilder {
	private String blogCommentID;
	private String blogPostID;
	private String userID;
	private String message;
	private LocalDateTime createdDate;

	public BlogCommentBuilder fromResultSet(ResultSet rs) throws SQLException {
		blogCommentID = rs.getString(BlogComment.BLOG_COMMENT_ID_COL);
		blogPostID = rs.getString(BlogComment.BLOG_POST_ID_COL);
		userID = rs.getString(BlogComment.USER_ID_COL);
		message = rs.getString(BlogComment.MESSAGE_COL);
		createdDate = rs.getTimestamp(BlogComment.CREATED_DATE_COL).toLocalDateTime();

		return this;
	}

	public BlogCommentBuilder setBlogCommentID(String blogCommentID) {
		this.blogCommentID = blogCommentID;
		return this;
	}

	public BlogCommentBuilder setBlogPostID(String blogPostID) {
		this.blogPostID = blogPostID;
		return this;
	}

	public BlogCommentBuilder setUserID(String userID) {
		this.userID = userID;
		return this;
	}

	public BlogCommentBuilder setMessage(String message) {
		this.message = message;
		return this;
	}

	public BlogCommentBuilder setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
		return this;
	}

	public BlogComment build() {
		return new BlogComment(blogCommentID, blogPostID, userID, message, createdDate);
	}
}