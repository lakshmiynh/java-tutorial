package com.bridgelabzz;

public class Sort {

	public static void main(String[] args) {
		
				int arr[]= {44,6,91,12,15};
				
				for(int i=0;i<arr.length;i++)
				{
					for(int j=0;j<arr.length-i-1;j++)
					{
						if(arr[j] > arr[j+1])
						{
							int temp=arr[j];
							arr[j]=arr[j+1];
							arr[j+1]=temp;
						}
					}
					
				}
				for(int k=0;k<arr.length;k++)
				{
					System.out.println(arr[k]);
				}

	}

}


