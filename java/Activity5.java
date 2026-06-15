package fst;



abstract class Book {
	String title;
	
	abstract void setTitle(String Title);
	
	String getTitle() {
		return title;
	}

}

class MyBook extends Book {
	
	public void setTitle(String title) {
		this.title = title;
		}
	
}

public class Activity5 {
	public static void main(String[] args) {
		
		String title = "Computer Science 101";
		Book newBook = new MyBook();
		newBook.setTitle(title);
		System.out.println("New Book = " + newBook.getTitle());
	}
}