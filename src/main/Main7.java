package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class Main7 {
	
	public static String ACCESS_KEY = "2e4baadf5c5ae6ba436f53ae5558107f";
	public static String SOURCE = "USD";
	public static String CURRENCIES = "EUR";
	

	public static void main(String[] args) {
		
		try {
			URL url = new URL("http://apilayer.net/api/live?access_key=" + ACCESS_KEY +
								"&source=" + SOURCE + "&currencies=" + CURRENCIES);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			
			con.setRequestMethod("GET");
			
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));

			Gson gson = new GsonBuilder().create();
			JsonObject jsonResult = gson.fromJson(in, JsonObject.class);
			JsonObject quotes = (JsonObject) jsonResult.get("quotes");
			
			in.close();
			System.out.println( quotes.get(SOURCE + CURRENCIES).getAsDouble());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
