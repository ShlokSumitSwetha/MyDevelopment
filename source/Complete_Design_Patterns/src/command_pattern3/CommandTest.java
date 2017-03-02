package command_pattern3;

public class CommandTest {

	public static void main(String[] args) {

			CommandInvoker invoker=new CommandInvoker();
			CommandInterface command= invoker.getCommand("commandImpl2");
			command.execute();
	}

}
