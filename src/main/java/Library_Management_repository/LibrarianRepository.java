package Library_Management_repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import Library_Management_Entity.Librarian;
import Library_Management_Entity.Teacher;

public interface LibrarianRepository extends JpaRepository<Librarian, Integer>{
//	@Query(nativeQuery = true,value="select * from Librarian where Librarian_Emila =:Librarian_Emila and Teacher_Password=:Teacher_Password")
//	public Librarian findByEmail(String Librarian_Emila,long Librarian_Password );

}
