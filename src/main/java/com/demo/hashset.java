package com.demo;

import java.util.HashSet;
import java.util.Iterator;

public class hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashSet treeset,LinkedHashset implements Set interface
		//does not accept duplicate value
		//There is no guarantee elements stored in sequential order...Random order
		HashSet<String> hs= new HashSet<String>();
		hs.add("USA");
		hs.add("UK");
		hs.add("India");
		hs.add("he");
		hs.add("she");
		System.out.println(hs);
		//System.out.println(hs.remove("UK"));
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		
		//Iterator
		Iterator<String> i=hs.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
