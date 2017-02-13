package com.bridgelabz.programs;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Clinque {
	
	public void adddoctor(){
		
		System.out.println("Enter no. of doctors");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		JSONArray b = new JSONArray();
		for (int i =0; i<num;i++){
			JSONObject json = new JSONObject();
			System.out.println("Enter name of doctor");
			String name = sc.next();
			json.put("Name",name);
			System.out.println("Enter I.D doctor");
			int id = sc.nextInt();
			json.put("ID",id);
			System.out.println("Enter Specialization of doctor");
			String spec = sc.next();
			json.put("Specialization",spec);
			System.out.println("Enter Availablity of doctor");
			String avail = sc.next();
			json.put("Availiablity",avail);
			b.add(json);
		}
		
		try { 
			System.out.println("Writting JSON into file ..."); 
			FileWriter jsonFileWriter = new FileWriter("/home/bridgeit/Desktop/Doctor.json");
				jsonFileWriter.write(b.toJSONString());
				jsonFileWriter.flush();
				jsonFileWriter.close(); 
				System.out.println("Doctor Added:"+b);
		} 
			catch (IOException e) 
		{
			e.printStackTrace(); 
		}
		
	}
	public void searchDoctor()
	{
		Scanner sc1 = new Scanner(System.in);
		try{
			JSONParser parser = new JSONParser();
			JSONArray a = (JSONArray) parser.parse(new FileReader("/home/bridgeit/Desktop/Doctor.json"));
			System.out.println("Enter the doctor name you want to search");
			String name1 = sc1.next();
			
			for (Object o : a)
	        {
	            JSONObject name = (JSONObject) o;
	            String st = (String) name.get("Name");
	            if(name1.equals(st))
	            {
	            	System.out.println("Doctor found"+name);
	            }
	            else
	            {
	            	System.out.println("Entered Wrong Name");
	            }
	        }
		}
		catch(Exception e){
			e.printStackTrace();
		}
		}
		public void searchPatient()
		{
			Scanner sc2 = new Scanner(System.in);
			System.out.println("Enter Name Of Patient");
			String  name2 = sc2.next();
		try{
			JSONParser parser1 = new JSONParser();
			JSONArray a = (JSONArray) parser1.parse(new FileReader("/home/bridgeit/Desktop/Patient.json"));
			
			for (Object b : a)
	        {
	            JSONObject name = (JSONObject) b;
	            String st1 = (String) name.get("Name");
	            if(name2.equals(st1))
	            {
	            	System.out.println("Patient found"+name);
	            }
	            else
	            {
	            	System.out.println("Entered Wrong Name");
	            }
	        }
		}
		catch(Exception e){
			System.out.println(e);
		}	
		}
		public void addpatient()
		{
			System.out.println("Enter no. of patient");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			JSONArray a = new JSONArray();
			for (int i =0; i<num;i++){
				JSONObject json1 = new JSONObject();
				System.out.println("Enter name of patient");
				String name = sc.next();
				json1.put("Name",name);
				System.out.println("Enter I.D patient");
				int id = sc.nextInt();
				json1.put("ID",id);
				System.out.println("Enter Mobile Number of patient");
				BigInteger numb = sc.nextBigInteger();
				json1.put("mobNumber",numb);
				System.out.println("Enter Age  of patient");
				int age = sc.nextInt();
				json1.put("Age",age);
				a.add(json1);
				
			}
			
			try { 
				System.out.println("Writting JSON into file ..."); 
				FileWriter jsonFileWriter = new FileWriter("/home/bridgeit/Desktop/Patient.json");
					jsonFileWriter.write(a.toJSONString());
					jsonFileWriter.flush();
					jsonFileWriter.close();
					System.out.println("Pateint Added: "+a);
				} 
				catch (IOException e) 
			{
				e.printStackTrace(); 
			} 
			
		}
		public void appointmentofDoctor()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Hello ! Welcome to Clinque");
			System.out.println("Please Enter Patient Name");
			String name = sc.next();
			/*System.out.println("Please Enter Patient I.D");
			int id = sc.nextInt();*/
			System.out.println("Hello: "+name +" Enter Doctor Name for which you want to take Appointment");
			String doc = sc.next();
			DateFormat df = new SimpleDateFormat("dd/MM/yy");
		    Date dateobj = new Date();
		       /*getting current date time using calendar class 
		        * An Alternative of above*/
		    Calendar calobj = Calendar.getInstance();
		    JSONObject doctorInfo = null;
		    int count = 0;  
			try{
				JSONParser parser = new JSONParser();
				JSONArray q = (JSONArray) parser.parse(new FileReader("/home/bridgeit/Desktop/Doctor.json"));
				for (int i = 0; i < q.size(); i++) {
					JSONObject obj = (JSONObject) q.get(i);
					String doctorName = (String)obj.get("Name");
					if(doctorName.equals(doc))
					{
						doctorInfo = obj;
					}
				}
				File f = new File("/home/bridgeit/Desktop/Appointment.json");
				FileReader filereader = new FileReader(f);
				JSONArray appointmentFileObj =new JSONArray();
				if(f.length()>0)
				{		
					appointmentFileObj = (JSONArray) parser.parse(new FileReader("/home/bridgeit/Desktop/Appointment.json"));
				}
				for (int i = 0; i < appointmentFileObj.size(); i++)
				{
					JSONObject obj = (JSONObject) appointmentFileObj.get(i);
					String doctorName = (String)obj.get("doctorName");
					if(doctorName.equals(doc))
					{
						count++;
					}
				}
				if(count<5)
				{
					JSONObject obj1 = new JSONObject();
					Long doctorId = (Long)doctorInfo.get("ID");
					String doctorName = (String)doctorInfo.get("Name");
					obj1.put("doctorId",doctorId);
					obj1.put("doctorName",doctorName);
					obj1.put("PatientName",name);
					obj1.put("Booking Date ", (df.format(calobj.getTime())));
					appointmentFileObj.add(obj1);
					FileWriter file = new FileWriter("/home/bridgeit/Desktop/Appointment.json");
					file.write(appointmentFileObj.toJSONString());
					file.flush();
					file.close();
					System.out.println("Your Appointment is fixed  With Doctor "+doctorName + " Booked On: "+(df.format(calobj.getTime())));
				}else{
					System.out.println("Doctor Not Available for the day.............");
					System.out.println("Please Try wit Another doctor");
				}
				
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			
			
			
		}
		
public static void main(String [] args)
{
	
	Clinque v = new Clinque();
	Scanner sc = new Scanner(System.in);
	System.out.println("Welcome to Clinic Which operation you want to do ? \n1. Add Doctor \n2. Add Patient \n3. Search Doctor \n4. Search Patient  \n5. Fix appoitment to doctor");
	int choice = sc.nextInt();
	switch(choice) {
	   case 1 :
		   v.adddoctor();
		   break;
	   case 2 :
		   v.addpatient();
		   break;
	   case 3 :
		   v.searchDoctor();
		   break;
	   case 4 :
		   v.searchPatient();
		   break;
	   case 5 :
		   v.appointmentofDoctor();
		   break;
}
}
}
	