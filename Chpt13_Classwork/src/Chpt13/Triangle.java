package Chpt13;


public class Triangle extends GeometricObject
	{
	//variable declaration
		double side1,side2,side3;
		boolean filled;
	//findArea()
	public double getArea()
	{
	//variable declaration
		double area,s;
	
		s = ( side1 + side2 + side3 ) /2;
	//calculating area
		area = Math.sqrt(s * (s-side1) * (s-side2) * (s-side3));
	
		return area;
	}
	
	//Triangle
	public Triangle(double s1,double s2,double s3)
	{
		side1=s1;
		side2=s2;
		side3=s3;
	}
	public void setfilled(boolean tri)
	{
		filled = tri;
	}
	public boolean getfilled()
	{
		return filled;
	}
	
	//findPerimeter
	public double getPerimeter()
	{
		double perimeter;
	//calculating Perimeter
		perimeter = (side1 + side2 + side3);
		return perimeter;
	}
	public String toString()
	{
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}
	
	/*public static void main(String args[])
	{
		Triangle tri = new Triangle(1, 1.5, 1);
			tri.setColor("blue");
			tri.setFilled(true);
	
			System.out.println("The area is " + tri.findArea());
			System.out.println("The perimeter is " + tri.findPerimeter());
			System.out.println("The color is " + tri.getColor());
			System.out.println("filled " + tri.getfilled());
	}*/
	
}