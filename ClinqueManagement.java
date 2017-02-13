package com.bridgelabz.programs;

import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ClinqueManagement {
	public static void main(String[] args) {
	JSONParser parser = new JSONParser();
	try{
		Object ob = parser.parse(new FileReader("/home/bridgeit/Desktop/Clinque.json"));
		JSONObject object = (JSONObject) ob;//json object created
		
		
		 JSONArray data = (JSONArray) object.get("Clinque");
		 String[] str = {"doctor"};
		 for(int i=0;i<data.size();i++){
			 JSONObject itemObj = (JSONObject) data.get(i);
			 JSONArray item = (JSONArray) itemObj.get(str[0]);
			 System.out.println(str[0]+" Clinque:");
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
			        System.out.println("Specialization: "+itemData1.get("specialization"));
			        
			        JSONObject itemData2 = (JSONObject) item.get(y);
			        System.out.println("Availability: "+itemData2.get("Availability"));
			  }
			 System.out.println("*********************");
			 
		 }
		 JSONArray data1 = (JSONArray) object.get("Clinque");
		 String[] str1 = {"patient"};
		 for(int i=0;i<data1.size();i++){
			 JSONObject itemObj = (JSONObject) data.get(i);
			 JSONArray item = (JSONArray) itemObj.get(str1[1]);
			 System.out.println(str[1]+" Patients:");
			 /*
			  * To display the array elements[name,value]
			  * */
			 for (int j = 0; j < item.size(); j++) {
			        JSONObject itemData = (JSONObject) item.get(j);
			        System.out.println("name: "+itemData.get("name"));
			      
			        Object quantObject0 = itemData.get("id");
			        int id = Integer.parseInt((String)quantObject0);
			        System.out.println("id: "+id);
			        
			        Object quantObject1 = itemData.get("age");
			        int age = Integer.parseInt((String)quantObject1);
			        System.out.println("age: "+age);
			        
			        Object quantObject2 = itemData.get("Mobile Number");
			        int number = Integer.parseInt((String)quantObject2);
			        System.out.println("Number: "+number);
			  }
		 }

	}
	catch(Exception e){
		System.out.println(e);
	}
}

}