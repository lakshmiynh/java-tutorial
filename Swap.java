package com.bridgelabzz;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a=3;
	     int b=2;
	      
	       System.out.println("before swapping a=" + a + ",b=" + b);

	        a= a + b;  // a= 3+2= 5
	         
	        b= a - b;  //  b= 5 - 2= 3

	        a= a - b ;  //  a = 5 - 3= 2
	     
	      System.out.println("after swapping a=" +a + ",b=" +b);

	}

}
