import java.util.*;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String blah = sc.nextLine();
		for(int y = 0;y<blah.length();y++)
		{
			if (blah.charAt(y)==' ')
			{
				int number = Integer.parseInt(blah.substring(y+1, blah.length()));
				// TODO Auto-generated method stub
				System.out.println(number);
			}
		}

	}

}
