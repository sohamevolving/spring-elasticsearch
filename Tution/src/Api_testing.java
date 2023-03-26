import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONArray;
import org.json.JSONObject;
public class Api_testing {
	public static void main(String[] args) {
     try {
         call_me();
        } catch (Exception e) {
         e.printStackTrace();
       }
     }
	   
public static void call_me() throws Exception {
     String url = "https://api.covid19api.com/summary";
     URL obj = new URL(url);
     HttpURLConnection con = (HttpURLConnection) obj.openConnection();
     // optional default is GET
     con.setRequestMethod("GET");
     //add request header
    // con.setRequestProperty("User-Agent", "Mozilla/5.0");
     int responseCode = con.getResponseCode();
     System.out.println("\nSending 'GET' request to URL : " + url);
     System.out.println("Response Code : " + responseCode);
     BufferedReader in = new BufferedReader(
             new InputStreamReader(con.getInputStream()));
     String inputLine;
     StringBuffer response = new StringBuffer();
     while ((inputLine = in.readLine()) != null) {
     	response.append(inputLine);
     }
     in.close();
     //print in String
     System.out.println(response.toString());
     //Read JSON response and print
     JSONObject myResponse = new JSONObject(response.toString());
     System.out.println(myResponse);
     System.out.println("result after Reading JSON Response");
     JSONArray Countries=new JSONArray();
     
     //System.out.println(myResponse.getJSONArray("Countries"));
      Countries=myResponse.getJSONArray("Countries");
      
      for(int i=0;i<Countries.length();i++)
      {
    	  JSONObject everycountries =new JSONObject();
    	  everycountries=(JSONObject) Countries.get(i);
    	  System.out.println("#############################################");
    	  System.out.println(everycountries.get("ID"));
    	  System.out.println(everycountries.get("Country"));
    	  
    	  System.out.println(everycountries);
    	  
    	  
    	  
    	  
    	  
    	  
    	  
      }
     
     /*System.out.println("statusCode- "+myResponse.getString("statusCode"));
     System.out.println("statusMessage- "+myResponse.getString("statusMessage"));
     System.out.println("ipAddress- "+myResponse.getString("ipAddress"));
     System.out.println("countryCode- "+myResponse.getString("countryCode"));
     System.out.println("countryName- "+myResponse.getString("countryName"));
     System.out.println("regionName- "+myResponse.getString("regionName"));
     System.out.println("cityName- "+myResponse.getString("cityName"));
     System.out.println("zipCode- "+myResponse.getString("zipCode"));
     System.out.println("latitude- "+myResponse.getString("latitude"));
     System.out.println("longitude- "+myResponse.getString("longitude"));
     System.out.println("timeZone- "+myResponse.getString("timeZone"));  */
   }



























}