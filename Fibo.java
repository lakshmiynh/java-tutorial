package com.bridgelabzz;

public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		
		int firstnumber=0;
		int secondnumber=1;
		int nextnumber=0;
		
		System.out.println(firstnumber + "," +secondnumber);
		
		for(int i=2;i<n;i++)
		{
		      nextnumber=firstnumber+secondnumber;
			
			firstnumber=secondnumber;
			secondnumber=nextnumber;
			System.out.print(nextnumber + ",");
			
		}
	
	}

}
