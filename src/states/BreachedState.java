package states;

import events.CancelEvent;

public class BreachedState extends SecuritySystemState {
	private static BreachedState instance;

	/**
	 * Private constructor for the singleton pattern
	 */
	private BreachedState() {
		instance = this;
	}

	/**
	 * For the singleton pattern
	 * 
	 * @return the object
	 */
	public static BreachedState instance() {
		if (instance == null) {
			instance = new BreachedState();
		}
		return instance;
	}

	@Override
	public void handleEvent(CancelEvent event) {
		SecuritySystemContext.instance().changeState(DisarmedState.instance());
	}

	@Override
	public void enter() {
		SecuritySystemContext.instance().showBreach();

	}

	@Override
	public void leave() {
		// TODO Auto-generated method stub

	}

}