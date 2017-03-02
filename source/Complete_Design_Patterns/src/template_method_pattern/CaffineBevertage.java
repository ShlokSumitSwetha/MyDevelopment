package template_method_pattern;

public abstract class CaffineBevertage {

	final void prepareReceipe(){
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}
	
	abstract void brew();
	abstract void addCondiments();
	
	private void boilWater(){
		System.out.println("boil in water");
	}
	private void pourInCup(){
		System.out.println("pour in cup");
	}
}
