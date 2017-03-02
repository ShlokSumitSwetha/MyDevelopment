package builder_pattern;

public class BuilderTest2 {
	public static void main(String[] args) {
		Pizza pizza= PizzaBuilder2.startPreparation()
				.whichBaseUWant("cripsy")
				.whichMeatUWant("chicken")
				.whichCheeseUWant("less fat")
				.whichSauseUWant("tomato")
				.whichToppingsUWant("onion").build();
		System.out.println("pizza is ready");
		System.out.println(pizza);
		}
}
