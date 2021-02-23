package xyz.minecrossing.coreutilities.dbmodels.builders;

import xyz.minecrossing.coreutilities.dbmodels.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class UserBuilder {
	private String userID;
	private String email;
	private String password;
	private String username;
	private boolean admin;
	private LocalDate createdDate;

	public UserBuilder fromResultSet(ResultSet rs) throws SQLException {
		userID = rs.getString(User.USER_ID_COL);
		email = rs.getString(User.EMAIL_COL);
		password = rs.getString(User.PASSWORD_COL);
		admin = rs.getBoolean(User.ADMIN_COL);
		createdDate = rs.getDate(User.CREATED_DATE_COL).toLocalDate();
		username = rs.getString(User.USERNAME_COL);

		return this;
	}

	public UserBuilder setUserID(String userID) {
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