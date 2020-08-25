package list;

import java.util.ArrayList;
import java.util.List;

public class Main {
public static void main(String[] args) {
	Person a1 = new Person(1);
	Person a2 = new Person(2);

	Person a3 = new Person(3);
	
	List<Person> lis = new ArrayList<Person>();// list là interface nên dùng implement
	
	lis.add(a1);
	lis.add(a2);// vào list
	lis.add(a3);
	lis.add(a3);
	
	Person p = lis.get(0);// phần tử số 0
	
	System.out.println("Phần tử "+ p.getId());// chú ý lấy ra nha !!!

	// vòng lặp đi
	
	// cú pháp : kiểu dữ liệu phần tử : mảng
	for(Person i : lis){
		System.out.println(i.getId());
	}
	
	// xoá phần tử
		lis.remove(3);
		lis.remove(a3);// cách khác
		//xem lại
	for(int i = 0;i<lis.size();i++){
		System.out.println(lis.get(i).getId());// khá công kềnh
	}
	
	
	
}
}
