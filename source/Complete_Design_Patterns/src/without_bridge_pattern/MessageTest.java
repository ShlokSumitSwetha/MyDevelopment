package without_bridge_pattern;

public class MessageTest {

	public static void main(String[] args) {
		Message emailMessage=new EmailMessageSender();
		emailMessage.send();
		
		Message textMessage=new TextMessageSender();
		textMessage.send();
	}
}
