package Library_Management_Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	private int id;
	private String Student_Name;
	private String Student_Email;
	private long Student_PhoneNo;
	private String Student_Branch;
	private long Password;
	
	
	
	public long getPassword() {
		return Password;
	}
	public void setPassword(long password) {
		Password = password;
	}
	public String getStudent_Branch() {
		return Student_Branch;
	}
	public void setStudent_Branch(String student_Branch) {
		Student_Branch = student_Branch;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudent_Name() {
		return Student_Name;
	}
	public void setStudent_Name(String student_Name) {
		Student_Name = student_Name;
	}
	public String getStudent_Email() {
		return Student_Email;
	}
	public void setStudent_Email(String student_Email) {
		Student_Email = student_Email;
	}
	public long getStudent_PhoneNo() {
		return Student_PhoneNo;
	}
	public void setStudent_PhoneNo(long student_PhoneNo) {
		Student_PhoneNo = student_PhoneNo;
	}
	
	

}
