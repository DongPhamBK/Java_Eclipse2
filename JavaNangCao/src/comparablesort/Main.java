package comparablesort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Person> h = new ArrayList<Person>();
		h.add(new Person(1, "A"));// tạo kép
		h.add(new Person(4, "f"));
		h.add(new Person(2, "aa"));
		h.add(new Person(7, "d"));

		for (Person i : h) {
			System.out.println(i.getId());
		}
		System.out.println("Sort");
		Collections.sort(h);
		for (Person i : h) {
			System.out.println(i.getId() + " " + i.getName());
		}
	}
}
