package biasedCoin;
import java.util.*;

public class biasedCoin {
	
	public static void main(String args[] ) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int N = 17;
		int H = 49;
		double prob;
		int counter = 0;

		for (int x = 0 ; x < 1000000; x++)
		{
			int counter2 = 0;
			for (int y=0 ; y<N; y++)
			{
				
				int landsHeads = (random.nextInt(100));
				//System.out.println(landsHeads);
				if(landsHeads < H)
				{
					counter2++;
				}
			}
			if(counter2>N/2)
			{
				counter++;
			}
		}

		prob = (counter*100)/1000000;
		int  finalProb = (int) Math.round(prob);
		System.out.println(finalProb+1);

	}
	 



}