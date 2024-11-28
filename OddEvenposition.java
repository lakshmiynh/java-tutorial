package com.bridgelabzz;

public class OddEvenposition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {4,6,9,12,15};
		System.out.println("Even numbers in array");
		for(int i=0;i<arr.length;i++)
		{
			if( arr[i] % 2 == 0)
			{
			System.out.println(arr[i]);
			}
			
		}
		System.out.println("Odd numbers in array");
		for(int i=0;i<arr.length;i++)
		{
			if( arr[i] % 2 != 0)
			{
			System.out.println(arr[i]);
			}
			
		}
	}

}
