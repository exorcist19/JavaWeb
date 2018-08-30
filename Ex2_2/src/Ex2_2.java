import java.util.Scanner;

public class Ex2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       final double PI = 3.14;
       double area;
       double radius;
       double length;
       double volume;
       
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the radius and length of a cylinder: ");
	radius = sc.nextDouble();
	length = sc.nextDouble();
	area = radius * radius * PI;
	System.out.println("Area is " + area);
	volume = area * length;
	System.out.println("The volume is " + volume);
	}
	
	
	
	

}
