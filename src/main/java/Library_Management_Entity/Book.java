package Library_Management_Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book {
	@Id
	private int id;
	private String Book_Name;
	private String Book_Author;
	private long Book_Price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBook_Name() {
		return Book_Name;
	}
	public void setBook_Name(String book_Name) {
		Book_Name = book_Name;
	}
	public String getBook_Author() {
		return Book_Author;
	}
	public void setBook_Author(String book_Author) {
		Book_Author = book_Author;
	}
	public long getBook_Price() {
		return Book_Price;
	}
	public void setBook_Price(long book_Price) {
		Book_Price = book_Price;
	}
	

}
