package com.bridgelabz.programs;

public class Coin_1 {
	public static void main(String []args)
	   {
	    double flip=10;
	    double headperc=0;
	    double tailperc=0;
	    double headcount=0;
	    double tailcount=0;
	  
	for(flip=1;flip<=10;flip++)
	   {
	if(Math.random()<0.5) 
	    {

	     headcount++;

	    }
	else
	     
	//System.out.println("tail");
	      tailcount++;
	     

	}
	System.out.println("tail count"+tailcount);
	System.out.println("head count"+headcount);
	System.out.println("Percentage of heads ="+(headcount/flip)*100+"%");
	System.out.println("Percentage of tails ="+(tailcount/flip)*100+"%");
	System.out.println("tail count"+tailperc);
	System.out.println("head count"+headperc);
	}


}
