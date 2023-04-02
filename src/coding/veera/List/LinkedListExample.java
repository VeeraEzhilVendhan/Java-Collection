package coding.veera.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
	
	public static void main(String[] args) {
		
		LinkedList<String> linkedList=new LinkedList<String>();
		linkedList.add("Green");
		linkedList.add("Blue");
		linkedList.add("White");
		linkedList.add("Blue");
		linkedList.add("Green");
		linkedList.add("Red");
		linkedList.add("White");
		linkedList.add("Violet");
		linkedList.add("Red");
		
		System.out.println("Printing LinkedList using Itertor");
		Iterator<String> itr=linkedList.iterator();		
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		
		System.out.println("\n\nPrinting LinkedList using Itertor descending order");
		Iterator<String> itrDesc=linkedList.descendingIterator();
		while(itrDesc.hasNext()) {
			System.out.print(itrDesc.next()+" ");
		}
		
		System.out.println("\n\nRemoving First Element");
		linkedList.removeFirst();
		System.out.println(linkedList);
		
		System.out.println("\nRemoving Last Element");
		linkedList.removeLast();
		System.out.println(linkedList);
		
		System.out.println("\nRemoving First Occurence of White");
		linkedList.removeFirstOccurrence("White");
		System.out.println(linkedList);
		
		
		System.out.println("\nRemoving Last Occurence of Blue");
		linkedList.removeLastOccurrence("Blue");
		System.out.println(linkedList);
		
		System.out.println("\nSorted LinkedList");
		Collections.sort(linkedList);
		System.out.println(linkedList);
		
		System.out.println("\nPoll - retrieve and remove first element");
		System.out.println(linkedList.poll());
		System.out.println(linkedList);
		
		System.out.println("\nPeek - retrieve first element");
		System.out.println(linkedList.peek());
		System.out.println(linkedList);
			
		System.out.println("\nPop - retrieve and remove first element");
		System.out.println(linkedList.pop());
		System.out.println(linkedList);
		
		
	}

}
