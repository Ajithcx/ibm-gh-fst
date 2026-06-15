package fst;


import java.util.Set;
import java.util.HashSet;

public class Activity10 {

	public static void main(String[] args) {
		
		Set<Object> hs = new HashSet<>();
		hs.add("Item A");
		hs.add("Item B");
		hs.add("Item C");
		hs.add("Item D");
		hs.add("Item E");
		hs.add("Item F");
		System.out.println(hs);
		
		System.out.println("Size of hs - " + hs.size());
		
		hs.remove("Item A");
		
		try {
			hs.remove("Item Z");
		} catch (Exception e) {
		
			System.out.println("Item not found");
		}
		
		if (hs.contains("Item B")) {
			System.out.println("ItemB is present!!");
		}
		else {
			System.out.println("Item not present!!");
		}
		
		System.out.println(hs);

	}

}
