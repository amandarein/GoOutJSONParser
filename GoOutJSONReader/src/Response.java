import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Response {

	public List<Schedule> schedules;
	public Map<Long, Venue> venues;
	public Map<Long, Event> events;
	
	public Response() {
		schedules = new ArrayList<Schedule>();
		venues = new HashMap<Long, Venue>();
		events = new HashMap<Long, Event>();
		
	}
	
	public String toString() {
		String sch = "";
		for(int i = 0; i < schedules.size(); i++) {
			sch += (schedules.get(i)).toString();
		}
		return sch + "\n" + venues.toString() + "\n" + events.toString();
	} 
}
