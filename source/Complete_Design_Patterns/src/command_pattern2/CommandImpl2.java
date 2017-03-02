package command_pattern2;

public class CommandImpl2 implements CommandInterface{
	
	public void execute() {
		System.out.println("excecuting command Interface2");
	}

	@Override
	public String getCommandName() {
		return "commandImpl2";
	}
}
