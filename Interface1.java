package com.bridgelabzz;

interface Drawable
{
	void draw();
}

class Rectangle1 implements Drawable
{  
public void draw()
{
	System.out.println("drawing rectangle");
}  
}  
class Circle1 implements Drawable
{  
public void draw()
{
	System.out.println("drawing circle");
}  
}  


public class Interface1 {
	public static void main(String args[])
	{
		Drawable obj=new Circle1();
				obj.draw();
	}

}
