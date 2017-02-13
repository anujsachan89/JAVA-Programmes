package com.bridgelabz.programs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;

public class RegularExpression {
	
		@SuppressWarnings("resource")
		public static void main(String[] args){
		    Scanner sc=new Scanner(System.in);
		    String fullName=null,fName=null,phoneNumber=null,message=null;
		    //To read Message.txt file content
		    try{
		        BufferedReader buf=new BufferedReader(new FileReader("/home/bridgeit/Downloads/Message.txt"));
			message=buf.readLine();
		    }
		    catch(Exception e){
	    		e.printStackTrace();
	            }
	            System.out.println("Enter the username");
	            //To read string from the keyboard.
		        fullName=sc.nextLine();
		        //string should match with this format
			boolean checkName=Pattern.matches("[A-Z][a-zA-Z]*[\\s][A-Z][a-zA-Z]*",fullName);
			if(checkName){
				String name[]=fullName.split(" ");
				fName=name[0];
			}
			else{
				System.out.println("Entered usename is not in the format,please enter in 'Abc Xyz' format");
				System.exit(0);
			}
			System.out.print("Enter Your 10-Digits Phone Number: ");
			//To read string from the keyboard.
			phoneNumber = sc.next();
			boolean checkNumber = Pattern.matches("[789]{1}\\d{9}",phoneNumber);
			if(!checkNumber){
				System.out.println("Number is incorrect");
				System.exit(0);
			}
			DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			String date = dateFormat.format(new Date());
			message = message.replace("<<name>>",fName);
			message = message.replace("<<full name>>",fullName);
			message = message.replace("xxxxxxxxxx",phoneNumber);
			message = message.replace("XX/XX/XXXX",date);
			System.out.println("\n"+message);
			}
			
	}
