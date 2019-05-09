import java.util.ArrayList;
import java.util.List;

public class Response {

	public List<Schedule> schedules;
	public VenueObject venues;
	public EventObject events;
	
	
	public String toString() {
		return schedules.toString() + "\n" + venues.toString() + "\n" + events.toString();
	}
}
