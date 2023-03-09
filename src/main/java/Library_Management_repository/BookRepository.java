package Library_Management_repository;


import org.springframework.data.jpa.repository.JpaRepository;
import Library_Management_Entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {
	

}
