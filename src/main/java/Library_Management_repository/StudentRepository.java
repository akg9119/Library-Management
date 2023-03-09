package Library_Management_repository;

import java.awt.print.Book;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import Library_Management_Entity.Librarian;
import Library_Management_Entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	@Query(nativeQuery = true,value="select * from Student where Student_Emila =:Student_Emila and Student_Password=:Student_Password")
	public Student findByEmail(String Student_Emila,long Student_Password );


}
