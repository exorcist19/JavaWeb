import java.util.Scanner;

public class conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 final float pound = 2.22f;
		 
	       System.out.println("Kilograms   Pounds");
	       for(int i = 1; i < 200; i = i+2){
	    	   
	           System.out.printf("%-12d%-8.2f\n",i ,+(i * pound));
	       }
	    }
	}

