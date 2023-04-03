package coding.veera.queue;

import java.util.PriorityQueue;

public class PriorityQueueExample {
	
	public static void main(String[] args) {
		
		PriorityQueue<String> pq=new PriorityQueue<String>();
		pq.add("apple");
		pq.add("orange");
		pq.add("banana"); 
		pq.add("jackfruit"); 
		pq.add("pomogranade");
		pq.add("blueberry");
		
		for(String fruit:pq) {
			System.out.print(fruit+" ");
		}
		System.out.println();
		System.out.println("Peek - " +pq.peek());
		System.out.println("Poll - "+pq.poll());
		System.out.println(pq);
		System.out.println("Offer - "+pq.offer("new-fruit"));
		System.out.println(pq);
		System.out.println("Add - "+pq.add("apple"));
		System.out.println(pq);
	}

}
