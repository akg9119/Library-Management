package Library_Management_Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Teacher {
	@Id
	private int id;
	private String Teacher_Name;
	private String Teacher_Email;
	private long Teacher_PhoneNo;
	private String Subject;
	private long Password;
	
	public long getPassword() {
		return Password;
	}
	public void setPassword(long password) {
		Password = password;
	}
	public void setTeacher_Name(String teacher_Name) {
		Teacher_Name = teacher_Name;
	}
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTeacher_Name() {
		return Teacher_Name;
	}
	public void setTeacher_name(String teacher_Name) {
		Teacher_Name = teacher_Name;
	}
	public String getTeacher_Email() {
		return Teacher_Email;
	}
	public void setTeacher_Email(String teacher_Email) {
		Teacher_Email = teacher_Email;
	}
	public long getTeacher_PhoneNo() {
		return Teacher_PhoneNo;
	}
	public void setTeacher_PhoneNo(long teacher_PhoneNo) {
		Teacher_PhoneNo = teacher_PhoneNo;
	}
	public String getSubject() {
		return Subject;
	}
	public void setSubject(String subject) {
		Subject = subject;
	}
	
}
