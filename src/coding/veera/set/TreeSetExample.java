package coding.veera.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
	
	public static void main(String[] args) {
		
		TreeSet<Integer> intTreeSet=new TreeSet<Integer>();
		intTreeSet.add(44);
		intTreeSet.add(55);
		intTreeSet.add(34);
		intTreeSet.add(2);
		intTreeSet.add(11);
		intTreeSet.add(14);
		intTreeSet.add(4);
		
		Iterator<Integer> iTS=intTreeSet.iterator();
		while(iTS.hasNext()) {
			System.out.print(iTS.next()+" ");
		}
		System.out.println();
		
		System.out.println("Reversing the TreeSet using descending iterator");
		Iterator<Integer> diTS=intTreeSet.descendingIterator();
		while(diTS.hasNext()) {
			System.out.print(diTS.next()+" ");
		}
		
		System.out.println();
		System.out.println(intTreeSet);
		
		System.out.println("Ceiling");
		System.out.println(intTreeSet.ceiling(6));
		System.out.println("Floor");
		System.out.println(intTreeSet.floor(6));
		
		System.out.println("HeadSet");
		boolean inclusive=true;
		System.out.println(intTreeSet.headSet(10,inclusive));
		
		System.out.println("SubSet");
		System.out.println(intTreeSet.subSet(10, 20));
		System.out.println(intTreeSet.subSet(10, true, 20, true));
		
		System.out.println("TailSet");
		System.out.println(intTreeSet.tailSet(20,inclusive));
		
	}

}
