package com.list.practice;
import java.util.*;//all collection classes are here
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//List<Integer> l=new ArrayList<>();//we can add any objects
		List<String> l=new ArrayList<>();
		l.add("1");
		l.add("2");
		l.add("4");
		l.
		
		
		System.out.println(l); //will print complete list
		
		l.add(2, "3");
		System.out.println(l); //will print complete list
		
		List<String> listcollection=new LinkedList<>();
		listcollection.add("5");
		listcollection.add("5");
		listcollection.add("5");
		listcollection.add("5");
		l.addAll(listcollection);
		
		System.out.println(l);
		System.out.println("Printing linkedlist");
		System.out.println(listcollection);
		
		Set<String> hs=new HashSet<>();
		hs.addAll(l);
		System.out.println(hs);
		
		//l.addAll(index, c) homework
		//10 menthods
		
	//	l.clear();
		l.
		
		for(String s:l){
		System.out.println(s);	
		l.remove(s);
			
		}
	
	}

}
