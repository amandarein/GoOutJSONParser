import java.awt.List;
import java.awt.Window.Type;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.json.JSONObject;


public class main {

	public static void main(String[] args) throws Exception {
		
		FileReader jsonFile = new FileReader("data/events.json");
		JsonParser jsonParser = new JsonParser();
		String jsonString = new String(Files.readAllBytes(Paths.get("data/events.json")));
		jsonString = jsonString.replaceAll("[\r\n]+", "");
		jsonString = jsonString.replaceAll("      ", "");
		
		String scheduleString = jsonString.substring(jsonString.indexOf("\"schedule\": [")+13, jsonString.indexOf("\"venues\":"));
		String venueString = jsonString.substring(jsonString.indexOf("\"venues\":"), jsonString.indexOf("\"events\":"));
		String eventString = jsonString.substring(jsonString.indexOf("\"events\":"));
		System.out.println(scheduleString);
		System.out.println(venueString);
		System.out.println(eventString);
		
		Gson gson = new GsonBuilder()
		        .setLenient()
		        .create();
		
		ArrayList<String> events = new ArrayList<String>();
		int indEnd = 0;
		for(int i = 0; i < 1000; i++) {
			if( (scheduleString.indexOf("},{")+1) > 1) {
				indEnd = scheduleString.indexOf("},{")+1;
				events.add(scheduleString.substring(1, indEnd));
				scheduleString = scheduleString.substring(indEnd);
				System.out.println(events.get(i));
			}
		}
		
		//look at https://github.com/google/gson/blob/master/UserGuide.md
		for(int j = 0; j < events.size(); j++) {
			Event e = gson.fromJson(events.get(j), Event.class);
			System.out.println(e.toString());
		}
		} 
}
