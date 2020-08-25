package seri;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Person implements Serializable {
 
	/**
	 * 1L giống phiên bản đối tượng
	 * xem file demo đã lưu đối tượng !
	 */
	private static final long serialVersionUID = 1L;
	private int id;

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
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Person p = new Person(1);
		File f = new File("demo.txt");
		if(!f.exists()){
			f.createNewFile();
			 
		}
		FileOutputStream fb = new FileOutputStream(f);
		ObjectOutputStream ob = new ObjectOutputStream(fb);
		
		ob.writeObject(p);// muốn ghi cần có implement
		ob.close();
		fb.close();
		 
		//-------------------đọc lại...................//
		
		FileInputStream fot = new FileInputStream(f);
		ObjectInputStream oos = new ObjectInputStream(fot);
		Person p1 = (Person) oos.readObject();
		
		System.out.println(p1.getId());
		
	}
}
