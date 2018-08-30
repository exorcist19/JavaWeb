import java.awt.Rectangle;

//import .CircleObject;

public class testCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			CircleObject circle = new CircleObject(1.0, "red", true);
				
			System.out.println("A circle " + circle.toString());
			System.out.println("The color is " + circle.getColor());
			System.out.println("The radius is " + circle.getRadius());
			System.out.println("The area is " + circle.getArea());
		    System.out.println("The diameter is " + circle.getDiameter());
		    
		    /*Rectangle rectangle = new Rectangle(2, 4);
		    System.out.println("\nA rectangle " + rectangle.toString());
		    System.out.println("The area is " + rectangle.toString());
		    System.out.println("The perimeter is " + rectangle.getPerimeter());		*/		
	}

}
