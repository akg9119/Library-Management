package Library_Management_Controller;

import Library_Management_Entity.Book;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Library_Management_repository.BookRepository;


@RestController
public class Book_Controller {
	@Autowired
	BookRepository BR;
	
	@PostMapping("/SaveBook")
	public String SaveBook(@RequestBody Book B) {
		BR.save(B);
		return "successful";
	}
	@GetMapping("/getBook")
	public Book getBook(@RequestBody int id) {
		Optional<Book> B=BR.findById(id);
		return B.get();
	}
	@PutMapping("/updateBook")
	public String updateBook(@RequestBody Book B) {
		BR.save(B);
		return "successful";
	}
	@DeleteMapping("/deleteBook")
	public String deleteBook(@RequestParam int  id) {
		BR.deleteById(id);
		return "successful";
	}
	
	
	

}
