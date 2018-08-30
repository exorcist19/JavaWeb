package chpt9;

import java.util.Date;
import java.util.Scanner;
import javafx.geometry.Point2D;
public class Chapter9Class {

	public static void main(String[] args) {
		SimpleCircle circle1 = new SimpleCircle();
		System.out.println("The area of the circle of radius " + circle1.radius + " is " + circle1.getArea() + "  " + circle1.noOfObjects);
		SimpleCircle circle2 = new SimpleCircle();
		System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea() + "  " + circle2.noOfObjects);
		System.out.println("The area of the circle of radius " + circle1.radius + " is " + circle1.getArea() + "  " + circle1.noOfObjects);
		Date date = new Date();
		System.out.println("The elapsed time since Jan 1, 1970 is ");
		System.out.println(date.toString());
		//Point2d
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter point1's x-, y-coordninates: ");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		System.out.println("Enter point2's x-, y- coordinates: ");
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		Point2D p1 = new Point2D(x1, y1);
		Point2D p2 = new Point2D(x2, y2);
		System.out.println("p1 is " + p1.toString());
		System.out.println("p2 is " + p2.toString());
		System.out.println("The distance between p1 and p2 is " + p1.distance(p2));
		
	}
}
