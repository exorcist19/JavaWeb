/**
 * 
 */
package application;

import java.text.SimpleDateFormat;
import java.util.Vector;
import java.sql.*;


public class UserDA {
	
	private static final SimpleDateFormat
	SQL_DF = new SimpleDateFormat("yyyy-MM-dd");
	
	static Vector<User> users= new Vector<User>();	// contains User references
	static User aUser;
	
	/**
	 * variables for the database connection
	 */
	static Connection aConnection;
	static Statement aStatement;

	/**
	 * static variables for all Student instance attribute values
	 */
	static long id;
	static String username;
	static String password;

	/**
	 * @param establish the database connection
	 */
	public static void initialize(Connection c)
	{
            try {
                aConnection=c;
                aStatement=aConnection.createStatement();
            }
            catch (SQLException e)
            { System.out.println(e);	}
	}

	// close the database connection
	public static void terminate()
	{
            try
            { 	// close the statement
                aStatement.close();
            }
            catch (SQLException e)
            { System.out.println(e);	}
	}

	public static User retrieve(long id) throws NotFoundException
	{ 
		aUser = null;
		// define the SQL query statement using the phone number key
		String sqlQuery = "SELECT id, username, password" +
                                    " FROM users " +
                                    " WHERE id = '" + id + "'";
                //System.out.println(sqlQuery);
	 	// execute the SQL query statement
		try
 		{
	        ResultSet rs = aStatement.executeQuery(sqlQuery);
	        // next method sets cursor & returns true if there is data
	        boolean gotIt = rs.next();
	        if (gotIt)
	        {	// extract the data
			id = rs.getLong("id");
			password = rs.getString("password");
			username = rs.getString("username");			
			
        try{
        	aUser = new User(id, username, password);
        }catch (InvalidUserDataException e)
        { System.out.println("Attempt to retrieve a user that does exist (Id: " + id + ")\n"
        		+ "User record with id " + id + "retrieved from the database");}
            
        } else	// nothing was retrieved
        {throw (new NotFoundException("Attemp to retrieve a user that does not exist (Id: " + id + ") \n"
        		+ "User with if of " + id + " not found in the database."));}
                    rs.close();
	   	}catch (SQLException e)
		{ System.out.println(e);}
                
		return aUser;
	}

	public static Vector<User> retrieveAll()
        {   
            // define the SQL query statement for get all
            String sqlQuery = "SELECT id, username, password " +
                                "FROM users";
            try
            {   // execute the SQL query statement
                ResultSet rs = aStatement.executeQuery(sqlQuery);
                boolean moreData = rs.next();
                
                while (moreData)
                {	// extract the data
        			id = rs.getLong(1);
        			password = rs.getString(2);
        			username = rs.getString(3);
        			
                    
                    // try tp create User instance
                    try{
                    	aUser = new User(id, password, username);
                    }catch (Exception e)
                    { System.out.println("Attempt to retrieve a student that does exist (Id: " + id + ")\n"
                    		+ "Student record with id " + id + "retrieved from the database");}
                    
                    users.addElement(aUser);
                    System.out.println("Did create user: " + aUser.username);
                    moreData = rs.next();
                }
                rs.close();
            }
            catch (SQLException e)
                    { System.out.println(e);}
            
            System.out.println("Returning users?" + users);
            return users;
	}

	public static boolean create(User aUser) throws DuplicateUserException
	{	
		boolean inserted = false; //insertion success flag
		// retrieve the student attribute values
		id = aUser.getId();
		password = aUser.getPassword();
		username = aUser.getUsername();
		
		// create the SQL insert statement using attribute values
		String sqlInsert = "INSERT INTO users " +
                                    "(username, password)" +
                                    "VALUES ('" + username + "', '" +
                                    password + "')";

		// see if this student already exists in the database
		try
		{
			retrieve(id);
			throw (new DuplicateUserException("Problem with creating Student record, ID " + id +" already exists in the system."));
		}
		// if NotFoundException, add student to database
		catch(NotFoundException e)
		{
			try
 			{  // execute the SQL update statement
	    		inserted = aStatement.execute(sqlInsert);
			}
			catch (SQLException ee)
				{ System.out.println(ee);	}
		}
		return inserted;
	}

	public static int delete(User aUser) throws NotFoundException
	{	
		int records = 0;
		// retrieve the phone no (key)
		id = aUser.getId();
		// create the SQL delete statement
		String sqlDelete = "DELETE FROM students " +
                                    "WHERE id = '" + id +"'";

		// see if this student already exists in the database
		try
		{
			User.retrieve(id);  //used to determine if record exists for the passed student
    		// if found, execute the SQL update statement
    		records = aStatement.executeUpdate(sqlDelete);
		}catch(NotFoundException e)
		{
			throw new NotFoundException("\nDid not find student record with id " + 100222222);
		}catch (SQLException e)
			{ System.out.println(e);	}
		return records;
	}

	public static int update(User aUser) throws NotFoundException
	{	
		int records = 0;  //records updated in method
		
		// retrieve the student argument attribute values
		id = aUser.getId();
		password = aUser.getPassword();
		username= aUser.getUsername();

		// define the SQL query statement using the id
		String sqlUpdate = "UPDATE users " +
                                    " SET password = '" + password +"', " +
                                    " username = '" + username +"' " +
                                    " WHERE id = '" + id + "'";

		try
		{
			User.retrieve(id);  //determine if there is a user record to be updated
                    // if found, execute the SQL update statement
                    records = aStatement.executeUpdate(sqlUpdate);
		}catch(NotFoundException e)
		{
			throw new NotFoundException("Change the user object and attempt to update "
					+ "the user record for " + username + "(Id: " + id + ")User record updated in the database.");
		}catch (SQLException e)
		{ System.out.println(e);}
		return records;
	}

}
