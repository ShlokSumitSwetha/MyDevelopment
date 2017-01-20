package memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
	private List statesList = new ArrayList();

	public void addMemento(Memento m) {
		statesList.add(m);
	}

	public Memento getMemento(int index) {
		return (Memento) statesList.get(index);
	}
}
