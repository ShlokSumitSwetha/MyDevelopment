package linkedHasMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTest {

	public static void main(String[] args) {

		
		Map map=new LinkedHashMap(3){
			protected boolean removeEldestEntry(Map.Entry eldest) {
		        return size() > 3;
		     }
		};
		
		map.put(4, "child2");// least recently used
		map.put(1, "Sumit");
		map.put(2, "Swetha");
		map.put(3, "Shlok");
		map.put(null, null);
		map.put(null, "Sumit");
		System.out.println(map);
		
		
		
		
		
		
	}
	

}
