package coding.veera.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	
	public static void main(String[] args) {
		
		HashMap<Integer,String> hmap=new HashMap<Integer,String>();
		hmap.put(1, "cycle");
		hmap.put(2, "bike");
		hmap.put(3,"car");
		hmap.put(4, "van");
		hmap.put(5, "bus");
		hmap.put(null, null);
		
		for(Map.Entry<Integer,String> m:hmap.entrySet()) {
			System.out.print(m.getKey()+" "+m.getValue()+" ");
		}
		System.out.println();
		System.out.println("Contains key 5 - "+hmap.containsKey(5));
		System.out.println("Contains value bike - "+hmap.containsValue("bike"));
		System.out.println(hmap);
		System.out.println("Get the value of key 1 - "+hmap.get(1));
		System.out.println("Remove 2 key value pair - "+hmap.remove(2));
		System.out.println(hmap);
		System.out.println("Replace 5th key value and prints old value - "+hmap.replace(5, "air-bus"));


	}

}
