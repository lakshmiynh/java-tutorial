package com.bridgelabzz;

public class Demo {
	
	
	public int checkpal(int n)
	{
	
		int rev=0;
		while(n!=0)
		{
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println(rev);
		return rev;
		
	}
	
class Palindrome
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=42545;
		
		
          Demo obj=new Demo();
          int revnm=obj.checkpal(number);
		if(revnm==number)
		{
			System.out.println("the number is palindrom");
		}
		else
		{
			System.out.println("Not palindrome");
		}
	}

}
}
