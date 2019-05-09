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

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
public class main {

	public static void main(String[] args) throws Exception {
		
		FileReader jsonFile = new FileReader("data/events.json");
		
		JsonParser jsonParser = new JsonParser();
		String jsonString = new String(Files.readAllBytes(Paths.get("data/events.json")));
		jsonString = jsonString.replaceAll("[\r\n]+", "");
		jsonString = jsonString.replaceAll("      ", "");
		jsonString = jsonString.replaceAll("  ", "");
		
		Gson gson = new Gson();
		Response r = gson.fromJson(jsonFile, Response.class);
		System.out.println(r.toString());
		} 
}
