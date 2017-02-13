package com.bridgelabz.programs;
import com.bridgelabz.utility.Utility;

public class StopWatch_1 {
	long ElapsedTime=0;
	long StartTime=0;
	long StopTime=0;
	// Stop watch start method/
	public void start()
	{
	StartTime = System.currentTimeMillis();
	System.out.println(StartTime);
	}
	// Stop Method/		
		public void stop()
		{
		StopTime=System.currentTimeMillis();
		}
	// Elapsed TIme/		
			public long ElapsedTime()
			{
			ElapsedTime = (StopTime - StartTime);
			return ElapsedTime;
			}
				 	
					public static void main(String[] args)
                      {
						Utility u = new Utility();
						StopWatch_1 w = new StopWatch_1();
						System.out.println("Please Choose your option: \n1.Start \n2. Stop");
						int num=u.inputInteger();
						w.start();			
						System.out.println("Time is Started\nPlease Enter 2 for Stopping the clock: ");
						int num2=u.inputInteger();
						w.stop();
						System.out.println("Elap1sed Time-: "+w.ElapsedTime()+" mili Seconds");
						}
}
