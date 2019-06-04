package generics;

import java.util.HashMap;

public class HashMapWithOutGenerics {
	public static void main(String args[]) {
		 HashMap hm = new HashMap<>();
			hm.put("a", "apple");
			hm.put("b", "ball");
			hm.put("c", "cat");
			hm.put("d", "dog");
			hm.put("a", "allow");
			hm.put("null", "dog");
			hm.put("null", "test");
			System.out.println(hm);
	 }

	 }

