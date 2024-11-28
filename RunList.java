package com.bridgelabzz;

public class ListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList List=new LinkedList();
		List.insert(10);
		List.insert(15);
		List.insert(1);
		List.insertAtStart(30);
		List.insertAt(2, 11);
		List.delete(4);
		List.show();

	}

}
