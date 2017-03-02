package builder_pattern;

public class Pizza {
	private String cheese;
	private String meat;
	private String toppings;
	private String base;
	private String sause;
	
	public Pizza(){
		
	}
	public Pizza(String cheese, String meat,String topings,String base,String sause){
		this.cheese=cheese;
		this.meat=meat;
		this.base=base;
		this.toppings=topings;
		this.sause=sause;
	}
	
	public String getCheese() {
		return cheese;
	}
	public void setCheese(String cheese) {
		this.cheese = cheese;
	}
	public String getMeat() {
		return meat;
	}
	public void setMeat(String meat) {
		this.meat = meat;
	}
	public String getToppings() {
		return toppings;
	}
	public void setToppings(String toppings) {
		this.toppings = toppings;
	}
	public String getBase() {
		return base;
	}
	public void setBase(String base) {
		this.base = base;
	}
	public String getSause() {
		return sause;
	}
	public void setSause(String sause) {
		this.sause = sause;
	}
	@Override
	 public String toString() {
	  return "Pizza [base=" + base + ", meat=" + meat + ", cheese="
	    + cheese + ", sause=" + sause + ", toppings=" + toppings+ "]";
	 }
	
	
}
