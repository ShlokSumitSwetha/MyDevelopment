package state_pattern;

public class MusicPlayerContext {
	
private State state=new StandByState();

public MusicPlayerContext(State state){
	this.state=state;
}

public MusicPlayerContext(){
	
}

public void play(){
	state.pressPlay(this);
}

public State getState() {
	return state;
}

public void setState(State state) {
	this.state = state;
}
}
