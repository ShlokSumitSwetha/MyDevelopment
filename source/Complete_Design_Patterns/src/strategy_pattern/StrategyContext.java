package strategy_pattern;

public class StrategyContext {

	StrategyArchive archive;
	StrategyContext(StrategyArchive archive){
		this.archive=archive;
	}
	
	public void fileArchive(){
		archive.archiveFile();
	}
	
}
