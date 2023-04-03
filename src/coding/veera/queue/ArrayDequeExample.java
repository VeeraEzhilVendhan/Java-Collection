package coding.veera.queue;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDequeExample {
	
	public static void main(String[] args) {
		
		ArrayDeque<Integer> adq=new ArrayDeque<Integer>();
		adq.add(10);
		adq.add(49);
		adq.offer(23);
		adq.add(15);
		adq.add(3);
		adq.add(9);
		adq.add(32);
		adq.add(14);
		adq.add(26);
		adq.add(26);
		
		Iterator<Integer> idq=adq.iterator();
		while(idq.hasNext()) {
			System.out.print(idq.next()+" ");
		}
		System.out.println();
		
		System.out.println("Peek - "+adq.peek());
		System.out.println(adq);
		System.out.println("Poll First - "+adq.pollFirst());
		System.out.println(adq);
		System.out.println("Poll Last - "+adq.pollLast());
		System.out.println(adq);
		System.out.println("Offer First - "+adq.offerFirst(1));
		System.out.println(adq);
		System.out.println("Offer Last - "+adq.offerLast(10));
		System.out.println(adq);
		System.out.println("Size - "+adq.size());
		System.out.println("Is empty - "+adq.isEmpty());
		System.out.println("Clear ");
		adq.clear();
		System.out.println(adq);
		System.out.println("Is empty - "+adq.isEmpty());
		
		
	}

}
