package chpt9;

public class SimpleCircle {
	double radius;
	static int noOfObjects = 0;
	
	/**construct a circle with radius 1 **/
	SimpleCircle() { radius =1;
	++noOfObjects;}
	SimpleCircle(double newRadius) {radius = newRadius;}
	double getArea() {return radius * radius *Math.PI;}
	double getPermieter() {return 2 * radius * Math.PI;}
	void setRadius(double newRadius) {
		radius = newRadius;
	}

	
	
	
}

