abstract class GeometricObject_2
{
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;
	
	protected GeometricObject_2()
	{
		dateCreated = new java.util.Date();
	}
	protected GeometricObject_2(String Color, boolean filled)
	{
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}
	public String getColor()
	{
		return color;
	}
	public void setColor(String color)
	{
		this.color = color;
	}
	public boolean isFilled;
	{
		this.filled = filled;
	}
	public java.util.Date getdateCreated()
	{
		return dateCreated;
	}
	public String toString()
	{
		return "created on "+dateCreated+"\ncolor: "+color+" and filled: "+filled;
	}
	public abstract double getArea();
	public abstract double getPerimeter();
	}
	class Circle extends GeometricObject_2
	{
		public double radius;
		public Circle(double radius)
		{
			this.radius = radius;
		}
		
		
		
	

	
	
	public double getPerimeter()
	{
		return Math.PI * radius * radius;
	}
	public double getArea()
	{
		return 2 * Math.PI *radius;
	}
	public boolean equals(Object obj)
	{
		if(this.radius == ((Circle)obj).radius)
		return true;
		return false;
	}
	}
	class ComparableCircle extends Circle implements Comparable
	{
		public ComparableCircle(double rad)
	{
		super (rad);
	}
	public int compareTo(Object o)
	{
		if (getArea() > ((ComparableCircle)o).getArea())
			return 1;
		else if (getArea() < ((ComparableCircle)o).getArea())
			return -1;
		else
			return 0;
	}
	}
	class TestEqualCircle
	{
		public static void main(String[] args)
	{
			Circle cc = new Circle (6);
			Circle cc1 = new Circle(6);
			boolean res = cc.equals(cc1);
			
		System.out.println("Result: "+res);
	
		
	}
	}