
import java.util.ArrayList;

public class Event {

	private String name;
	private String date;
	private String venue;
	
	public Event(String n, String d, String v) {
		name = n;
		date = d;
		venue = v;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public String getDate() {
		return date;
	}
	
	public String getVenue() {
		return venue;
	}
	
	public void setVenue(String v) {
		venue = v;
	}
	public String toString() {
		
		return "Event Name:  " + name + " (Date:  " + date + ", at " + venue + ")."; 
	}
}
