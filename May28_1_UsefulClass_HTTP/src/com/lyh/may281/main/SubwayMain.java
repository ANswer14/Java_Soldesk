package com.lyh.may281.main;

import java.io.IOException;
import java.io.InputStream;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.lyh.http.client.LyhHttpClient;

// AJAX - JavaScript에서 XML 파싱
// Javascript를 사용한 비동기 통신, 클라이언트와 서버가에 XML 데이터를
//		주고받는 기술
//		=> XML 많이 안쓰임
//		=> Javascript에 친화된 형태가 없을까...?

// JSON (JavaScript Object Notation)
//		DB에 있는 데이터를 Javascript형태로 표현한 것

// Java 배열 : { 1, 2, 3 }
// JS배열 : [ 1,2,3 ]

// Java 객체 : Dog d = new Dog();
//				d.setName("강아지");
//				d.setAge(3);
// JS객체 : { name : "강아지", age : 3};
// 4f626857416f6c6c3632586a416843

// http://openapi.seoul.go.kr:8088/4f626857416f6c6c3632586a416843/json/TbSeoulmetroStOrigin/1/275/

public class SubwayMain {
	public static void main(String[] args) throws ParseException {
		try {
		String address = new String("http://openapi.seoul.go.kr:8088/4f626857416f6c6c3632586a416843/json/TbSeoulmetroStOrigin/1/275/");
			InputStream is = LyhHttpClient.download(address);
			
			String result = LyhHttpClient.convert(is, "UTF-8");
//			System.out.println(result);
			
			JSONParser jp = new JSONParser();
			
			JSONObject jo = (JSONObject) jp.parse(result);
//			System.out.println(jo);
			
			JSONObject metro = (JSONObject) jo.get("TbSeoulmetroStOrigin");
//			System.out.println(metro);
			
			JSONArray row = (JSONArray) metro.get("row");
//			System.out.println(row);
			
			JSONObject data = null;
			for (int i = 0; i < row.size(); i++) {
				data = (JSONObject) row.get(i);
				System.out.println(data.get("STATION_NAME"));
				System.out.println(data.get("LINE"));
				System.out.println(data.get("ORIGIN"));
				System.out.println("---------------------");
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
