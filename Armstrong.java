package com.bridgelabzz;

import java.util.Scanner;


public class Armstrong 
{
	
	public int check(int number) {
        int count = 0;
        int temp = number;
        while (temp != 0) 
        { 
        	temp = temp / 10;
            count++;
             
        }
        System.out.println("Number of digits: " + count);
        
        int armstrong = 0; 
        temp = number;
        while (temp != 0) 
        { 
            int lastdigit = temp % 10;
            temp = temp / 10;
            armstrong = (int) (armstrong + Math.pow(lastdigit, count)); 
        }
        return armstrong;
    }

   
    public static void main(String args[]) 
    {
    	Scanner sc=new Scanner(System.in); 
    	
    	System.out.println("enter a number");
    	
        int number =sc.nextInt();
        
        Armstrong obj=new Armstrong();
        
        int armnumber = obj.check(number); 
        if (armnumber == number) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not Armstrong");
        }
    }
   
}


