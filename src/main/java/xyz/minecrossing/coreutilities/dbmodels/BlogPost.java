package xyz.minecrossing.coreutilities.dbmodels;

import java.time.LocalDateTime;

public class BlogPost implements IDatabaseModel<String> {
	@ColName(col = "blog_post_id")
	private String blogPostID;

	@ColName(col = "user_id")
	private String userID;

	@ColName(col = "title")
	private String title;

	@ColName(col = "subtitle")
	private String subtitle;

	@ColName(col = "author")
	private String author;

	@ColName(col = "content")
	private String content;

	@ColName(col = "created_date")
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

	public BlogPost(String blogPostID, String userID, String title, String subtitle, String author, String content, LocalDateTime createdDate) {
		this.blogPostID = blogPostID;
		this.userID = userID;
		this.title = title;
		this.subtitle = subtitle;
		this.author = author;
		this.content = content;
		this.createdDate = createdDate;
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
}
