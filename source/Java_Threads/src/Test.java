import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Test{
	
	private static final Set<String> persons;
	private static final String[] strings;
	
	static{
		persons=new HashSet<>();
		persons.add("Sumit");
		strings=new String[]{"sk"};
	}

	public static Set<String> getUnModifiablePersons() {
		return Collections.unmodifiableSet(persons);
	}
	
	public static Set<String> getPersons() {
		return new HashSet<String>(persons);
	}
	
	public static String[] getStrings() {
		return strings.clone();
	}


	public static void main(String[] args) {
		Set<String> setValues=Test.getPersons();
		setValues.add("Swetha");
		for(String s: setValues){
			System.out.println(s);
		}
		
		Set<String> setValues2=Test.getPersons();
		for(String s: setValues2){
			System.out.println(s);
		}
		
	}
}




