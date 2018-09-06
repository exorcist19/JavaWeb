/**
 * 
 */
package application;

import com.mysql.jdbc.*;
import java.sql.*;

/**
 * @author B-rock
 *
 */
public class DBL {

	/**
	 * Database location
	 */
	static String url = "jdbc:mysql://localhost:3306/test?useSSL=false&serverTimezone=UTC";
	/**
	 * Connection object to open port to db
	 */
	static Connection aConnection;
	/**
	 * database user
	 */
	static String user = "root";
	/**
	 * database user password
	 */
	static String password = "";
	
	/**
	 * establishes the database connection
	 * @return Connection to the 'test' database
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws SQLException 
	 */
	public static Connection initialize() throws InstantiationException, IllegalAccessException, SQLException
	{
		try
 		{ 	
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance(); // loads the JDBC Driver for PostGreSQL
			aConnection = DriverManager.getConnection(url, user, password); // creates the database connection instance
	    	
	 	}
		catch (ClassNotFoundException e)  //will occur if you did not import the PostGreSQL *.jar file with drivers
		{
			System.out.println(e);
		}
		catch (SQLException e)	//any other database exception (misnamed db, misnamed user, worng password, etc)
			{ System.out.println(e); }
		return aConnection;
		
	}

	/**
	 * closes the database connection
	 */
	public static void terminate()
	{
		try
 		{
    		aConnection.close();
		}
		catch (SQLException e)
			{ System.out.println(e);	}
	}
}
