package xyz.minecrossing.coreutilities.dbmodels;

import java.time.LocalDateTime;
import java.util.UUID;

public class BlogPost {
	private UUID blogPostID;
	private UUID userID;
	private String title;
	private String subtitle;
	private String author;
	private String content;
	private LocalDateTime createdDate;

	public BlogPost() {
	}

	public BlogPost(UUID blogPostID, UUID userID, String title, String subtitle, String author, String content, LocalDateTime createdDate) {
		this.blogPostID = blogPostID;
		this.userID = userID;
		this.title = title;
		this.subtitle = subtitle;
		this.author = author;
		this.content = content;
		this.createdDate = createdDate;
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}
}
