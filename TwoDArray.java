package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class TwoDArray
{
public static void main(String [] args)
{
Utility u = new Utility();
System.out.println("Enter number of rows M and number of columns N");
int m=u.inputInteger();
int n=u.inputInteger();
int arr[][]=new int[m][n];
for(int i=0;i<=m;i++)
{
  for(int j=0;j<=n;j++)
{
System.out.println(arr[i][j]);
}
}
}
}
