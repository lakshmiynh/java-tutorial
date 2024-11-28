package com.bridgelabzz;

public class Lsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {67,90,23,66,10};
		
		int key=11;
		
		int flage=0;
		
		for(int i=0;i<=arr.length-1;i++)
		{
			if(key == arr[i])
			{
				flage=1;
			}
		}
		
		if( flage==1)
		{
			System.out.println(key);
		}
		else
		{
			System.out.println(-1);
		}

	}

}
