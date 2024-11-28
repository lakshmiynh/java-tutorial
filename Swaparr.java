package com.bridgelabzz;

public class Swaparr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int[] arr1={34,78,44,90,11};
		int arr2[]=new int[arr1.length];

		for(int i=0;i<=arr1.length-1;i++)
		{
			if(i % 2==0)
			{
				if(i+1<arr1.length)
				{
					arr2[i]=arr1[i+1];
				}
				else
				{
					arr2[i]=arr1[i-1];
				}
			}
			else
			{
				arr2[i]=arr1[i-1];
			}
		}
      for(int f=0;f<=arr2.length-1;f++)
      {
    	  System.out.println(arr2[f]);
      }
		
  }
}		

	


