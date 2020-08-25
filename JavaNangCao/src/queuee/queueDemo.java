package queuee;

import java.util.LinkedList;
import java.util.Queue;

public class queueDemo {
	public static void main(String[] args) {
		Queue<String> q = new LinkedList<String>();

		q.add("a");
		q.add("z");
		q.add("f");
		q.add("b");
		q.add("a");
		
		// hàng đợi như list
		for(String i:q){
			System.out.println(i);
		}
		
		System.out.println("//////////////");
		q.remove("f");
		for(String i:q){
			System.out.println(i);
		}
		
	}
}
