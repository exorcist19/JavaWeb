
public class MethodExampleClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printGrade(78.5);
		//int =1;
		//System.out.println"The sum from 1 to 10 is " = sum(1, 10)
		int x=1;
		System.out.println("Before the call, x is  " + x);
	    increment(x);
		System.out.println("After the call, x is " + x);
		 
		 
		 
		 
		 System.out.println("The sum of 1 to 10 is " + sum(1, 10));
		 
		 System.out.println("The maximum of 3 and 4 is " + max(3,4));
		 
		 System.out.println("the maximun of 3.0 and 5.4 is " + max(3.0, 5.4));
		 
		 System.out.println("The maximum of 3.0, 5.4, and 10.14 is " + max(3.0, 5.4, 10.14));
		 
		
	}
public static void printGrade(double score) {
if (score >= 90.0) {
	System.out.println('A');
}
else if ( score >= 80.0) {
System.out.println('B');
}
else if (score >= 70) {
System.out.println('C');
} else if (score >= 60.00) {
	System.out.println('D');
}
else {
System.out.println('F');

}
}




public static void increment(int n) {
	n++;
	System.out.println("n inside the method is " + n);
}

public static int sum(int i1, int i2)
{ int result = 0;

for(int i = i1; i <= i2; i++)
result += i ;
return result;
}

public static int max(int num1, int num2) {
if(num1 > num2)
return num1;
else 
return num2;
}
public static double max(double num1, double num2) {
if(num1 > num2)
	return num1;
else
	return num2;
}
public static double max(double num1, double num2, double num3)
{
return max(max(num1, num2), num3);
}

}



