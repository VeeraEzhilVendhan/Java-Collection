package coding.veera.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {
	
	public static void main(String[] args) {
		
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		lhs.add("Car");
		lhs.add("Plane");
		lhs.add("Cycle");
		lhs.add("Bike");
		lhs.add("Van");
		lhs.add("Bus");
		
		Iterator<String> ihsi=lhs.iterator();
		while(ihsi.hasNext()) {
			System.out.print(ihsi.next()+" ");
		}
		
		System.out.println();
		
		System.out.println("Trying to add duplicate elements");
		lhs.add("Bus");
		System.out.println(lhs);
		
		System.out.println("Removing Cycle");
		System.out.println("Removed cycle from linked hashset "+lhs.remove("Cycle"));
		System.out.println(lhs);
	}

}
