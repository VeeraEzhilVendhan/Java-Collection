package coding.veera.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
	
	public static void main(String[] args) {
		
		LinkedHashMap<Integer,String> lhm=new LinkedHashMap<Integer,String>();
		lhm.put(1, "a");
		lhm.put(2, "b");
		lhm.put(8, "n");
		lhm.put(4, "d");
		lhm.put(5, "e");
		lhm.put(6, "f");
		lhm.put(7, "g");
		
		for(Map.Entry<Integer,String> m:lhm.entrySet()) {
			System.out.print(m.getKey()+"-"+m.getValue()+" ");
		}
		System.out.println();
		System.out.println("Keys of linked hash map - "+lhm.keySet());
		System.out.println("Values of linked hash map - "+lhm.values());
		System.out.println("Entry of linked hash map - "+lhm.entrySet());
		System.out.println("Removed value of key 8 - "+lhm.remove(8));
		System.out.println(lhm);
	}

}
