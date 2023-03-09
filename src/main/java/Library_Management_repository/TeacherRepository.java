package Library_Management_repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import Library_Management_Entity.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Integer> {
	@Query(nativeQuery = true,value="select * from Teacher where Teacher_Emila =:Teacher_Emila and Teacher_Password=:Teacher_Password")
	public Teacher findByEmail(String Teacher_Emila,long Teacher_Password );


}
