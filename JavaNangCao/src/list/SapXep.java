package list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javafx.print.Collation;

public class SapXep {
public static void main(String[] args) {
	
	List<String> az = new ArrayList<String>();
	
	az.add("a");
	az.add("d");
	az.add("k");
	az.add("g");
	
	for(String i : az){
		System.out.println(i);
	}
	
	System.out.println("sort");
	
	
	Collections.sort(az);
	
	for(String i : az){
		System.out.println(i);
	}
	// dùng Interger cũng đc
}
}
