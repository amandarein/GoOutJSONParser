import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import com.google.gson.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class main {

	public static void main(String[] args) throws Exception {
		
		FileReader jsonFile = new FileReader("data/events.json");
		JsonParser jsonParser = new JsonParser();
		JsonArray scheduleJsonArray = (JsonArray) jsonParser.parse(jsonFile).getAsJsonObject().get("schedule");
		ArrayList<Event> events = new ArrayList();
		
		for(int i = 0; i < scheduleJsonArray.size(); i++) {
			JsonObject eventsJsonObject = scheduleJsonArray.get(i).getAsJsonObject();
			
			JsonElement eventIDJsonElement = eventsJsonObject.get("eventId");
			String eventID = eventIDJsonElement.getAsString();
			
			JsonElement dateJsonElement = eventsJsonObject.get("start");
			String date = dateJsonElement.getAsString();
			
			JsonElement venueIDJsonElement = eventsJsonObject.get("venueId");
			String venueID = venueIDJsonElement.getAsString();
			
			JsonObject venueJsonObject = eventsJsonObject.get("venueLocality").getAsJsonObject();
			JsonElement venueJsonElement = venueJsonObject.get("name");
			String venue = venueJsonElement.getAsString();
			
			Event e = new Event(eventID, date, venueID);
			events.add(e);
		}
		/*
		JsonObject venuesObject = (JsonObject) jsonParser.parse(jsonFile).getAsJsonObject().get("venues");
		//get to "venues" part and match the venueId with the "name" of the venue
		for( ) {
			JsonObject venues = venuesObject.getAsJsonObject();
			String venueName = venues.getAsString();
			System.out.println(venueName);
			for(int i = 0; i < events.size(); i++) {
				if( (events.get(i)).getVenue() == venueName)
					(events.get(i)).setVenue(venueName);
			}
		}
	
		
		JsonObject eventsJsonObject = (JsonObject) jsonParser.parse(jsonFile).getAsJsonObject().get("events");
		//get to "events" part and match the eventId with "originalName"
		for( ) {
			JsonElement eventNameJsonElement = eventsJsonObject.get("originalName");
			String eventName = eventNameJsonElement.getAsString();
			
			(events.get(i)).setName(eventName);
		}
		*/
		for(int j = 0; j < events.size(); j++) {
			System.out.println("Event:  " + events.get(j));
		} 
		
		} 
}
