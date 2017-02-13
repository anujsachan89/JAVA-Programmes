package com.bridgelabz.programs;
import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class JsonDecodeDemo {
	public static void main(String[] args) {
		JSONParser parser = new JSONParser();
		try{
			Object ob = parser.parse(new FileReader("/home/bridgeit/Downloads/Information.json"));
			JSONObject object = (JSONObject) ob;//json object created
			
			
			 JSONArray data = (JSONArray) object.get("data");
			 String[] str = {"rice","pulses","wheats"};
			 /*
			  * To read the .json file content i.e Object and each Object [name,values]
			  * */
			 for(int i=0;i<data.size();i++){
				 JSONObject itemObj = (JSONObject) data.get(i);
				 JSONArray item = (JSONArray) itemObj.get(str[i]);
				 System.out.println(str[i]+" Data:");
				 /*
				  * To display the array elements[name,value]
				  * */
				 for (int y = 0; y < item.size(); y++) {
				        JSONObject itemData = (JSONObject) item.get(y);
				        System.out.println("name: "+itemData.get("name"));
				      
				        Object quantObject = itemData.get("id");
				        int id = Integer.parseInt((String)quantObject);
				        System.out.println("id: "+id);
				        
				        JSONObject itemData1 = (JSONObject) item.get(y);
				        System.out.println("specialization: "+itemData1.get("specialization"));
				        
				        JSONObject itemData2 = (JSONObject) item.get(y);
				        System.out.println("Availability: "+itemData2.get("Availability"));
				  }
				 System.out.println("*********************");
			 }

		}
		catch(Exception e){
			System.out.println(e);
		}
	}

}