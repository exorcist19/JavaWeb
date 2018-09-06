package application;

import java.sql.Connection;

public class User {
	protected long id;
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	protected String username;
	protected String password;
	
	public User() {}
	
	public User(String username, String password) throws InvalidUserDataException {
		try {
			this.setUsername(username);
			this.setPassword(password);
		} 
		catch (Exception e) 
		{
			throw new InvalidUserDataException(e.getMessage());
		}
	}
	
	public User(long id, String username, String password) throws InvalidUserDataException {
		this(username, password);
		this.setId(id);
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public static void initialize(Connection c){
		UserDA.initialize(c);
	}

	
	public static User retrieve(long id) throws NotFoundException 
	{
		return UserDA.retrieve(id);
	}
	
	
}
