package command_pattern2;

import java.util.ArrayList;

public class CommandInvoker {

	private ArrayList<CommandInterface> objectList=new ArrayList<CommandInterface>();
	
	public CommandInvoker(){
		objectList.add(new CommandImpl1());
		objectList.add(new CommandImpl2());
	}
	
	public CommandInterface getCommand(String command){
		CommandInterface commandResult=null;
		for(CommandInterface obj:objectList){
		if(obj.getCommandName().equalsIgnoreCase(command)){
			return obj;
		 }
		}
		return commandResult;
	}
}
