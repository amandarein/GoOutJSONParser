import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Response {

	int status;
	String message;
	boolean hasNext;
	int page;
	public List<Schedule> schedules;
	public Map<Long, Venue> venues;
	public Map<Long, Event> events;
	
	public Response() {
		schedules = new ArrayList<Schedule>();
		venues = new HashMap<Long, Venue>();
		events = new HashMap<Long, Event>();
		
	}
	
	public String toString() {
		return "status: " + status + "\n message: " + message + "\n hasNext: " + hasNext + "\n page: " + page + "\n schedules: " + schedules.toString() + "\n venues: " + venues.toString() + "\n events: " + events.toString();
	} 
}
