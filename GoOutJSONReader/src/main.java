import java.awt.List;

import java.awt.Window.Type;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.google.gson.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class main {

	public static void main(String[] args) throws Exception {
		
		FileReader jsonFile = new FileReader("data/events.json");
		Gson gson = new Gson();
		
		Response r = new Response();
		r = gson.fromJson(jsonFile, Response.class);
		System.out.println(r);
		} 
}