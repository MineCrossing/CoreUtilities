package xyz.minecrossing.coreutilities.dbmodels;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class BlogPost implements IDatabaseModel<String> {
	private UUID blogPostID;
	private UUID userID;
	private String title;
	private String subtitle;
	private String author;
	private String content;
	private LocalDateTime createdDate;

	public final static String BLOG_POST_ID_COL = "blog_post_id";
	public final static String USER_ID_COL = "user_id";
	public final static String TITLE_COL = "title";
	public final static String SUBTITLE_COL = "subtitle";
	public final static String AUTHOR_COL = "author";
	public final static String CONTENT_COL = "content";
	public final static String CREATED_DATE_COL = "created_date";

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

	@Override
	public String getKey() {
		return userID.toString();
	}

	@Override
	public List<String> getColumnNames() {
		return List.of(
				BLOG_POST_ID_COL,
				USER_ID_COL,
				TITLE_COL,
				SUBTITLE_COL,
				AUTHOR_COL,
				CONTENT_COL,
				CREATED_DATE_COL);
	}
}
