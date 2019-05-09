
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
	private int[] sourceURLs;
	private String start;
	private String startIS;
	private String state;
	private int[] tags;
	private String timezone;
	private String venueID;
	private int[] performerIDs;
	private Object venueLocality;
	private String isLongTerm;
	private String uploadedOnIS;
	private String url;
	private int[] followersImages;
	
	public String getvenueID() {
		return venueID;
	}
	
	public Schedule(String id, String an, boolean ca, String cu, String en, int ev, int foDe, int fos, int fo, boolean hoDe, boolean ho, boolean hod, boolean pe, String pr, double re, double reWk, int[] so, String st, String stIS, String sta, int[] ta, String ti, String ve, int[] per, String venL, String isL, String up, String u, int[] foI) {
		id = id;
		announced = an; 
		cancelled = ca;
		currency = cu;
		endIS = en;
		eventID = ev;
		followerCountDeprecated = foDe;
		followersCount = fos;
		followerCount = fo;
		hourIgnoreDeprecated = hoDe;
		hourIgnore = ho;
		hourIgnored = hod;
		permanent = pe;
		pricing = pr;
		relativeFollowers = re;
		relativeFollowersInWeek = reWk;
		sourceURLs = so;
		start = st;
		startIS = stIS;
		state = sta;
		tags = ta;
		timezone = ti;
		venueID = ve;
		performerIDs = per;
		venueLocality = venL;
		isLongTerm = isL;
		uploadedOnIS = up;
		url = u;
		followersImages = foI;
	}
	
	public String toString() {
		
		return id + announced + cancelled + currency + endIS + eventID + followerCountDeprecated + followersCount + followerCount + hourIgnoreDeprecated + hourIgnore + hourIgnored + permanent + pricing + relativeFollowers + relativeFollowersInWeek + sourceURLs + start + startIS + state + tags + timezone + venueID + performerIDs + venueLocality + isLongTerm + uploadedOnIS + url + followersImages;
	}
}
