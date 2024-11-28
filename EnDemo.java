package com.bridgelabzz;

class Student
{
	private int age;
	private String name;
	
	public int getAge()
	{
		return age;
	}
	
	public void setAge(int a)
	{
		age=a;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setname(String n)
	{
		name=n;
	}
}


public class EnDemo {
	public static void main(String args[])
	{
		Student obj=new Student();
		int a;
		obj.setAge(a=30);
		String n="naveen";
		obj.setname(n);
		int age = obj.getAge(); 
        String name = obj.getName(); 
        System.out.println("Age: " + age);
        System.out.println("Name: " + name); 
	}

}
