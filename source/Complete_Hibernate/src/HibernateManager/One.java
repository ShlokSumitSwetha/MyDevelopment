package HibernateManager;

public class One {
	public static void main(String[] args) {
		String s =addSpace("123456",7);
		System.out.println("string o/p:"+s);
	}
	
private static String addSpace(Object temp, int num) {
		
		int index = 0;
		StringBuffer sf = null;
		if(temp == null){
			temp =" ";
		}
		if (temp instanceof String) {
			index = num - ((String) temp).length();
			sf = new StringBuffer();
			System.out.println(sf);
			for (int k = index; k > 0; k--) {
				sf.append(" ");
			}
			sf.append(temp);
		} else if (temp instanceof Integer) {
			index = num - (temp.toString()).length();
			sf = new StringBuffer(temp.toString());
			for (int k = 0; k < index; k++) {
				sf.insert(k, '0');
			}
		}
		return sf.toString();
	}

}
