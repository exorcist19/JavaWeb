package chpt9_9;

import java.util.Date;
import java.util.Scanner;

import javafx.geometry.Point2D;





public class TestCircle {

	public static void main(String[] args) {
		
		
		
	Circle Circle1 = new Circle();
		System.out.println("The area of the circle of radius "	+ Circle1.radius + " is " + Circle1.getArea());
	
	
	Circle circle2 = new Circle(25);
	System.out.println("The area of the circle of radius "	+ circle2.radius + " is " + circle2.getArea());
    
	
	Circle circle3 = new Circle(125);
	System.out.println("The area of the circle of radius "	+ circle3.radius + " is " + circle3.getArea());
    	
	
	Circle circle4 = new Circle(100);
		System.out.println("The area of the circle of radius "		+ circle4.radius + " is " + circle4.getArea());
		
	Date date = new Date();
	
	System.out.println("The elapsed time since Jan1 1970 is "
	+ date.getTime() + "milliseconds");
	System.out.println(date.toString());
	//PointID
	Scanner input = new Scanner(System.in);
	System.out.println("Enter point1's x-, y- coordinates: ");
	double x1 = input.nextDouble();
	double y1 = input.nextDouble();
	System.out.println("Enter point2's x-, y- coordinates: ");
	double x2 = input.nextDouble();
	double y2 = input.nextDouble();
	Point2D p1 = new Point2D(x1, y1);
	Point2D p2 = new Point2D(x2, y2);
	System.out.println("p1 is " + p1.toString());
	System.out.println("p2 is " + p2.toString());
	System.out.println(" The distance between p1 and p2 is" + p1.distance(p2));

	
	
	
}	
}	
	
	
	
	
	
	
	
	
	
	
	

