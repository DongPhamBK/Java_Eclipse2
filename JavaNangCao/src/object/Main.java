package object;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person n1 = new Person(1, "A");
		Person n2 = new Person(1, "A");

		
		System.out.println(n1.equals(n2));// cũng không bằng nhau vì equals cùng dùng this
		System.out.println(n1 == n2);// không bằng nhau vì 2 đối tượng khác nhau
		
	}

}
