package com.lyh.may281.main;

import java.io.InputStream;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.lyh.http.client.LyhHttpClient;

// fb780098b6771f02c4682abea4d1d8cf
// 37.4857145/ 126.9802474 (y / x)
public class LocSearchMain {
	public static void main(String[] args) {
		// 기준점 주변 반경 5km이내에 검색한 키워드(입력)가 포함된 가게들을 
		// 거리 기준으로 정렬
		
		try {
			
	Scanner k = new Scanner(System.in);
	
	
	System.out.print("검색 : ");
	String search = k.next();
	
	search = URLEncoder.encode(search, "UTF-8");		
	System.out.println(search);		
	String address = "https://dapi.kakao.com/v2/local/search/keyword.json?query=" + search + "&x=126.9802474&y=37.4857145"
			+ "&radius=5000"
			+ "&sort=distance";
	
	// Authorization: KakaoAK fb780098b6771f02c4682abea4d1d8cf
	HashMap<String, String> headers = new HashMap<String, String>();
	headers.put("Authorization", "KakaoAK fb780098b6771f02c4682abea4d1d8cf");
	
	
	InputStream is = LyhHttpClient.download(address, headers);
	String str = LyhHttpClient.convert(is, "UTF-8");
//	System.out.println(str);
	JSONParser jp = new JSONParser();
	JSONObject jo = (JSONObject) jp.parse(str);
	// 총 검색 결과 수
	JSONObject meta = (JSONObject) jo.get("meta");
	System.out.printf("총 검색 결과 수 : %d개\n", meta.get("total_count"));
	// 현재페이지 결과 수
	System.out.printf("현재 페이지 결과 수 : %d개\n", meta.get("pageable_count"));
	
	// 주소 
	// 전화번호
	// 상호명
	// 기준점과의 거리
	// 를 출력
	JSONArray documents = (JSONArray) jo.get("documents");
	JSONObject data = null;
	for (int i = 0; i < documents.size(); i++) {
		data = (JSONObject) documents.get(i);
		System.out.printf("주소 : %s\n", data.get("address_name"));
		System.out.printf("전화번호 : %s\n", data.get("phone"));
		System.out.printf("상호명 : %s\n", data.get("place_name"));
		System.out.printf("거리 : %s\n", data.get("distance"));
		System.out.println("---------------------------------------");
	}
	
	
	
	
	
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
