package src.events;

/**
 * Represent the time ran out event
 * 
 * @author Luan Nguyen
 *
 */
public class TimerRanOutEvent extends SecuritySystemEvent {
	private static TimerRanOutEvent instance;

	/**
	 * Private for singleton
	 * 
	 */
	private TimerRanOutEvent() {

	}

	/**
	 * For the singleton pattern
	 * 
	 * @return the only instance
	 */
	public static TimerRanOutEvent instance() {
		if (instance == null) {
			instance = new TimerRanOutEvent();
		}
		return instance;
	}

}
