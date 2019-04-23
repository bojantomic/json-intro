package main;

import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class Main5 {
	
	public static void main(String[] args) {
		JsonObject m = new JsonObject();
		
		m.addProperty("imdbID", "tt0116367");
		m.addProperty("title", "From dusk till dawn");
		m.addProperty("releaseYear", 1996);
		m.addProperty("rating", 7.2);
		
		//Movie m = new Movie();
		
		//m.setImdbId("tt0116367");
		//m.setTitle("From dusk till dawn");
		//m.setReleaseYear(1996);
		//m.setRating(7.2);

		try(FileWriter out = new FileWriter("movie_manual.json")){
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			
			out.write(gson.toJson(m));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
