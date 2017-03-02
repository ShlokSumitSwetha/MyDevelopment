package command_pattern2;

public class CommandTest {

	// We have used this in Wellsfargo project for different accounts.
	public static void main(String[] args) {

			CommandInvoker invoker=new CommandInvoker();
			CommandInterface command= invoker.getCommand("commandImpl2");
			command.execute();
	}

}
