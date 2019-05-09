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
	ArrayList<Object> categories;
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
		this.locality = null;
		this.categories = null;
		this.mainImage = null;
		this.images = null;
		this.videos = null;
		this.url = "";
	}

	public String toString() {
		return id + name + text + address + city + latitude + longitude + sourceUrl + followerCount + followersCount + panorama + eventCount + state + locality + categories.toString() + mainImage + images.toString() + videos.toString() + url;
	}
	
}
