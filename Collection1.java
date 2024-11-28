package com.bridgelabzz;
import java.util.*;

public class Collection1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String>  list=new ArrayList<String>();
		list.add("ravi");
		list.add("anu");
		list.add("jhon");
		
		Iterator<String> itr=list.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
