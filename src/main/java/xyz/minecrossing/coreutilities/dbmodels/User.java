package xyz.minecrossing.coreutilities.dbmodels;

import java.time.LocalDate;

public class User implements IDatabaseModel<String> {
	@ColName(col = "user_id")
	private String userID;
	@ColName(col = "email")
	private String email;
	@ColName(col = "password")
	private String password;
	@ColName(col = "username")
	private String username;
	@ColName(col = "admin")
	private boolean admin;
	@ColName(col = "created_date")
	private LocalDate createdDate;

	public final static String USER_ID_COL = "user_id";
	public final static String EMAIL_COL = "email";
	public final static String PASSWORD_COL = "password";
	public final static String USERNAME_COL = "username";
	public final static String ADMIN_COL = "admin";
	public final static String CREATED_DATE_COL = "created_date";

	public User() {
	}

	public User(String userID, String email, String password, String username, boolean admin, LocalDate createdDate) {
		this.userID = userID;
		this.email = email;
		this.password = password;
		this.username = username;
		this.admin = admin;
		this.createdDate = createdDate;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	@Override
	public String getKey() {
		return userID.toString();
	}
}
