package coperatorsort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import comparablesort.Person;

public class Main {
	public static void main(String[] args) {
		List<Person> h = new ArrayList<Person>();
		h.add(new Person(1, "Afzfv"));// tạo kép
		h.add(new Person(4, "fhh"));
		h.add(new Person(2, "aa"));
		h.add(new Person(7, "dZC"));

		for (Person i : h) {
			System.out.println(i.getId());
		}
		System.out.println("So sort");

		Collections.sort(h, new Comparator<Person>() {
			
			@Override
			public int compare(Person o1, Person o2) {
				if (o2.getId() < o1.getId()) {
					return 1;
				} else if (o2.getId() > o1.getId()) {
					return -1;
				} else {
					return 0;
				}
			}

		});
		
		for (Person i : h) {
			System.out.println(i.getId() + " " + i.getName());
		}
	}
}
