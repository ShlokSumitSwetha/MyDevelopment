package fly_weight_pattern;


/**
 * This is immutable class for preparing chemicals
 * @author Sumit
 *
 */
public final class ChemicalPreparing implements Chemical{
	private String name;
    private String symbol;
    private double atomicWeight;
    
    private ChemicalPreparing(String name,String symbol,double atomicWeight){
    	this.name=name;
    	this.symbol=symbol;
    	this.atomicWeight=atomicWeight;
    }
    
    public static ChemicalPreparing getInstance(String name,String symbol,double atomicWeight){
    	return new ChemicalPreparing( name, symbol, atomicWeight);
    }
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the symbol
	 */
	public String getSymbol() {
		return symbol;
	}
	/**
	 * @return the atomicWeight
	 */
	public double getAtomicWeight() {
		return atomicWeight;
	}
	
    
}
