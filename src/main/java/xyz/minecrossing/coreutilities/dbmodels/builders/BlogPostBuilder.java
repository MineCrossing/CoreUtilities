package xyz.minecrossing.coreutilities.dbmodels.builders;

import xyz.minecrossing.coreutilities.dbmodels.BlogPost;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;

public class BlogPostBuilder {
	private String blogPostID;
	private String userID;
	private String title;
	private String subtitle;
	private String author;
	private String content;
	private LocalDateTime createdDate;

	public BlogPostBuilder fromResultSet(ResultSet rs) throws SQLException {
		blogPostID = rs.getString(BlogPost.BLOG_POST_ID_COL);
		userID = rs.getString(BlogPost.USER_ID_COL);
		title = rs.getString(BlogPost.TITLE_COL);
		subtitle = rs.getString(BlogPost.SUBTITLE_COL);
		author = rs.getString(BlogPost.AUTHOR_COL);
		content = rs.getString(BlogPost.CONTENT_COL);
		createdDate = rs.getTimestamp(BlogPost.CREATED_DATE_COL).toLocalDateTime();

		return this;
	}

	public BlogPostBuilder setBlogPostID(String blogPostID) {
		this.blogPostID = blogPostID;
		return this;
	}

	public BlogPostBuilder setUserID(String userID) {
		this.userID = userID;
		return this;
	}

	public BlogPostBuilder setTitle(String title) {
		this.title = title;
		return this;
	}

	public BlogPostBuilder setSubtitle(String subtitle) {
		this.subtitle = subtitle;
		return this;
	}

	public BlogPostBuilder setAuthor(String author) {
		this.author = author;
		return this;
	}

	public BlogPostBuilder setContent(String content) {
		this.content = content;
		return this;
	}

	public BlogPostBuilder setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
		return this;
	}

	public BlogPost build() {
		return new BlogPost(blogPostID, userID, title, subtitle, author, content, createdDate);
	}
}