package com.bridgelabzz;

public class CheckPal {

	public int Palindrome(int n)
	{
	  int	rev=0;
	  while(n!=0)
	  {
		int rem=n%10;
		rev=rev*10+rem;
		n=n/10;
	  }
	  return rev;
		
   }
	
public static void main(String args[])
{
	int number=343;
	CheckPal obj=new CheckPal();
	int reverse=obj.Palindrome(number);
	if(reverse==number)
	{
		System.out.println("palindrome");
	}
	else
	{
		System.out.println("Not palindrome");
	}
		
  }

}

