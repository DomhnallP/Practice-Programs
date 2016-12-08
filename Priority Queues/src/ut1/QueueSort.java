package ut1;

import java.util.*;

public class QueueSort {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Queue helpmeplz = new Queue(20);
		while(sc.hasNextInt()){
			int x = sc.nextInt();
			helpmeplz.insert(x);
		}
		while (!helpmeplz.isEmpty())
		{
			System.out.println(helpmeplz.remove());
		}
	}
}
class Queue{
	private int maxSize;
	private long[] queArray;
	private int front;
	private int rear;
	private int nItems;

	public Queue(int s) { // constructor

		maxSize = s;
		queArray = new long[maxSize];
		front = 0;
		rear = -1;
		nItems = 0;
	}
	public void insert(long item) { // insert item

		if(nItems==0){ // if no items,
			queArray[0] = item; // insert at 0
		}else{ // if some items,
			int j = nItems; // start at end

			while(j > 0 && queArray[j-1] > item){ // while newitem larger
				queArray[j] = queArray[j-1]; // shift upward
				j--; // decrement j
			}
			queArray[j] = item; // insert it
		}
		nItems++; // increase items
	}
	public long remove() { // take item from front of queue
		if(isEmpty()) return 0; //don’t remove if empty
		long temp = queArray[front];// get value and incr front
		front++;
		if(front == maxSize) // deal with wraparound
			front = 0;
		nItems--; // one less item
		return temp;
	} 
	public long peekFront(){ // peek at front of queue

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


	/* Enter the Priority Queue methods here */
}