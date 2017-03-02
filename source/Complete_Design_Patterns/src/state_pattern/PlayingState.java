package state_pattern;

public class PlayingState  implements State{

	@Override
	public void pressPlay(MusicPlayerContext context) {
		System.out.println("Your music player is in the playing mode");
		context.setState(new StandByState());
	}

}
