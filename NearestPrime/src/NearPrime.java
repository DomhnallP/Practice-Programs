import java.util.*;

public class NearPrime {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your lower boundary");
		int rangeMin = sc.nextInt();
		System.out.println("Enter your upper boundary");
		int rangeMax = sc.nextInt();
		
		int[] integers = new int[rangeMax-rangeMin];
		
		for( int i = rangeMin;i<=rangeMax; i++)
		{
		    boolean isPrime = PrimeAdd.AddPrime(i);
		    
		    if (isPrime == true)
		    {
		    	integers[i-rangeMin] = i;
		    }
		    else
		    {
		    	//do nothing
		    }
		    
		    System.out.println(integers[i-rangeMin]);
		}
	}

}
