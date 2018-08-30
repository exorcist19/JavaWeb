package Chpt13;

public class ComparableTriangle extends Triangle
implements Comparable<ComparableTriangle>
{
	public ComparableTriangle (double side1, double side2, double side3) {
		super(side1 ,side2, side3);
		
    }
	public int compareTo(ComparableTriangle o) {
		if (getArea() > o.getArea())
			return 1;
			else if (getArea() < o.getArea())
			return -1;
			else
				return 0;
	
	}
		public String toString() {
			return "side1: " + side1 + " side2: " + side2 + "side3: " + side3 +
					" Area: " + getArea();
		}
		
		
		
	}
