package Library_Management_Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Library_Management_Entity.Book;
import Library_Management_Entity.Librarian;
import Library_Management_Entity.Student;
import Library_Management_repository.BookRepository;
import Library_Management_repository.StudentRepository;


@RestController
public class Student_Controller {
	@Autowired
	StudentRepository SR;
	@Autowired
	BookRepository br;
	
	
	@PostMapping("/SaveStudent")
	public Student SaveStudent(@RequestBody Student S) {
		SR.save(S);
		return S;
	}
	@GetMapping("/getStudent")
	public Student getStudent(@RequestBody int id) {
		Optional<Student> S=SR.findById(id);
		return S.get();
	}
	@GetMapping("/alldata")
	public List alldata() {
		return SR.findAll();

	}
	@PutMapping("/updateStudent")
	public String updateStudent(@RequestBody Student  S) {
		SR.save(S);
		return "successful";
	}
	@DeleteMapping("/deleteStudent")
	public String deleteStudent(@RequestParam int  id) {
		SR.deleteById(id);
		return "successful";
	}
	
	@GetMapping("/getBook")
	public List<Book> getBook() {
		
		return br.findAll();
	}
//	@GetMapping("/getStudent")	
//	public Student getStudent(@RequestBody Student S) {
//		
//		return SR.findByEmail(S.getStudent_Email(), S.getPassword());
//	}
	


}
