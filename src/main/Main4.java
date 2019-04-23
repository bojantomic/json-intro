package main;

import java.io.FileReader;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import domain.Movie;

public class Main4 {

	public static void main(String[] args) {
		try(FileReader in = new FileReader("many_movies.json")){
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			
			//Movie[] movies = gson.fromJson(in, Movie[].class);
			List<Movie> movies = Arrays.asList(gson.fromJson(in, Movie[].class));
			
			for(Movie m: movies)
				System.out.println(m);
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
}
