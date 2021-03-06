package Chpt13;


public class TestGeometricObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GeometricObject geoObject1 = new CircleObject(5);
		
		GeometricObject geoObject2 = new Triangle(5, 3, 4);
		 System.out.println("The two objects have the same area? " + 
				 equalArea(geoObject1, geoObject2));
		 
		 displayGeometricObject(geoObject1);
		 
		 
		 displayGeometricObject(geoObject2);
		 
	  }
	  
	  public static boolean equalArea(GeometricObject object1, 
			  GeometricObject object2) {
		  return object1.getArea() == object2.getArea();
		  
	  }
	  public static void displayGeometricObject(GeometricObject object) {
	  	System.out.println();
	  	System.out.println("The area is " + object.getArea());
	  	System.out.println("The perimeter is " + object.getPerimeter());
}
		
		

		
	}


