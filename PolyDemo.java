package com.bridgelabzz;

class Addition
{
	public int add(int a,int b)
	{
		return  a+b;
	}
	
	public int add(int a,int b,int c)
	{
		return  a+b+c;
	}
}


public class PolyDemo 
{
	public static void main(String args[])
	{
		
		Addition obj=new Addition();
		int a=5,b=10,c=100;
		int ans=obj.add(a,b,c);
		int ans1=obj.add(a,b);
		System.out.println(ans +" sum of the numbers");
		System.out.println(ans1 +" sum of the numbers");
	}

}
