package coding.veera.list;

import java.util.Iterator;
import java.util.Stack;

public class StackExample {
	
	public static void main(String[] args) {
		
		Stack<Integer> s=new Stack<Integer>();
		s.push(45);
		s.push(11);
		s.push(23);
		s.push(44);
		s.push(2);
		s.push(35);
		s.push(56);
		s.push(68);
		s.push(34);
		s.push(11);
		s.push(14);
		System.out.println(s);
		Iterator<Integer> i=s.iterator();
		while(i.hasNext()) {
			System.out.print(i.next()+" ");
		}
		System.out.println();
		System.out.println("Peek - "+s.peek());
		System.out.println(s);
		System.out.println("Pop - "+s.pop());
		System.out.println(s);
		System.out.println("Searching 11 - "+s.search(11));
		
	}

}
