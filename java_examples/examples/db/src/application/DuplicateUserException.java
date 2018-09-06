/**
 * 
 */
package application;

/**
 * @author B-rock
 *
 */
public class DuplicateUserException extends Exception
{
	 
		private static final long serialVersionUID = 1L;
		
		/**
		 * @param message the message of the exception thrown
		 */
		public DuplicateUserException(String message)
		{ super(message);}
		
		/**
		 * Invalid Id Exception
		 */
		public DuplicateUserException()
		{ super();}

}
