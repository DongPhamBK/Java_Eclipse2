package mapmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import comparablesort.Person;

public class Demo {
	public static void main(String[] args) {
		Map<Integer, String> m = new HashMap<Integer, String>();// lưu ý là
																// Interger
		m.put(1, "a");
		m.put(2, "s");// key là duy nhất, nếu không sẽ bị ghi đè
		m.put(3, "ss");// chứ ko phải add
		m.put(4, "qw");
		m.put(null, "null");

		// láy dữ liệu, dùng set thôi, vì key là duy nhất mà
		m.remove(null);
		Set<Integer> s = m.keySet();
		for (Integer i : s) {
			System.out.println(i + " " + m.get(i));
		}

		// lấy ra hết luôn nè
		for (Entry<Integer, String> o : m.entrySet()) {
			System.out.println(o.getKey() + " " + o.getValue());
		}
		
		// nâng cao !
		Map<String, Person> ok = new HashMap<String, Person>();
		ok.put("n1", new Person(1, "A"));// dị nha !!!
	}
}
