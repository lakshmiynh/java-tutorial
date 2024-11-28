package com.bridgelabzz;

public class Avg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				int arr[]= {4,6,9,12,15};
				
				int sum=0;
				int avg=0;
				int count=0;
				
				for(int i=0;i<arr.length;i++)
				{
					if( arr[i] % 2 == 0)
					{
					    sum=sum+arr[i];
					    count++;
					}
					
				}  
				
				avg=sum/count;
				System.out.println(avg);
		
	}

}
