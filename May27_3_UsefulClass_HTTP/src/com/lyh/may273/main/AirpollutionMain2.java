package com.lyh.may273.main;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import com.lyh.http.client.LyhHttpClient;

// 미세먼지 => 파싱 => 값들을 => txt파일에 담기
// (프로그램실행시)날짜,측정구,미세먼지,초미세먼지,오존,통합대기환경지수
// 날짜형식 : 연-월-일-오전/오후-시-요일
// 단위 X

public class AirpollutionMain2 {
	public static void main(String[] args) {
//		BufferedWriter bw = null;
//		try {
//			FileWriter fw = new FileWriter("C:\\Users\\sdedu\\Desktop\\Test\\lyh1.txt", true);
//
//			String address = "http://openapi.seoul.go.kr:8088/4f626857416f6c6c3632586a416843/xml/RealtimeCityAir/1/25/";
//			InputStream is = LyhHttpClient.download(address);
//			LyhHttpClient.convert(is, "UTF-8");
//
//			XmlPullParserFactory xppf = XmlPullParserFactory.newInstance();
//			XmlPullParser xpp = xppf.newPullParser();
//			xpp.setInput(is, "UTF-8");
//
//			int type = xpp.getEventType();
//			String tagName = null;
//			bw = new BufferedWriter(fw);
//			while (type != XmlPullParser.END_DOCUMENT) {
//				if (type == XmlPullParser.START_TAG) {
//					tagName = xpp.getName();
//				} else if (type == XmlPullParser.TEXT) {
//					if (tagName.equals("MSRDT")) {
//						bw.write(xpp.getText());
//					} else if (tagName.equals("MSRRGN_NM")) {
//						System.out.printf("권역명 : %s\n", xpp.getText());
//
//					} else if (tagName.equals("MSRSTE_NM")) {
//						System.out.printf("측정소명 : %s\n", xpp.getText());
//					} else if (tagName.equals("PM10")) {
//						System.out.println("미세먼지 : " + xpp.getText());
//					} else if (tagName.equals("PM25")) {
//						System.out.println("초미세먼지농도 : " + xpp.getText());
//					} else if (tagName.equals("O3")) {
//						System.out.println("오존 농도 : " + xpp.getText());
//					} else if (tagName.equals("CO")) {
//						System.out.printf("일산화탄소 농도: %s\n", xpp.getText());
//					} else if (tagName.equals("NO2")) {
//						System.out.printf("이산화 질소 농도 : %s\n", xpp.getText());
//					} else if (tagName.equals("SO2")) {
//						System.out.println("아황산 가스 농도 : " + xpp.getText());
//					} else if (tagName.equals("IDEX_NM")) {
//						System.out.println("통합대기환경등급 : " + xpp.getText());
//					} else if (tagName.equals("IDEX_MVL")) {
//						System.out.println("통합대기환경지수 : " + xpp.getText());
//					} else if (tagName.equals("ARPLT_MAIN")) {
//						System.out.println("지수결정물질 : " + xpp.getText());
//						System.out.println("--------");
//						bw.flush();
//					}
//
//				} else if (type == XmlPullParser.END_TAG) {
//					tagName = ""; // XML에서는 띄어쓰기를 텍스트로 인식하는 경우가 있음 => 오류발생
//				}
//				xpp.next(); // 다음걸로 넘어감
//
//				type = xpp.getEventType(); // 다음 태그의 값을 가짐
//			}
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		try {
//			bw.close();
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
		
		
		
		
		FileOutputStream fos = null;
		try {
			
			fos = new FileOutputStream("C:\\Users\\sdedu\\Desktop\\Test\\lyh1.txt", true);
			OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
			BufferedWriter bw = new BufferedWriter(osw);
			
			Date now = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-a-hh-E");
			String nowStr = sdf.format(now);
			
			String address = "http://openapi.seoul.go.kr:8088/4f626857416f6c6c3632586a416843/xml/RealtimeCityAir/1/25/";
			
			InputStream is = LyhHttpClient.download(address);
			
			XmlPullParserFactory xppf = XmlPullParserFactory.newInstance();
			XmlPullParser xpp = xppf.newPullParser();
			xpp.setInput(is, "UTF-8");
			
			int type = xpp.getEventType();
			String tagName = null;
			
			while (type != XmlPullParser.END_DOCUMENT) {
				if (type == XmlPullParser.START_TAG) {
					tagName = xpp.getName();
				}else if (type == XmlPullParser.TEXT){
					if (tagName.equals("MSRSTE_NM")) {
						bw.write(nowStr + ",");
						bw.write(xpp.getText() + ",");
					}else if (tagName.equals("PM10")) {
						bw.write(xpp.getText() + ",");
					}else if (tagName.equals("PM25")) {
						bw.write(xpp.getText() + ",");
					}else if (tagName.equals("O3")) {
						bw.write(xpp.getText() + ",");
					}else if (tagName.equals("IDEX_MVL")) {
						bw.write(xpp.getText() + "\r\n");
						bw.flush();
					}
				}else if (type == XmlPullParser.END_TAG) {
					tagName = ""; // XML에서는 띄어쓰기를 텍스트로 인식하는 경우가 있음 => 오류발생
				}
				xpp.next(); // 다음걸로 넘어감
				type = xpp.getEventType(); // 다음 태그의 값을 가짐
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			fos.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
			
		}
				
		
	}

