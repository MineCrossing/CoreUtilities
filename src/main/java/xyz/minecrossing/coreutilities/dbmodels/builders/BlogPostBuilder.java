package xyz.minecrossing.coreutilities.dbmodels.builders;

import xyz.minecrossing.coreutilities.dbmodels.BlogPost;

import java.time.LocalDateTime;
import java.util.UUID;

public class BlogPostBuilder {
	private UUID blogPostID;
	private UUID userID;
	private String title;
	private String subtitle;
	private String author;
	private String content;
	private LocalDateTime createdDate;

	public BlogPostBuilder setBlogPostID(UUID blogPostID) {
		this.blogPostID = blogPostID;
		return this;
	}

	public BlogPostBuilder setUserID(UUID userID) {
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