import java.util.ArrayList;
import java.util.List;

public class Schedule {
	
	int id;
	String announced;
	boolean cancelled;
	String currency;
	String endIS;
	int eventID;
	int followerCountDeprecated;
	int followersCount;
	int followerCount;
	boolean hourIgnoreDeprecated;
	boolean hourIgnore;
	boolean hourIgnored;
	boolean permanent;
	String pricing;
	double relativeFollowers;
	double relativeFollowersInWeek;
	List<Object> sourceURLs;
	String start;
	String startIS;
	String state;
	List<Object> tags;
	String timezone;
	int venueID;
	List<Object> performerIDs;
	venueLocality vL;
	String isLongTerm;
	String uploadedOnIS;
	String url;
	List<Object> followersImages;

	public Schedule() {
		id = 0;
		announced = "";
		cancelled = false;
		currency = "";
		endIS = "";
		eventID = 0;
		followerCountDeprecated = 0;
		followersCount = 0;
		followerCount = 0;
		hourIgnoreDeprecated = false;
		hourIgnore = false;
		hourIgnored = false;
		permanent = false;
		pricing = "";
		relativeFollowers = 0.0;
		relativeFollowersInWeek = 0.0;
		sourceURLs = new ArrayList<Object>();
		start = "";
		startIS = "";
		state = "";
		tags = new ArrayList<Object>();
		timezone = "";
		venueID = 0;
		performerIDs = new ArrayList<Object>();
		vL = new venueLocality();
		isLongTerm = "";
		uploadedOnIS = "";
		url = "";
		followersImages = new ArrayList<Object>();
	}
	
	public String toString() {
		return "id: " + id + "\n announced: " + announced + "\n cancelled: " + cancelled + "\n currency: " + currency + "\n endIS: " + endIS + "\n eventID: " + eventID + "\n followerCountDeprecated: " + followerCountDeprecated + "\n followersCount: " + followersCount + "\n followerCount: " + followerCount + "\n hourIgnoreDeprecated: " + hourIgnoreDeprecated + "\n hourIgnore: " + hourIgnore + "\n hourIgnored: " + hourIgnored + "\n permanent: " + permanent + "\n pricing: " + pricing + "\n relativeFollowers: " + relativeFollowers + "\n relativeFollowersInWeek: " + relativeFollowersInWeek + "\n sourceURLs: " + sourceURLs + "\n start: " + start + "\n startIS: " + startIS + "\n state: " + state + "\n tags: " + tags + "\n timezone: " + timezone + "\n venueID: " + venueID + "\n performerIDs: " + performerIDs + "\n venueLocality: " + vL.toString() + "\n isLongTerm: " + isLongTerm + "\n uploadedOnIS: " + uploadedOnIS + "\n url: " + url + "\n followersImage: " + followersImages;
	}
}
