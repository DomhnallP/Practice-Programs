package linkLengthCheck;

import java.util.*;

public class lengthCheck {
	public static void main(String args[] ) throws Exception {
		Scanner myscanner = new Scanner(System.in);
		int num = Integer.parseInt(myscanner.nextLine());
		Link[] array = new Link[num];
		for(int i=0;i<num;i++){
			array[i]=new Link(myscanner.nextLine());    
		}
		while(myscanner.hasNext()){
			int select=myscanner.nextInt();
			int next=myscanner.nextInt();
			if(next!=-1){
				array[select].next=array[next];
			}
		}
		LinkedList mylist = new LinkedList();
		if(num>0){
			mylist.first=array[0];
		}
		System.out.println(findLoopLength(mylist));
	}
	public static int findLoopLength(LinkedList mylist){
		if(mylist.isEmpty())
		{
			return 0;
		}
		Link[] linkArray = new Link[100];
		int counter = 0;
		int index = 0;
		Link link1 = mylist.first;

		while(link1.next!=null){
			linkArray[counter]=link1;
			for(int i = 0; i <= counter; i++){
				if(link1.next==linkArray[i]){
					return counter-(i-1);
				}

			}
			link1=link1.next;
			counter++;
		}
		return 0;
	}
}

class Link{
	public String data;
	public Link next;

	public Link(String input){
		data=input;
		next=null;
	}
}

class LinkedList {
	public Link first;

	public LinkedList( ){
		first=null;
	}

	public boolean isEmpty( ){
		return (first==null);
	}

	public void insertHead(Link insert){
		if(isEmpty()){
			first=insert;
		}else{
			insert.next=first;
			first=insert;
		}
	}
}
