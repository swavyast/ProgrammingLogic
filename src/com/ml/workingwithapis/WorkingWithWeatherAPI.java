package com.ml.workingwithapis;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpClient.Redirect;
import java.net.http.HttpClient.Version;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.time.Duration;
import java.util.Properties;

public class WorkingWithWeatherAPI {
    private static final String CONFIG_FILE = "system.properties";
    private static final String API_KEY_PROPERTY = "weatherApiKey";
    public static String getWeatherApiKey() {
    	//try-with-resource example
        try (InputStream input = WorkingWithWeatherAPI.class.getClassLoader().getResourceAsStream(CONFIG_FILE)) {
            Properties prop = new Properties();
            prop.load(input);
            return prop.getProperty(API_KEY_PROPERTY);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

	public static void main(String[] args) {
		
		String myKey = getWeatherApiKey();
		String str = "https://api.openweathermap.org/data/3.0/onecall?lat=28.5355&lon=77.3910&appid=" + myKey;
		HttpClient client = HttpClient.newBuilder().version(Version.HTTP_1_1).followRedirects(Redirect.NORMAL)
				.connectTimeout(Duration.ofSeconds(20)).build();
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create(str)).build();
		try {
			HttpResponse<?> response = client.send(request, BodyHandlers.ofString());
			System.out.println(response.statusCode());
			System.out.println(response.headers());
			System.out.println(response.body());
			System.out.println(response.version());
			System.out.println(response.toString());
			
			
			//Using Jackson to play with HTTP response
			
			//ObjectMapper objectMapper = new ObjectMapper();
            //JsonNode jsonResponse = objectMapper.readTree(new URL(str));
            //jsonResponse.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
