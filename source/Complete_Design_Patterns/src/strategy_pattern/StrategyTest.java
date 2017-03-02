package strategy_pattern;

public class StrategyTest {
	public static void main(String[] args) {
		StrategyContext context1=new StrategyContext(new ZipArchive());
		 context1.fileArchive();
		StrategyContext context2=new StrategyContext(new RarArchive());
	     context2.fileArchive();
	}
}
