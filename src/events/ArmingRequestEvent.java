package src.events;

public class ArmingRequestEvent extends SecuritySystemEvent {
	private static ArmingRequestEvent instance;
	private final int zero, one; // if zero is stay and one is away
	private int armingFrom ;

	/**
	 * private for singleton
	 */

	private ArmingRequestEvent() {

	}

	/**
	 * For the singleton pattern
	 * 
	 * @Return the only instance
	 */

	public static ArmingRequestEvent instance() {
		if (instance == null) {
			instance = new ArmingRequestEvent();
		}
		return instance;
	}

}
