package amanda.test;

import java.util.ArrayList;
import java.util.List;

public class VenueObject {

	List<Venue> venues;
	
	public VenueObject() {
		this.venues = new ArrayList<Venue>();
	}

	public String toString() {
		return venues.toString();
	}
}
