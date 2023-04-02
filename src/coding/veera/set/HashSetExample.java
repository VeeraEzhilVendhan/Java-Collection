package coding.veera.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
	
	public static void main(String[] args) {
		
		ArrayList<String> arrList=new ArrayList<String>();
		arrList.add("Sunday");
		arrList.add("Monday");
		arrList.add("Tuesday");
		arrList.add("Wednesday");
		arrList.add("Thursday");
		arrList.add("Friday");
		arrList.add("Saturday");
		
		HashSet<String> hashSet=new HashSet<String>(arrList);
		Iterator<String> setItertor=hashSet.iterator();
		while(setItertor.hasNext()) {
			System.out.print(setItertor.next()+" ");
		}
		System.out.println();
		
		System.out.println("Trying to add duplicate value");
		hashSet.add("Monday");
		System.out.println(hashSet);
		
		System.out.println("Size "+hashSet.size());
		System.out.println("Is empty "+hashSet.isEmpty());
		System.out.println("Performing clear....");
		hashSet.clear();
		System.out.println("Is empty "+hashSet.isEmpty());
		
	}

}
