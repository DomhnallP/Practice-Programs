package ut1;

import java.util.Scanner;

public class MiddleQueue {

	public static void main(String args[])
	{

		Scanner sc = new Scanner(System.in);
		Queue queue = new Queue(20);
		String REMOVE = "REMOVE";
		while(sc.hasNext())
		{
			String input= sc.next();
			//System.out.println(input);
				if(input.equals("INSERT"))
				{
					queue.insert(sc.next());
				}
				if(input.equals(REMOVE) && !queue.isEmpty())
				{
					queue.remove();
				}
			}
			
		if(!queue.isEmpty())
		{
			System.out.println(queue.middle());
		}
		else if(queue.isEmpty())
		{
			System.out.println("empty");
		}
	}



}
class Queue
{
	private int maxSize;
	private String[] queArray;
	private int front;
	private int rear;
	private int nItems;

	public Queue(int s) { // constructor

		maxSize = s;
		queArray = new String[maxSize];
		front = 0;
		rear = -1;
		nItems = 0;
	}
	public boolean insert(String j) { // put item at rear of queue
		if(isFull()) return false; //don’t remove if full
		if(rear == maxSize-1) // deal with wraparound
			rear = -1;
		rear++;
		queArray[rear] = j; // increment rear and insert
		nItems++; // one more item
		return true; 
	}//suc
	public String remove() { // take item from front of queue
		if(isEmpty()) return "empty"; //don’t remove if empty
		String temp = queArray[front];// get value and incr front
		front++;
		if(front == maxSize) // deal with wraparound
			front = 0;
		nItems--; // one less item
		return temp;
	} 
	public String peekFront(){ // peek at front of queue

		return queArray[front];
	}
	public boolean isEmpty() { // true if queue is empty

		return (nItems==0);
	}
	public boolean isFull() { // true if queue is full

		return (nItems==maxSize);
	}
	public int size() { // number of items in queue

		return nItems;
	} 
	public String middle()
	{
		String middle;
		if(nItems%2==0)
		{
			middle = queArray[(nItems/2) -
			                  1];
		}
		else
		{
			middle = queArray[(nItems/2)];
		}
		return middle;		
	}
/* Enter the Priority Queue methods here */
}