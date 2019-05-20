package amanda.test;


// TODO should start with uppercase
public class venueLocality {

	int id;
	String name;
	String enumm;
	boolean neww;
	country c;
	
	public venueLocality() {
		// define within variable decalration
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