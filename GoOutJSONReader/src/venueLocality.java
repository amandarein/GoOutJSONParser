
public class venueLocality {

	int id;
	String name;
	String enumm;
	boolean neww;
	country c;
	
	public venueLocality() {
		id = 0;
		name = "";
		enumm = "";
		neww = false;
		c = new country();
	}
	
	public String toString() {
		return "id: " + id + "\n name: " + name + "\n enum: " + enumm + "\n new: " + neww + "\n country: " + c.toString();
	}
	
}