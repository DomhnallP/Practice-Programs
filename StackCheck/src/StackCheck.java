
import java.util.Scanner;

public class StackCheck 
{
	public static void main(String args[] ) 
	{
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		String[] command = new String[length+1];
		for(int x = 0; x <command.length;x++)
		{
			command[x]=sc.nextLine().toUpperCase();
		}
		Stack stack = new Stack(length+1);

		for(int x = 0; x <command.length;x++)
		{
			for(int y = 0; y < command[x].length();y++)
			{
				if(command[x].charAt(y) == ' ')
				{
					String com = command[x].substring(0, y+1);
					//System.out.println(com);
					if(com.charAt(1) == 'U')
					{
						int number = Integer.parseInt(command[x].substring(y+1, command[x].length()));
						stack.push(number);
					}

				}
				else
				{
					System.out.println("test");
					stack.pop();
				}

			}


		}
		
		if (!stack.isEmpty())
		{	
			System.out.println(stack.pop());
		}
		else if(stack.isEmpty())
		{
			System.out.println("empty");
		}
	}



}

class Stack{

	private int maxSize;        // size of stack array
	private int[] stackArray;
	private int top;            // top of stack

	public Stack(int s) {         // constructor    
		maxSize = s; // set array size
		stackArray = new int[maxSize]; // create array
		top = -1; 
	}

	public void push(int j) {    // put item on top of stack
		top++;
		stackArray[top] = j; // increment top, insert item
	}      

	public int pop() {           // take item from top of stack
		return stackArray[top--];
	} 

	public int peek() {          // peek at top of stack
		return stackArray[top];
	}   

	public boolean isEmpty() {   // true if stack is empty  
		return (top == -1);
	}      

	public boolean isFull() {     // true if stack is full  
		return (top == maxSize-1);
	}      

	public void makeEmpty() {     // empty stack 
		top=-1;
	}
}