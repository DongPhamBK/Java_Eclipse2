package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo {
public static void main(String[] args) {
	
	List<String> s = new ArrayList<String>();// lại là một kiểu list ak !
	s.add("a");
	s.add("f");
	s.add("k");
	s.add("s");
	s.add("b");
	
	Iterator<String> itr  = s.iterator();
	
	// dùng while nhé !
//	while (itr.hasNext()) {
//		String temp = itr.next();
//		System.out.println(temp);// in ra
//		
//	}
	
	while (itr.hasNext()) {
		String temp = itr.next();
		if(temp.equals("a")){
			itr.remove();// xoá phần tử a
		}
		
		System.out.println(temp);
		
	}
	System.out.println("///////");
	for(String i:s){
		System.out.println(i);
	}
}
}
