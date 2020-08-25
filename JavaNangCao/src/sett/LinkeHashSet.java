package sett;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkeHashSet {
public static void main(String[] args) {
	Set<Person> set = new LinkedHashSet<Person>();
	
	set.add(new Person(1111));
	set.add(new Person(112));

	for(Person i:set){
		System.out.println(i.getId());
	}
	
	set.remove(new Person(1111));//éo đc nếu không có hashCode
	for(Person i:set){
		System.out.println(i.getId());
	}
}
}
