package com.ml.workingwithapis;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpClient.Redirect;
import java.net.http.HttpClient.Version;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.time.Duration;

public class WorkingWithWeatherAPI {

	public static void main(String[] args) {
		String myKey = "0cac0036fcb241c38f444fa9d04b029b";
		String str = "https://api.openweathermap.org/data/3.0/onecall?lat=28.5355&lon=77.3910&appid="+myKey;
		HttpClient client = HttpClient.newBuilder()
		        .version(Version.HTTP_1_1)
		        .followRedirects(Redirect.NORMAL)
		        .connectTimeout(Duration.ofSeconds(20))
		        .build();
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create(str)).build();
		try {
			HttpResponse<?> response = client.send(request, BodyHandlers.ofString());
			System.out.println(response.statusCode());
			System.out.println(response.headers());
			System.out.println(response.body());
			System.out.println(response.version());
			System.out.println(response.toString());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
