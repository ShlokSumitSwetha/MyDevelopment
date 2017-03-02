package command_pattern2;

public class CommandImpl1 implements CommandInterface{
	
	public void execute() {
		System.out.println("execting CommandInterface1");
	}

	@Override
	public String getCommandName() {
		return "commandImpl1";
	}

}
