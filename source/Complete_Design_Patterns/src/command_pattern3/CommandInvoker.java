package command_pattern3;

import java.util.HashMap;

public class CommandInvoker {
	private HashMap<String,CommandInterface> objectList=new HashMap<>();

	public CommandInvoker(){
		objectList.put("commandImpl1",new CommandImpl1());
		objectList.put("commandImpl2",new CommandImpl2());
	}

	public CommandInterface getCommand(String command){
		return (CommandInterface)objectList.get(command);
}
}
