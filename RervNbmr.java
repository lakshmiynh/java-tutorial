package com.bridgelabzz;

public class RervNbmr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=42545;
		int rev=0;
		while(n!=0)
		{
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println(rev);

	}

}