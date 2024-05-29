package com.lyh.may273.main;

import java.io.InputStream;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import com.lyh.http.client.LyhHttpClient;

// http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=4141051000

// 시간 : hour
// 온도 : temp
// 날씨 : wfKor
// 바람 방향 : wdKor
// 콘솔 출력




public class WeatherMain {
	public static void main(String[] args) {
		try {
			String address = "http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=4141051000";
			InputStream is = LyhHttpClient.download(address);
			
			XmlPullParserFactory xppf = XmlPullParserFactory.newInstance();
			XmlPullParser xpp = xppf.newPullParser();
			xpp.setInput(is, "UTF-8");
			
			int type = xpp.getEventType();
			String tagName = null;
			
			while (type != xpp.END_DOCUMENT) {
				if (type == xpp.START_TAG) {
					tagName = xpp.getName();
			
				}else if (type == xpp.TEXT) {
					if (tagName.equals("hour")) {
						
						System.out.println("시간 : "+ xpp.getText());
					
					}else if(tagName.equals("temp")) {
						System.out.println("온도 : "+ xpp.getText());
						
					}else if (tagName.equals("wfKor")) {
						System.out.println("날씨 : "+xpp.getText());
					}else if (tagName.equals("wdKor")) {
						System.out.println("풍향 : "+ xpp.getText());
						System.out.println("---------------");
					}
				}else if (type == xpp.END_TAG) {
					tagName = "";
				}
				xpp.next();
				type = xpp.getEventType();
			}
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
