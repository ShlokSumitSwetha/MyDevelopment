package template_method_pattern;

public class Coffee extends CaffineBevertage{

	@Override
	void brew() {
	 System.out.println("filter the cofee");
		
	}

	@Override
	void addCondiments() {
		System.out.println("add suger and milk");
		
	}

}
