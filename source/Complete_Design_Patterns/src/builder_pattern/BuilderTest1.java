package builder_pattern;

public class BuilderTest1 {
	public static void main(String[] args) {
		PizzaBuilder1 builder=new  PizzaBuilder1()
				.addBase("cripsy Base")
				.addChess("yellow")
				.addMeat("chicken")
				.addSause("tomato")
				.addToppings("onions");
		System.out.println(builder);
	}

}
