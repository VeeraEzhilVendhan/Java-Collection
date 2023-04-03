package coding.veera.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
	
	public static void main(String[] args) {
		
		TreeMap<Integer,String> tmap=new TreeMap<Integer,String>();
		tmap.put(1, "pen");
		tmap.put(2, "eraser");
		tmap.put(5, "pencil");
		tmap.put(3, "scale");
		tmap.put(6, "sharpner");
		tmap.put(4, "geomentry-box");
		
		for(Map.Entry<Integer, String> mentry:tmap.entrySet()) {
			System.out.print(mentry.getKey()+"-"+mentry.getValue()+" ");
		}

		System.out.println();
		boolean inclusive=true;

		System.out.println("Head Map - "+tmap.headMap(3, inclusive));
		System.out.println("Sub Map - "+tmap.subMap(3, inclusive, 5, inclusive));
		System.out.println("Tail Map - "+tmap.tailMap(4,inclusive));
		
		System.out.println("Remove 4rd key and value - "+tmap.remove(4,"geomentry-box"));
		System.out.println(tmap);
	}

}
