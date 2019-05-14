import java.util.ArrayList;

public class Venue {

	int id;
	String name;
	String text;
	String address;
	String city;
	double latitude;
	double longitude;
	String sourceUrl;
	int followerCount;
	int followersCount;
	boolean panorama;
	int eventCount;
	String state;
	Object locality;
	Object categories;
	Object mainImage;
	ArrayList<Object> images;
	ArrayList<Object> videos;
	String url;
	
	public Venue() {
		this.id = 0;
		this.name = "";
		this.text = "";
		this.address = "";
		this.city = "";
		this.latitude = 0.0;
		this.longitude = 0.0;
		this.sourceUrl = "";
		this.followerCount = 0;
		this.followersCount = 0;
		this.panorama = false;
		this.eventCount = 0;
		this.state = "";
		this.locality = new String("null");
		this.categories = new String("null");
		this.mainImage = new String("null");
		this.images = new ArrayList();
		this.videos = new ArrayList();
		this.url = "";
	}

	
	public String toString() {
		return "id: " + id + "\n name: " + name + "\n text: " + text + "\n address: " + address + "\n city: " + city + "\n latitude: " + latitude + "\n longitude: " + longitude + "\n sourceUrl: " + sourceUrl + "\n followerCount: " + followerCount + "\n followersCount: " + followersCount + "\n panorama: " + panorama + "\n eventCount: " + eventCount + "\n state: " + state + "\n locality: " + locality.toString() + "\n categories: " + categories.toString() + "\n mainImage: " + mainImage.toString() + "\n images: " + images.toString() + "\n videos: " + videos.toString() + "\n url: " + url + "\n";
	} 
	
}
