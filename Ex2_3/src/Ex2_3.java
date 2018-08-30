import java.util.Scanner;

public class Ex2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double feet;
		double  meters;
		final double con = 0.305;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of feet: ");
		feet = sc.nextDouble();
		meters = feet * con;
		
		System.out.println(feet + " feet is " + meters + "meters");
		
		
		
	}

}
