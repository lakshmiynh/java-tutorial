package com.bridgelabzz;

public class PrimeFactorization {

	public static void main(String[] args) {
		
		
		int number=50;
		
		for(int i=2;i<=number;i++)
		{
			while(number%i == 0)
			{
				System.out.println(i +" ");
				number=number/i;
			}
		}

		
	}

}
