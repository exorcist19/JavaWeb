import java.util.Scanner;

public class Ex02_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the values for x1 and y1: ");
		double x1 = s.nextDouble();
		double y1 = s.nextDouble();
		
		System.out.print("Enter the values for x2 and y2: ");
		double x2 = s.nextDouble();
		double y2 = s.nextDouble();
		double a = (x2-x1)*(x2-x1);
		double b =(y2-y1)*(y2-y1);
		double distance = Math.pow(a+b, 0.5);
				
		
		System.out.println("The distance of the points is " + distance);
		
	}

}
