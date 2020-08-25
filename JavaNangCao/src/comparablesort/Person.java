package comparablesort;

public class Person implements Comparable<Person> {
	private int id;
	private String name;

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Person o) {
		if (this.getId() < o.getId()) {
			return 1;
		} else if (this.getId() > o.getId()) {
			return -1;
		} else {
			return 0;
		}
	}
}
