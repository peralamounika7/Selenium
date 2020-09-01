package com.selinum.practice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.print.DocFlavor.STRING;

public class HashSetTest 
{

	public static void main(String[] args) 
	
	{
		//HashSet<String> h=new HashSet();
	 Set<String> h=new HashSet<>();
	 h.add("mounika");
	 h.add("satya");
	 h.add("qedge");
	 h.add("mounika");
	 System.out.println(h.size());
	 Iterator<String> it=h.iterator();
	 while(it.hasNext())
	 {
	 System.out.println(it.next());
	 }
	 

	}

}
