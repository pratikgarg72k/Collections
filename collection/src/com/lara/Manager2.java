package com.lara;

import java.util.ArrayList;

public class Manager2 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList<>();
		list.add(90);
		list.add(true);
		list.add(40);
		list.add(1, "test");
		for(Object obj: list) {
			System.out.println(obj);
		}
	}
}
