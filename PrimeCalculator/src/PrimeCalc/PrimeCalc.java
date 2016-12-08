package PrimeCalc;
import java.util.*;


public class PrimeCalc {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int doWhile = 1;
		
		while (doWhile == 1) {	
			System.out.println("Please input a number to check if it is prime");
			double num = sc.nextDouble();
			boolean Prime = isPrime.isPrime( num);
			
			if (Prime == true)
			{
				System.out.println("The number " + num + " is prime.");
			}
			else if (Prime == false)
			{
				System.out.println("The number " + num + " is not prime.");
			}
			else
			{
				System.out.println("everything is broken...]");
			}
			
			System.out.println("Type 1 to run again or 0 to shut down");
			int status = sc.nextInt();
			if (status == 0)
				{
					doWhile = status;
				}
			else
			{
				//do nothing
			}
		}
	}

}
