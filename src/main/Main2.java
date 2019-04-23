package main;

import java.io.FileReader;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import domain.Movie;

public class Main2 {

	public static void main(String[] args) {
		try(FileReader in = new FileReader("movie.json")){
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			
			Movie m = gson.fromJson(in, Movie.class);
			
			System.out.println(m);
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
