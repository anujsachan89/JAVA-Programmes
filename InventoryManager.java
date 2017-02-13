package com.bridgelabz.programs;
import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.bridgelabz.utility.Utility;
public class InventoryManager{
	public static void main (String [] args){
		double sum=0.0;
		Utility u = new Utility();
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
			      
			        Object quantObject = itemData.get("weight");
			        int quantity = Integer.parseInt((String)quantObject);
			        System.out.println("Weight: "+quantity+" Kg");
			       
			        Object priceObject = itemData.get("price");
			        double price = Double.parseDouble((String) priceObject);
			        System.out.println("price: "+price+" Rs/Kg");
			        
			        
			        System.out.println("--------------------------------");
				  }
			 System.out.println("Total Price of Item:"+sum);
			 System.out.println("****************************");
		 }

	}
	catch(Exception e){
		System.out.println(e);
	}
		System.out.println("Hello ! Please Choose your option to purchase: \n1.Rice \n2. Pulse \n3. Wheat");
		int num = u.inputInteger();
		if(num==1)
		{
			System.out.println("Hello ! Please Choose your option to purchase: \n1.Karawali \n2. Jasmine \n3. grain");
			int num1 = u.inputInteger();
			if(num1==1){
				System.out.println("Hello ! Your option is Karawali");
				System.out.println("HOw much weight you want in kg");
				int weight = u.inputInteger();
				int amount = weight*10;
				System.out.println("Your amount is :"+amount);
				System.out.println("Thank You For Shopping with us !! Have a Nice day");
			}
				if(num1==2)
				{
					System.out.println("Hello ! Your option is Jasmine");
					System.out.println("HOw much weight you want in kg");
					int weight1 = u.inputInteger();
					int amount1 = weight1*20;
					System.out.println("Your amount is :"+amount1);
					System.out.println("Thank You For Shopping with us !! Have a Nice day");
				}
				if(num1==3)
				{
					System.out.println("Hello ! Your option is Grain");
					System.out.println("HOw much weight you want in kg");
					int weight2 = u.inputInteger();
					int amount2 = weight2*27;
					System.out.println("Your amount is :"+amount2);
					System.out.println("Thank You For Shopping with us !! Have a Nice day");
				}
				}
		else
		{
			System.out.println("Your Option is incorrect Please try again");
		}
				}	
		}
		/*else if(num==2)
		{
			System.out.println("Hello ! Please Choose your option to purchase: \n1.Faba beans \n2. Chick peas \n3. pigeon peas");
			int num3 = u.inputInteger();
			if(num3==1){
				System.out.println("Hello ! Your option is Karawali");
				System.out.println("HOw much weight you want");
				int weight = u.inputInteger();
				int amount = weight*10;
				System.out.println("Your amount is :"+amount);
			}
		}
		*/
		