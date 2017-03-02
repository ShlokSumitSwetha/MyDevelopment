package template_method_pattern;

public class main {

	public static void main(String[] args) {
		Tea tea=new Tea();
		tea.prepareReceipe();
		
		Coffee cofee=new Coffee();
		cofee.prepareReceipe();

	}

}
