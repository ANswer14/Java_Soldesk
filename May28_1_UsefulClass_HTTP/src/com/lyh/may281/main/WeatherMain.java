package com.lyh.may281.main;

import java.io.InputStream;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.lyh.http.client.LyhHttpClient;

// 42008a8c8e7402a3fc9d3b1a7df8fee9

// https://api.openweathermap.org/data/2.5/weather?q={city name}&appid=42008a8c8e7402a3fc9d3b1a7df8fee9&units=metric&lang=kr
public class WeatherMain {
	public static void main(String[] args) {
		
		// 도시의 이름을 콘솔에서 입력 (영어로 ex: seoul)
		
		Scanner k = new Scanner(System.in);
		try {
			System.out.print("도시 이름 입력 : ");
			String cityName = k.next();
			
		String address = "https://api.openweathermap.org/data/2.5/weather?q="
				+ cityName
				+ "&appid=42008a8c8e7402a3fc9d3b1a7df8fee9&units=metric&lang=kr" ;
		InputStream is = LyhHttpClient.download(address);
		String str = LyhHttpClient.convert(is, "UTF-8");
//		System.out.println(str);
		
		JSONParser jp = new JSONParser();
		
		JSONObject jo = (JSONObject) jp.parse(str);
		
		JSONObject sys = (JSONObject) jo.get("sys");
		// 나라 이름
		System.out.println(sys.get("country"));
		
		// 도시 이름
		System.out.println(jo.get("name"));
		
		// description
		JSONArray weather = (JSONArray) jo.get("weather");
		
		JSONObject data = null;
		for (int i = 0; i < weather.size(); i++) {
			data = (JSONObject) weather.get(i);
			System.out.println(data.get("description"));
		}
		
		// 기온
		JSONObject main = (JSONObject) jo.get("main");
		
		System.out.println(main.get("temp"));
		// 체감온도 
		System.out.println(main.get("feels_like"));
		// 최저기온
		System.out.println(main.get("temp_min"));
		// 최고기온
		System.out.println(main.get("temp_max"));
		// 기압
		System.out.println(main.get("pressure"));
		// 습도
		System.out.println(main.get("humidity"));
		
		
//		JSONObject city
		
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
}
