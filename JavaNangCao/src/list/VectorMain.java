package list;

import java.util.List;
import java.util.Vector;

public class VectorMain {
public static void main(String[] args) {
	Person p = new Person(11);
	
	List<Person> l = new Vector<Person>();// tạo vector
	l.add(p);
	// thôi đến đây thì ok !
	
	l.remove(0);
}
}
