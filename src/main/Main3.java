package main;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import domain.Movie;

public class Main3 {

	public static void main(String[] args) {
		Movie m = new Movie();
		
		m.setImdbId("tt0112471");
		m.setTitle("Before Sunrise");
		m.setReleaseYear(1995);
		
		Movie m2 = new Movie();
		
		m2.setImdbId("tt0381681");
		m2.setTitle("Before Sunset");
		m2.setReleaseYear(2004);

		Movie m3 = new Movie();
		
		m3.setImdbId("tt2209418");
		m3.setTitle("Before Midnight");
		m3.setReleaseYear(2013);
		
		List<Movie> movies = new LinkedList<Movie>();
		movies.add(m);
		movies.add(m2);
		movies.add(m3);
		
		//Movie[] movies = {m, m2, m3};
		
		try(PrintWriter out = new PrintWriter(new FileWriter("many_movies.json"))){
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			
			out.print(gson.toJson(movies));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
