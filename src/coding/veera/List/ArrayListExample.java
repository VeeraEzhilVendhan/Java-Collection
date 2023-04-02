package coding.veera.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {
	
	public static void main(String[] args)
	{
		
		ArrayList<Integer> intArrList=new ArrayList<Integer>(10);
		
		intArrList.add(4);
		intArrList.add(56);
		intArrList.add(3);
		intArrList.add(8);
		intArrList.add(23);
		intArrList.add(12);
		intArrList.add(6);
		
		System.out.println("Printing ArrayList using Itertor");
		Iterator<Integer> itr=intArrList.iterator();		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("Sorting ArrayList");
		Collections.sort(intArrList);
		System.out.println(intArrList);
		
		System.out.println("Manipulating ArrayList");
		intArrList.add(65);
		intArrList.remove(1);
		intArrList.remove((Object)6);		
		intArrList.set(1, 1);
		System.out.println(intArrList);
		System.out.println("getting element from 2 - "+intArrList.get(2));
		
		ArrayList<Integer> intArrListNew=new ArrayList<Integer>();
		intArrListNew.add(2);
		intArrListNew.add(3);
		intArrListNew.add(4);
		intArrListNew.add(5);	
		System.out.println("New ArrayList");
		System.out.println(intArrListNew);
		
		System.out.println("Adding new ArrayList at 2 index");
		intArrList.addAll(2,intArrListNew);
		System.out.println(intArrList);
		
		System.out.println("Retaning ArrayList only with new ArrayList");
		intArrList.retainAll(intArrListNew);
		System.out.println(intArrList);

	}

}
