package xyz.minecrossing.coreutilities.dbmodels.builders;

import xyz.minecrossing.coreutilities.dbmodels.User;

import java.time.LocalDate;
import java.util.UUID;

public class UserBuilder {
	private UUID userID;
	private String email;
	private String password;
	private String username;
	private boolean admin;
	private LocalDate createdDate;

	public UserBuilder setUserID(UUID userID) {
		this.userID = userID;
		return this;
	}

	public UserBuilder setEmail(String email) {
		this.email = email;
		return this;
	}

	public UserBuilder setPassword(String password) {
		this.password = password;
		return this;
	}

	public UserBuilder setUsername(String username) {
		this.username = username;
		return this;
	}

	public UserBuilder setAdmin(boolean admin) {
		this.admin = admin;
		return this;
	}

	public UserBuilder setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
		return this;
	}

	public User build() {
		return new User(userID, email, password, username, admin, createdDate);
	}
}