package com.bridgelabzz;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,String> map=new HashMap<Integer,String>();
         map.put(100,"ayush");
         map.put(150,"avi");
         map.put(10,"anisha");
         
         for(Entry m:map.entrySet())
         {
        	 System.out.println(m.getKey()+" "+m.getValue());
         }
	}

}
