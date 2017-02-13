package com.bridgelabz.programs;

import java.util.Stack;

import com.bridgelabz.utility.Utility;

public class Paranthesis {
		
		public static boolean checkBalancedParenthesis(String input){
		boolean mIsBalanaced = false;
		String mStr=null;
		Stack stack = new Stack();
		for(int i=0; i < input.length(); i++){
		         //store characters as String
			mStr = ""+input.charAt(i);

			//if opening bracket then push into stack
			if(mStr.equals("(") || mStr.equals("[") || mStr.equals("{")){
				stack.push(mStr);
			}

			//if closing bracket, pop bracket and compare if its a pair
			if(mStr.equals(")") || mStr.equals("]") || mStr.equals("}")){
			//if stack becomes empty in between then also its not balanced
				if(stack.isEmpty()){
					return false;
				}
				String opening = (String)stack.peek();
				if(mStr.equals(")") && opening.equals("(")){
					stack.pop();
				}
				if(mStr.equals("]") && opening.equals("[")){
					stack.pop();
				}
				if(mStr.equals("}") && opening.equals("{")){
					stack.pop();
				}
			}			
		}
		//if stack is empty at end, then its balanced
		if(input.length() > 0 && stack.isEmpty()){
			mIsBalanaced = true;
		}
        return mIsBalanaced;
	}

	 	public static void main(String[] args) {
	 		Utility u = new Utility();
	        System.out.println("Enter the String");
	        String input = u.inputString();		
	        boolean flag = checkBalancedParenthesis(input);
			if(flag){	
				System.out.println("Balanced");
			}else{
				System.out.println("Not Balanced");
			}		
		
	}
}
