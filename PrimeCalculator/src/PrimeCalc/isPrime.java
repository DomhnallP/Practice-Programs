package PrimeCalc;

public class isPrime {
	
	public static boolean isPrime(double num){
		
		if (num > 2 && num%2==0) {
			return false;
		}
		
		double top = (double)Math.sqrt(num) + 1;
		for (int i = 3; i< top; i+=2)
		{
			if (num% i == 0)
			{
				return false;
			}
		}
		return true;
	}

}
