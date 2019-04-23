package main;

import java.io.FileReader;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class Main6 {
	
	public static void main(String[] args) {
		try(FileReader in = new FileReader("movie_manual.json")){
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			
			JsonObject m = gson.fromJson(in, JsonObject.class);
			
			double rating = m.get("rating").getAsDouble() - 1;
			
			System.out.println(rating);
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
