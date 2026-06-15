package fst;


import java.util.HashMap;
import java.util.Map;

public class Activity11 {

	public static void main(String[] args) {
		
		Map<Integer, String> colors = new HashMap<>();
		colors.put(1,"Blue");
		colors.put(2,"Red");
		colors.put(3,"Yellow");
		colors.put(4,"Green");
		colors.put(5,"Purple");
		
		System.out.println("Colors - " + colors);
		
		colors.remove(1);
		
		System.out.println("Colors with key 1 removed");
		
		System.out.println("Colors - " + colors);

		if (colors.containsValue("Green")) {
			System.out.println("Green is present");
		}
		else {
			System.out.println("Green is not present");
		}
		System.out.println("Size of the Map = " + colors.size());
	}

}