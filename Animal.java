package com.bridgelabzz;

public  class Animal
{
   public void eat()
   {
	   System.out.println("eating....");
   }
}

 class Cat extends  Animal
 
 {
	 public void drinking()
	 {
		 System.out.println("dring milk.....");
	 }
 }

 class Inherit 
{
	public static void main(String args[])
	{
		Cat obj=new Cat();
		obj.drinking();
	}
	
}

