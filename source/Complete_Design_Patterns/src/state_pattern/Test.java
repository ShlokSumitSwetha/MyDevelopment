package state_pattern;

public class Test {

	public static void main(String[] args) {
		MusicPlayerContext context=new MusicPlayerContext();
		context.play(); // push the button
		context.play(); // push the button
		context.play(); // push the button
	}
}
