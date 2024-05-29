package com.lyh.may272.main;

import java.io.InputStream;

import com.lyh.http.client.LyhHttpClient;

public class HMain3 {
	public static void main(String[] args) {
		try {
			InputStream is = LyhHttpClient.download("https://www.naver.com");
			String result = LyhHttpClient.convert(is, "UTF-8");
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
