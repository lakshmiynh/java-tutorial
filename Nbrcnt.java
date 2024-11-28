package com.bridgelabzz;

public class Nbrcnt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=424556374;
		int count=0;
		while(n!=0)
		{
		  int lastdigit=n%10;
		  n=n/10;
		  count++;
		}
        System.out.println(count);
	}

}
