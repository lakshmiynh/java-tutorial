package com.bridgelabzz;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Collection3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Set<Integer> s=new HashSet<Integer>();
          
            s.add(67);
            s.add(6);
            s.add(66);
            s.add(67);
            
            Iterator<Integer> itr=s.iterator();
    		
    		while(itr.hasNext())
    		{
    			System.out.println(itr.next());
    		}

	}

}
