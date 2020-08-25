package sett;

public class Person {
	private int id;
	private String name;

	public Person(int id) {
		super();
		this.id = id;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		return (obj instanceof Person) ? ((Person) obj).getId() == this.getId() : false;
	}
	
	@Override
	public int hashCode() {
		return this.id;// trả về id
	}
}