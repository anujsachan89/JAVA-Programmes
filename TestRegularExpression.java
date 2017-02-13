package com.bridgelabz.programs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

import com.bridgelabz.utility.Utility;

public class TestRegularExpression {

	public static void main (String [] args)
	{
		Utility u = new Utility();
		String message=null;
		String str=null;
		String num=null;
		String email=null;
		String firstName=null;
		try{
	        @SuppressWarnings("resource")
			BufferedReader buf=new BufferedReader(new FileReader("/home/bridgeit/Downloads/Message.txt"));
		message=buf.readLine();
	    }
	    catch(Exception e){
    		e.printStackTrace();
            }
		
		System.out.println("Enter Your Full Name");
		str = u.inputString();
		boolean checkName=Pattern.matches("[A-Z][a-zA-Z]*[\\s][A-Z][a-zA-Z]*",str);
		if(checkName){
			String name[]=str.split(" ");
			firstName=name[0];
		}
		else{
			System.out.println("Entered usename is not in the format,please enter in 'Abc Xyz' format");
			System.exit(0);
		}
		System.out.println("Enter Your 10 digit Mobile Number:");
		num = u.inputString();
		boolean checkNumber=Pattern.matches("[789]{1}[0-9]{9}", num);
		if(!checkNumber){
			System.out.println("Number is incorrect");
			System.exit(0);
		}
		System.out.println("Enter Your Email-I.d:");
		email = u.inputString();
		boolean checkName1=Pattern.matches("\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4}\\b",email);
		if(!checkName1){
			System.out.println("Email is incorrect");
			System.exit(0);
		}
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String date = dateFormat.format(new Date());
		
		message = message.replace("<<name>>",firstName);
		message = message.replace("<<full name>>",str);
		message = message.replace("xxxxxxxxxx",num);
		message = message.replace("<<email>>",email);
		message = message.replace("XX/XX/XXXX",date);
		
		System.out.println("\n"+message);
	}	
}
