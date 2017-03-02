package builder_pattern;

public class PizzaBuilder2 {

	private PizzaBuilder2(){
	}
	public static selectBase startPreparation(){
		return new Steps();
	}
	public static interface selectBase{
		selectMeat whichBaseUWant(String base);
	}
	public static interface selectMeat{
		selectCheese whichMeatUWant(String meat);
	}
	public static interface selectCheese{
		selectsause whichCheeseUWant(String cheese);
	}
	public static interface selectsause{
		selectToppings whichSauseUWant(String sause);
	}
	public static interface selectToppings{
		BuildStep whichToppingsUWant(String toppings);
	}
	
	/**
     * This is the final step in charge of building the Panino Object.
     * Validation should be here.
     */
    public static interface BuildStep {
            Pizza build();
    }
	private static class Steps implements selectBase,selectMeat,selectCheese,selectsause,selectToppings,BuildStep{
		private String cheese;
		private String meat;
		private String toppings;
		private String base;
		private String sause;
	
	public  selectMeat selectBase(String base){
		this.base=base;
		return this;
	}
	public Pizza build() {
        Pizza pizza = new Pizza(cheese,meat,toppings,base,sause);
        return pizza;
    }
	@Override
	public BuildStep whichToppingsUWant(String toppings) {
		this.toppings=toppings;
		return this;
	}
	@Override
	public selectToppings whichSauseUWant(String sause) {
		this.sause=sause;
		return this;
	}
	@Override
	public selectsause whichCheeseUWant(String cheese) {
		this.cheese=cheese;
		return this;
	}
	@Override
	public selectCheese whichMeatUWant(String meat) {
		this.meat=meat;
		return this;
	}
	@Override
	public selectMeat whichBaseUWant(String base) {
		this.base=base;
		return this;
	}
 }
}
