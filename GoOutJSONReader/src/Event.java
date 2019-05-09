
import java.util.ArrayList;

public class Event {

	int id;
	String name;
	String url;
	String state;
	ArrayList<Object> categories;
	String text;
	ArrayList<Object> images;
	ArrayList<Object> videos;
	int mainImageID;
	String mainImagesrc;
	String keywords;
	int score;
	ArrayList<Object> performerIDs;
	int innerEventsCount;
	String nameNote;
	ArrayList<Object> category;
	ArrayList<Object> contacts;
	int priority;
	int rating;
	String director;
	String addedPerformers;
	String length;
	String release;
	String csfd;
	String imdb;
	String filmweb;
	ArrayList<String> tags;
	String note;
	ArrayList<Object> innerScheduleIDs;
	
	public Event() {
		super();
		this.id = 0;
		this.name = "";
		this.url = "";
		this.state = "";
		this.categories = null;
		this.text = "";
		this.images = null;
		this.videos = null;
		this.mainImageID = 0;
		this.mainImagesrc = "";
		this.keywords = "";
		this.score = 0;
		this.performerIDs = null;
		this.innerEventsCount = 0;
		this.nameNote = "";
		this.category = null;
		this.contacts = null;
		this.priority = 0;
		this.rating = 0;
		this.director = "";
		this.addedPerformers = "";
		this.length = "";
		this.release = "";
		this.csfd = "";
		this.imdb = "";
		this.filmweb = "";
		this.tags = null;
		this.note = "";
		this.innerScheduleIDs = null;
	}

	public String toString() {
		return id + name + url + state + categories.toString() + text + images.toString() + videos.toString() + mainImageID + mainImagesrc + keywords + score + performerIDs.toString() + innerEventsCount + nameNote + category.toString() + contacts.toString() + priority + rating + director + addedPerformers + length + release + csfd + imdb + filmweb + tags + note + innerScheduleIDs;
	}
	
}
