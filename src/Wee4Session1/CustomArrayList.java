package Wee4Session1;

/*

Create a Book class with bookId, bookName and authorName.Create parameterized constructor to initialize the object. Create an ArrayList of type Book and store all book objects into collections and display all book details.

 */



import java.util.ArrayList;

class Book
{
	private int bookId;
	private String bookName;
	private String authorName;
	public Book(int bookId, String bookName, String authorName) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.authorName = authorName;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", authorName=" + authorName + "]";
	}
}
public class CustomArrayList {
	public static void main(String[] args)
	{

		ArrayList<Book> books=new ArrayList<Book>();
		books.add(new Book(101, "let us c", "Yashavant P Kanetkar"));
		books.add(new Book(102, "head first java ", "Kathy Sierra"));

		System.out.println("--All Books--");
		for(Book b:books)
		{
			System.out.println(b);
		}
	}
}
