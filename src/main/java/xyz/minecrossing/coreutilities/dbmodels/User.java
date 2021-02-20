package xyz.minecrossing.coreutilities.dbmodels;

import java.time.LocalDate;
import java.util.UUID;

public class User {
	private UUID userID;
	private String email;
	private String password;
	private String username;
	private boolean admin;
	private LocalDate createdDate;

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
}
