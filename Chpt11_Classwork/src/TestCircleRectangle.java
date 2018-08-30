import Chpt13.CircleObject;

public class TestCircleRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircleObject circle = new CircleObject(1);
		System.out.println("A circle " + circle.toString());
		System.out.println("The color is " + circle.getColor());
		System.out.println("The radius is " + circle.getRadius());
		System.out.println("The area is " + circle.getArea());
		System.out.println("The diameter is " + circle.getDiameter());
		
		/*TestCircleRectangle rectangle = new TestCircleRectangle(2, 4);
		System.out.println("\nA rectangle "+ rectangle.toString());
		System.out.println("The area is " + rectangle.getArea());
		System.out.println("The perimeter is " + rectangle.getPerimeter());*/
	}

}
