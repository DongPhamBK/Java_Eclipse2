package sett;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DemoSet {
	public static void main(String[] args) {
		Set<String> se = new HashSet<String>();
		se.add("a");
		se.add("b");
		se.add("b");
		se.add("d");
		
		for(String i:se){
			System.out.println(i);
		}
		
		Iterator<String> itr = se.iterator();
		while(itr.hasNext()){
			String s = itr.next();
			if(s.equals("a")){
				itr.remove();
			}
			
		}
		
		for(String i:se){
			System.out.println(i);
		}
	}
}
