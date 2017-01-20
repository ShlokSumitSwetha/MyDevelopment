package weakHashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapTest {

	public static void main(String[] args) {
		
		Object obj1=new Object();
		Object obj2=new Object();
	
		Map map=new WeakHashMap();
		map.put(obj1, "value");
		
		Map map2=new HashMap();
		map2.put(obj2, "valuue2");
		
		obj1=null;
		obj2=null;
		
		System.gc();
		System.out.println(map);
		System.out.println(map2);
	
	}

}
