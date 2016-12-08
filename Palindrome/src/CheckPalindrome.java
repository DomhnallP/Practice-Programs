import java.util.*;


public class CheckPalindrome {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine(), s2 = "";
		input.replace(" ","b");
		//System.out.println(input);
		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < input.length(); i++) {
			if(input.charAt(i) != ' ')
			{
				//stack.push(input.charAt(i));
				s2 += input.charAt(i);
			}
			
		}
		for (int i = 0; i < s2.length(); i++) {
			stack.push(s2.charAt(i));
		}
		

		String reverseInput = "";

		while (!stack.isEmpty()) {
			reverseInput += stack.pop();
		}
		if (s2.equals(reverseInput))
			System.out.println("TRUE");
		else
			System.out.println("FALSE");
	}
}
