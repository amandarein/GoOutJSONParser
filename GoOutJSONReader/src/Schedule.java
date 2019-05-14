public class Schedule {
	
	private int id;
	private String announced;
	private boolean cancelled;
	private String currency;
	private String endIS;
	private int eventID;
	private int followerCountDeprecated;
	private int followersCount;
	private int followerCount;
	private boolean hourIgnoreDeprecated;
	private boolean hourIgnore;
	private boolean hourIgnored;
	private boolean permanent;
	private String pricing;
	private double relativeFollowers;
	private double relativeFollowersInWeek;
	private Object sourceURLs;
	private String start;
	private String startIS;
	private String state;
	private Object tags;
	private String timezone;
	private String venueID;
	private Object performerIDs;
	private Object venueLocality;
	private String isLongTerm;
	private String uploadedOnIS;
	private String url;
	private Object followersImages;

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
		sourceURLs = new String("");
		start = "";
		startIS = "";
		state = "";
		tags = new String("");
		timezone = "";
		venueID = "";
		performerIDs = new String("");
		venueLocality = new String("");
		isLongTerm = "";
		uploadedOnIS = "";
		url = "";
		followersImages = new String("");
	}
	
	public String toString() {
		return "id: " + id + "\n announced: " + announced + "\n cancelled: " + cancelled + "\n currency: " + currency + "\n endIS: " + endIS + "\n eventID: " + eventID + "\n followerCountDeprecated: " + followerCountDeprecated + "\n followersCount: " + followersCount + "\n followerCount: " + followerCount + "\n hourIgnoreDeprecated: " + hourIgnoreDeprecated + "\n hourIgnore: " + hourIgnore + "\n hourIgnored: " + hourIgnored + "\n permanent: " + permanent + "\n pricing: " + pricing + "\n relativeFollowers: " + relativeFollowers + "\n relativeFollowersInWeek: " + relativeFollowersInWeek + "\n sourceURLs: " + sourceURLs + "\n start: " + start + "\n startIS: " + startIS + "\n state: " + state + "\n tags: " + tags + "\n timezone: " + timezone + "\n venueID: " + venueID + "\n performerIDs: " + performerIDs + "\n venueLocality: " + venueLocality + "\n isLongTerm: " + isLongTerm + "\n uploadedOnIS: " + uploadedOnIS + "\n url: " + url + "\n followersImage: " + followersImages;
	}
}
