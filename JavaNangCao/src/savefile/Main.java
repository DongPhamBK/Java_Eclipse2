package savefile;

import java.io.*;

//import seri.Person;

public class Main {
public static void main(String[] args) throws IOException, ClassNotFoundException {
	Person p = new Person(1, "A");
	File f = new File("test.txt");
	
	if(!f.exists()){
		f.createNewFile();
		 
	}
	FileOutputStream fb = new FileOutputStream(f);
	ObjectOutputStream ob = new ObjectOutputStream(fb);
	
	ob.writeObject(p);// muốn ghi cần có implement
	ob.close();
	fb.close();
	 
	System.out.println("luu thanh cong !!!");
	//-------------------đọc lại...................//
	
	FileInputStream fot = new FileInputStream(f);
	ObjectInputStream oos = new ObjectInputStream(fot);
	Person p1 = (Person) oos.readObject();
	
	System.out.println(p1.getId()+" / "+ p1.getTen());// ra 0, vì đã chống lưu file 
}
}
