package com.bridgelabzz;

import java.util.LinkedList;
import java.util.Iterator;

public class Collection2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer>  list=new LinkedList<Integer>();
		list.add(10);
		list.add(5);
		list.add(100);
		
		Iterator<Integer> itr=list.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
