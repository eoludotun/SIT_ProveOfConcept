//package com.webServicesUtils;
//
//import java.io.BufferedReader;
//import java.io.DataOutputStream;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.net.HttpURLConnection;
//import java.net.URL;
//
//
//
//
//
//public class ServiceRequests {
//	
//	
//	public String createWorkSpacePostRequest(String url, String testClient, String testProtocolName) throws Exception {
//		 
//		  URL obj = new URL(url);
//		  HttpURLConnection con = (HttpURLConnection) obj.openConnection();
//
//		  // Setting basic post request
//		  con.setRequestMethod("POST");
//		  //con.setRequestProperty("User-Agent", USER_AGENT);
//		  con.setRequestProperty("Accept","application/json, text/plain, */*");
//
//		  con.setRequestProperty("Accept-Language", "en-US,en;q=0.9");
//		  con.setRequestProperty("Connection","keep-alive");
//		  con.setRequestProperty("Content-Type","application/json;charset=UTF-8");
//
//		 String postJsonData = "{\r\n" + 
//		 		"\"clientName\": \""+testClient+"\",\r\n" + 
//		 		"\"protocolName\": \""+testProtocolName+"\"\r\n" + 
//		 		"} ";
//
//		 	  
//		  // Send post request
//		  con.setDoOutput(true);
//		  DataOutputStream wr = new DataOutputStream(con.getOutputStream());
//		  wr.writeBytes(postJsonData);
//		  wr.flush();
//		  wr.close();
//		 
//		  int responseCode = con.getResponseCode();
//		  System.out.println("nSending 'POST' request to URL : " + url);
//		  System.out.println("Post Data : " + postJsonData);
//		  System.out.println("Response Code : " + responseCode);
//		 
//		  BufferedReader in = new BufferedReader(
//		          new InputStreamReader(con.getInputStream()));
//		  String output;
//		  StringBuffer response = new StringBuffer();
//		 
//		  while ((output = in.readLine()) != null) {
//		   response.append(output);
//		  }
//		  in.close();
//		  
//		  //printing result from response
//		  System.out.println(response.toString());
//		  return response.toString();
//	}
//		
//	public String sendGetRequest(String url) throws IOException {
//		URL obj = new URL(url);
//		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
//
//		// optional default is GET
//		con.setRequestMethod("GET");
//		int responseCode = con.getResponseCode();
//		String getResponse = "";
//		//Assert successful response code
//		if(responseCode!=500) {
//			//Assert.assertEquals(responseCode, 200);
//		
//			BufferedReader in = new BufferedReader(
//				new InputStreamReader(con.getInputStream()));
//				String inputLine;
//				StringBuffer response = new StringBuffer();
//
//				while ((inputLine = in.readLine()) != null) {
//					response.append(inputLine);
//			}
//				in.close();
//				getResponse = response.toString();
//		}
//		return getResponse;	
//	}
//	
//	
//
//}
