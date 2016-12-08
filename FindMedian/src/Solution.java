import java.util.*;

public class Solution {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		String[] stringArray = new String[length+1];
		int[] ageArray = new int[length+1];
		for(int x = 0; x < stringArray.length; x++)
		{
			stringArray[x] = sc.nextLine();
		}
		for(int x = 0; x < stringArray.length; x++)
		{
			for(int y = 0; y<stringArray[x].length(); y++)
			{
				if(stringArray[x].charAt(y) == ' ')
				{
					int temp = Integer.parseInt(stringArray[x].substring(y+1,stringArray[x].length()));
					ageArray[x]=temp;
				}
			}
		}
		Arrays.sort(ageArray);	
		for(int x = 0; x < stringArray.length; x++)
		{
			for(int y = 0; y<stringArray[x].length(); y++)
			{
				if(stringArray[x].charAt(y) == ' ')
				{
					int temp = Integer.parseInt(stringArray[x].substring(y+1,stringArray[x].length()));
					if (temp == ageArray[ageArray.length/2])
					{
						System.out.println(stringArray[x].substring(0, y));
					}
				}
			}
		}	
	}
}
