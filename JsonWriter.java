package com.bridgelabz.programs;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.bridgelabz.utility.Utility;

import java.util.Arrays;
import java.util.Scanner;
public class JsonWriter {

	
	
@SuppressWarnings("unchecked")
public static void main (String [] args){
	Scanner sc = new Scanner(System.in);
	JSONObject json = new JSONObject();

	System.out.println("Enter the titile of the book");
	String sc1 = sc.nextLine();
	
	json.put("title", sc1); 
	System.out.println("Enter Number of Characters of the film ");
	int size = sc.nextInt();
	System.out.println("Enter Characters of the film one by one");
	Scanner sc2 =new Scanner(System.in);
	String[] num = new String[size];
	
	for(int i =0; i<size;i++)
	{
		
		System.out.print((i+1)+":");
		num[i]= sc2.nextLine();
	}
	
	json.put("Characters", Arrays.toString(num));
	System.out.println("Enter Author of the film ");
	Scanner sc3 =new Scanner(System.in);
		json.put("author", sc3.nextLine());
	
	System.out.println("Enter the price of the book");
	int num1 = sc.nextInt();
	json.put("price", num1);
	try { 
		System.out.println("Writting JSON into file ..."); 
		System.out.println(json);
		FileWriter jsonFileWriter = new FileWriter("/home/bridgeit/Desktop/Test1.json");
		jsonFileWriter.write(json.toJSONString());
		jsonFileWriter.flush();
		jsonFileWriter.close(); 
		System.out.println("Done"); 
	} 
		catch (IOException e) 
	{
		e.printStackTrace(); 
	} 
}
}