package amanda.test;

import java.util.ArrayList;
import java.util.List;

public class EventObject {

	List<Event> events;
	
	public EventObject() {
		this.events = new ArrayList<Event>();
	}
	
	public String toString() {
		return events.toString();
	}
}
