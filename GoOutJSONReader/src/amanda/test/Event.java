package amanda.test;

import java.util.ArrayList;

public class Event {

	int id;
	String name;
	String url;
	String state;
	Object categories;
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
	Object category;
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
		// TODO all this you can state within variable declaration, it will be much shorter
		this.id = 0;
		this.name = "";
		this.url = "";
		this.state = "";
		this.categories = null;
		this.text = "";
		this.images = new ArrayList<>();
		this.videos = new ArrayList<>();
		this.mainImageID = 0;
		this.mainImagesrc = "";
		this.keywords = "";
		this.score = 0;
		this.performerIDs = new ArrayList<>();
		this.innerEventsCount = 0;
		this.nameNote = "";
		this.category = new String("");
		this.contacts = new ArrayList<>();
		this.priority = 0;
		this.rating = 0;
		this.director = "";
		this.addedPerformers = "";
		this.length = "";
		this.release = "";
		this.csfd = "";
		this.imdb = "";
		this.filmweb = "";
		this.tags = new ArrayList<>();
		this.note = "";
		this.innerScheduleIDs = new ArrayList<>();
	}
		
	public String toString() {
		return "id: " + id + "\n name: " + name + "\n url:  " + url + "\n state: " + state + "\n categories: " + categories.toString() + "\n text: " + text + "\n images: " + images.toString() + "\n videos: " + videos.toString() + "\n mainImageID: " + mainImageID + "\n mainImagesrc: " + mainImagesrc + "\n keywords: " + keywords + "\n score: " + score + "\n performerIDs: " + performerIDs.toString() + "\n innerEventsCount: " + innerEventsCount + "\n nameNote: " + nameNote + "\n category: " + category.toString() + "\n contacts: " + contacts.toString() + "\n priority: " + priority + "\n rating: " + rating + "\n director: " + director + "\n addedPerformers: " + addedPerformers + "\n length: " + length + "\n release: " + release + "\n csfd: " + csfd + "\n imdb: " + imdb + "\n filmweb: " + filmweb.toString() + "\n tags: " + tags + "\n note: " + note + "\n innerScheduleIDs: " + innerScheduleIDs.toString() + "\n";
	}
	
}
