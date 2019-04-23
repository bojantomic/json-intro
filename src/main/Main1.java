package main;

import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import domain.Movie;

public class Main1 {

	public static void main(String[] args) {
		Movie m = new Movie();
		
		m.setImdbId("tt0116367");
		m.setTitle("From dusk till dawn");
		m.setReleaseYear(1996);
		m.setRating(7.2);

		try(FileWriter out = new FileWriter("movie.json")){
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			
			out.write(gson.toJson(m));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
