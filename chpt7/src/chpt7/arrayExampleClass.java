package chpt7;
import java.util.Arrays;
import java.util.Scanner;
public class arrayExampleClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] myList = new double[4];
		double[] myList2 = new double[4];
		
		myList[0] = 1.9; myList[1] = 2.9;
		
		for (double e: myList ) { System.out.println(e); }
		
		
		//copying array
		
		System.out.print("After copying array in myList2 \n");
		myList2 = myList;
		for(double e: myList2) { System.out.println(e); }
		
		/*Scanner input = new java.util.Scanner(System.in);
		System.out.println("Enter " + myList.length + " values: ");
		for (int i = 0; i < myList.length; i++)
		myList[i] = input.nextDouble();
		for (double e: myList ) { System.out.println(e); }*/
			
		printArray(new int[] {3, 1, 2, 6, 4, 2});
		
		System.out.println("\n pass by sharing");
		int[] a = {1,2};
		System.out.println("Before invoking swapFirstTwoInArray");
		System.out.println("array is {" + a[0] + ", " + a[1] + "}");
		swapFirstTwoArray(a);
		System.out.println("After invoking swapFirstTwoArray");
		System.out.println("array is {" + a[0] + ", " + a[1] + "}");
		
		
		
		int[] list1 = {11, 12, 3, 4, 5, 6};
		int[] list2 = reverse(list1);
	    System.out.println("Reversed List: ");
	    for (double e : list2) { System.out.println(e);}
	    
	    System.out.println("Linear searching");
	    int[] list = {1, 4, 4, 2, 5, -3, 6, 2};
	    int i = LinearSearch(list, -3);
	    System.out.println("value found in an array is " + "at location  "+i);
		
	    
	    double[] numbers = {6.0, 4.4 ,1.9, 2.9, 3.4, 3.5};
	    Arrays.sort(numbers);
	    for (double e: numbers) { System.out.println(e);}
	    char[] chars = {'a', 'c', 'g', 'x', 'y', 'z'};
	    System.out.println("Index is " +
	    Arrays.binarySearch(chars, 'a'));
	    
	    int[] list3 = {2, 4, 7, 10};
	    int[] list4 = {2, 4, 7, 10}; 
	    int[] list5 = {4, 2, 7, 10};
	    System.out.println(Arrays.equals(list3, list4));
	    System.out.println(Arrays.equals(list4,  list5));
	    
	    
		}
		public static void printArray(int[] array) {
			System.out.print("print. array");
		for (int i = 0; i < array.length; i++) {
		System.out.print(+array[i] + "    " ); }}
		
		
		public static void swapFirstTwoArray(int[] array) {
		int temp = array[0];
		array[0] = array[1];
		array[1] = temp;
		}
		
		public static int[] reverse(int[]list) {
		int[] result = new int[list.length];
		for (int i = 0, j = result.length - 1;i < list.length; i++, j--) {
		result [j] = list[i];
		}
		return result; }
		
		public static int LinearSearch(int[] list, int key) {
		for (int i = 0; i < list.length; i++) {
		if (key == list[i])
		return i; }
		return -1;}
		
		
		
		
		}
		
		
		
	


