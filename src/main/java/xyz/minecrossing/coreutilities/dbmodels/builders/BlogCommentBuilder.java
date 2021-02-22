package xyz.minecrossing.coreutilities.dbmodels.builders;

import xyz.minecrossing.coreutilities.dbmodels.BlogComment;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.UUID;

public class BlogCommentBuilder {
	private UUID blogCommentID;
	private UUID blogPostID;
	private UUID userID;
	private String message;
	private LocalDateTime createdDate;

	public BlogCommentBuilder fromResultSet(ResultSet rs) throws SQLException {
		blogCommentID = UUID.fromString(rs.getString(BlogComment.BLOG_COMMENT_ID_COL));
		blogPostID = UUID.fromString(rs.getString(BlogComment.BLOG_POST_ID_COL));
		userID = UUID.fromString(rs.getString(BlogComment.USER_ID_COL));
		message = rs.getString(BlogComment.MESSAGE_COL);
		createdDate = rs.getTimestamp(BlogComment.CREATED_DATE_COL).toLocalDateTime();

		return this;
	}

	public BlogCommentBuilder setBlogCommentID(UUID blogCommentID) {
		this.blogCommentID = blogCommentID;
		return this;
	}

	public BlogCommentBuilder setBlogPostID(UUID blogPostID) {
		this.blogPostID = blogPostID;
		return this;
	}

	public BlogCommentBuilder setUserID(UUID userID) {
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