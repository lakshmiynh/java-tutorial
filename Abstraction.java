package com.bridgelabzz;

abstract class Shape
{
	abstract void draw();
}

class Rectangle extends Shape
{

	void draw() {
	   System.out.println("draw rectangle");
		
	         }
	
}

class Cercle extends Shape
{

	void draw() {
	   System.out.println("draw cercle");
		
	         }
	
}
public class Abstraction
{
	public static void main(String args[])
	{
		Shape obj=new Rectangle();
		obj.draw();
	}

}
