package fly_weight_pattern;

import java.util.HashMap;
import java.util.Map;

public class ChemicalFactory {
	private static Map chemicals = new HashMap();
	static {
	      chemicals.put("carbon",  ChemicalPreparing.getInstance("Carbon", "C", 12));
	      chemicals.put("sulfur",  ChemicalPreparing.getInstance("Sulfur", "S", 32));
	      chemicals.put("oxygen",  ChemicalPreparing.getInstance("oxygen", "o2", 18));
	    }
	public static Chemical getChemical(String name) {
		if (chemicals.containsKey(name)) {
			return (Chemical)chemicals.get(name);
		}else{
			return null;
		}
	}
}
