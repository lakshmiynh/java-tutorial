package com.bridgelabzz;

public class Bsearch {
	
	public static void binarySearch(int arr[], int first, int last, int key)
	{  
		   int mid = (first + last)/2; 
		   
		   while( first <= last )
		   {  
		      if ( arr[mid] < key )
		      {  
		        first = mid + 1;     
		      }
		      else if ( arr[mid] == key )
		      {  
		        System.out.println("Element is found at index: " + mid);  
		        break;  
		      }
		      else
		      {  
		         last = mid - 1;  
		      }  
		      mid = (first + last)/2;  
		   }  
		   if ( first > last )
		   {  
		      System.out.println("Element is not found!");  
		   }  
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
         int arr[]= {67,90,223,666,1000};
		
		int key=67;
		
		int left=0;
		int right=arr.length-1;
		
		int mid=left+right;
		
		
		binarySearch(arr,left,right,key);
		
		
		
	}

}
