package Library_Management_Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Librarian {
	@Id
	private int id;
	private String Librarian_Name;
	private String Librarian_Email;
	private long Password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLibrarian_Name() {
		return Librarian_Name;
	}
	public void setLibrarian_Name(String librarian_Name) {
		Librarian_Name = librarian_Name;
	}
	public String getLibrarian_Email() {
		return Librarian_Email;
	}
	public void setLibrarian_Email(String librarian_Email) {
		Librarian_Email = librarian_Email;
	}
	public long getPassword() {
		return Password;
	}
	public void setPassword(long password) {
		Password = password;
	}
	
	

}
