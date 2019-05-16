
public class country {

	int id;
	String name;
	String enumm;
	String shortCode;
	
	public country() {
		id = 0;
		name = "";
		enumm = "";
		shortCode = "";
	}
	
	public String toString() {
		return "id: " + id + "\n name: " + name + "\n enum: " + enumm + "\n shortCode: " + shortCode;
	}
}
