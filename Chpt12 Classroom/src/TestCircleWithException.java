
public class TestCircleWithException {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			CircleWithException c1 = new CircleWithException(5);
		    CircleWithException c2 = new CircleWithException(-5);
		}
		catch(IllegalArgumentException ex) {
			System.out.println("1: " + ex);
			System.out.println("\n 2: " + ex.getMessage());
			System.out.println("\n 3: " + ex.toString());
			ex.printStackTrace();
		}
		finally {System.out.println("In finally block"); }
		   System.out.println("Number of objects created " +
		   	CircleWithException.getNumberOfObjects());
	}

}
