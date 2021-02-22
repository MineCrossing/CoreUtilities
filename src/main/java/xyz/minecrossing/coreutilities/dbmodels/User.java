package xyz.minecrossing.coreutilities.dbmodels;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public class User implements IDatabaseModel<String> {
	private UUID userID;
	private String email;
	private String password;
	private String username;
	private boolean admin;
	private LocalDate createdDate;

	public final static String USER_ID_COL = "user_id";
	public final static String EMAIL_COL = "email";
	public final static String PASSWORD_COL = "password";
	public final static String USERNAME_COL = "username";
	public final static String ADMIN_COL = "admin";
	public final static String CREATED_DATE_COL = "created_date";

	public User() {
	}

	public User(UUID userID, String email, String password, String username, boolean admin, LocalDate createdDate) {
		this.userID = userID;
		this.email = email;
		this.password = password;
		this.username = username;
		this.admin = admin;
		this.createdDate = createdDate;
	}

	public UUID getUserID() {
		return userID;
	}

	public void setUserID(UUID userID) {
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

	@Override
	public List<String> getColumnNames() {
		return List.of(
				USER_ID_COL,
				EMAIL_COL,
				PASSWORD_COL,
				USERNAME_COL,
				ADMIN_COL,
				CREATED_DATE_COL);
	}
}
