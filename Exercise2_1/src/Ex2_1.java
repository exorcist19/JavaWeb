import java.util.Scanner;

public class Ex2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner (System.in);

System.out.print("Enter a degree in Celscius: ");
double celscius = input.nextDouble();

//Change Celscius to  Farenheight
double farenheit = (9.0 / 5.0) * celscius + 32;
System.out.println("Celcius " + celscius + " is " + farenheit + " in Celcius") ;

	}

}
