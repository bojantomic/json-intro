package main;

import java.io.FileReader;
import java.util.Map.Entry;
import java.util.Set;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;


public class Main6 {
	
	public static void main(String[] args) {
		try(FileReader in = new FileReader("movie_manual.json")){
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			
			JsonObject m = gson.fromJson(in, JsonObject.class);
			
			Set<Entry<String,JsonElement>> es = m.entrySet();
			
			for(Entry<String,JsonElement> entry: es)
				System.out.println(entry.getKey()+ " " + entry.getValue().toString());
			
			double rating = m.get("rating").getAsDouble() - 1;
			
			System.out.println(rating);
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
