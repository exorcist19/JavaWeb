package Chpt13;

public class SortTriangles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComparableTriangle[] triangles = {
			new ComparableTriangle(3.4, 5.4, 6.3),		
			new ComparableTriangle(13.24, 56.4,  26.57),
			new ComparableTriangle(25.46, 35.47, 47.1),
			new ComparableTriangle(11.6, 24.5, 17.6)};
		 java.util.Arrays.sort(triangles);
		 for (Triangle triangle : triangles) {
			 System.out.println(triangle + " ");
			 System.out.println();
		 }
				
				
	}

}
