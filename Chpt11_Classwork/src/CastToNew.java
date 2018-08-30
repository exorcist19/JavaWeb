import Chpt13.CircleObject;

public class CastToNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Object object1 = new CircleObject(23.75, "yellow", true);
		
		displayObject(object1);
		
	}
	
	public static void displayObject(Object object) {
		if (object instanceof CircleObject) {
			System.out.println("The circle area is " + ((CircleObject)object).getArea());
		
		System.out.println("The circle diameter is " + ((CircleObject)object).getDiameter());
		}
	/* else if (object instanceof
	 * 					RectangleFromCircleObject {
	 * System.out.println("The rectangle area is " +
	 * 	((RectangleFromSimpleGeometricObject).getArea());
	 */
	}
		
		

}
