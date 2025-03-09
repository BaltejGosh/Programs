package Basics;

import java.util.ArrayList;

public class ArraylistDemo {

	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("amit");
		list.add("sumit");
		list.add("payal");
		System.out.println(list);
		list.add("amit");
		System.out.println(list);//duplicates allowed.
		

	}

}
