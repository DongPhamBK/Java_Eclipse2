package sett;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
public static void main(String[] args) {
	Set<String> k = new TreeSet<String>();
	
	k.add("a");
	
	for(String i:k){
		System.out.println(i);
	}
}
}
