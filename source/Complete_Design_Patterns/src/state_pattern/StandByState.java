package state_pattern;

public class StandByState implements State{

	@Override
	public void pressPlay(MusicPlayerContext context) {
		System.out.println("Your music player is in the Stand By Mode");
		context.setState(new PlayingState());
	}
}
