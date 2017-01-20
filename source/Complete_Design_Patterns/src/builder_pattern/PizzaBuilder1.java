package builder_pattern;

public class PizzaBuilder1 {

	private String cheese;
	private String meat;
	private String toppings;
	private String base;
	private String sause;

	public PizzaBuilder1 addChess(String chess) {
		this.cheese = chess;
		return this;
	}

	public PizzaBuilder1 addMeat(String meat) {
		this.meat = meat;
		return this;
	}

	public PizzaBuilder1 addToppings(String toppings) {
		this.toppings = toppings;
		return this;
	}

	public PizzaBuilder1 addBase(String base) {
		this.base = base;
		return this;
	}

	public PizzaBuilder1 addSause(String sause) {
		this.sause = sause;
		return this;
	}

	public PizzaBuilder1 build() {
		PizzaBuilder1 pb = new PizzaBuilder1();
		pb.addBase(base);
		pb.addChess(cheese);
		pb.addMeat(meat);
		pb.addSause(sause);
		pb.addToppings(toppings);
		return pb;
	}
	@Override
	 public String toString() {
	  return "Pizza [base=" + base + ", meat=" + meat + ", cheese="
	    + cheese + ", sause=" + sause + ", toppings=" + toppings+ "]";
	 }

}
