package hu.advancedweb.scott.runtime.event;

public class Event {
	public final int lineNumber;
	public final String value;
	
	public Event(int lineNumber, String value) {
		this.lineNumber = lineNumber;
		this.value = value;
	}
}