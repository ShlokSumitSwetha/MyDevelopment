package hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
		Map map=new HashMap();
		map.put("Test", "Test");
		ObjectWithSameHashCode(map);
		ObjectWithDifferentHashCode(map);
		map.put(null, null);
		map.put(null, "Sumit");
		System.out.println(map);
	}
	
	private static void ObjectWithSameHashCode(Map map){
		Person p1=new Person();
		p1.setId(1);
		p1.setName("Sumit");
		
		Person p2=new Person();
		p2.setId(1);
		p2.setName("Sumit");
		
		if(p1.hashCode()==p2.hashCode()){
			System.out.println("Both Objects hashcode are same");
		}
		System.out.println("Before map="+map);
		map.put(p1, "Object1");
		map.put(p2, "Object2");
		System.out.println("After map="+map);// value is replaced with latest key
		
	}

	private static void ObjectWithDifferentHashCode(Map map){
		Person p1=new Person();
		p1.setId(1);
		p1.setName("Sumit");
		
		Person p2=new Person();
		p2.setId(2);
		p2.setName("Swetha");
		
		if(!(p1.hashCode()==p2.hashCode())){
			System.out.println("Both Objects hashcode are not same");
		}
		System.out.println("Before map="+map);
		map.put(p1, "Object1");
		map.put(p2, "Object2");
		System.out.println("After map="+map);
	}
}
