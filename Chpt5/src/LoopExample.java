
public class LoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //While Loop
		int  i = 0;
		while (i<5)
		{
		System.out.println("Value of i is " +i);
		i++;
		}
		
		
		
		
		
		//For Loop
		for(i = 0; i < 5; i++)
		{
			System.out.println(" For loop value of i is " +i);
		}
		
		
		
		
		
		i = 0;
		do
		{
		System.out.println("Value of i is " +i);
		i++;
		} while(i < 5);
		
		
		for( i=1; i <=9; i++)
		{
			System.out.print(i + "|");
				for (int j = 1; j <= 9; j++)
				{
				System.out.printf ("%4d", i + j);
				}
				System.out.println();
		}
		
		
		int num = 0;
		int sum = 0;
		while (num < 20)
		{
			num++;
			sum = sum + num;
			if (sum >= 100)
				break;
		}
		System.out.println(" Numbers is " + num);
		System.out.println("Sum is " + sum);
		
		}
		
		
	}


