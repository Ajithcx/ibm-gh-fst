package fst;



import java.util.ArrayList;

public class Activity9 {
	
	public static void main(String[] args) {
		
		ArrayList<String> myList = new ArrayList();
		myList.add("NameA");
		myList.add("NameB");
		myList.add("NameC");
		myList.add("NameD");
		myList.add("NameE");
		for(int i = 0; i < myList.size(); i++) {
			System.out.println(myList.get(i));			
		}
		System.out.println("Third Element = " + myList.get(2));
		if (myList.contains("NameC")) {
			System.out.println("NameC is present");
		}
		System.out.println("Size of the ArrayList = " + myList.size());
		myList.remove(0);
		System.out.println("Element in postion 0 removed. New array size = " + myList.size());
	}

}