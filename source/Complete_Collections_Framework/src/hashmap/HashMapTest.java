package hashmap;

import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		
		Person p1=new Person();
		p1.setId(1);
		p1.setName("Sumit");
		
		Person p2=new Person();
		p2.setId(1);
		p2.setName("Sumit");
		
		
		HashMap map=new HashMap();
		map.put(p1, "Object1");
		map.put(p2, "Object2");
		map.put(null, null);
		map.put(null, "Sumit");
		System.out.println(map);
	}

}
