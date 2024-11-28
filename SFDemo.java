package com.bridgelabzz;

final class Calculate
{
	 static double pi=3.142;
	 static int r=4;
	 
	 static void area()
	 {  
		int A = (int) pi*r*r;
		System.out.println(A + " area of the circle");
	 }
}


public class SFDemo {
	
	public static void main(String args[])
	{
		Calculate.area();
		
	}

}
