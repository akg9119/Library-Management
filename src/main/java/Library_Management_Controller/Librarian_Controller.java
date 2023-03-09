package Library_Management_Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Library_Management_Entity.Librarian;
import Library_Management_repository.LibrarianRepository;

@RestController
public class Librarian_Controller {
	@Autowired
	LibrarianRepository LR;
	
	@PostMapping("/SaveLibrarian")
	public String SaveLibrarian(@RequestBody Librarian L) {
		LR.save(L);
		return "successful";
	}
	@GetMapping("/getLibrarian")
	public Librarian getLibrarian(@RequestBody int id) {
		Optional<Librarian> L=LR.findById(id);
		return L.get();
	}
	@PutMapping("/updateLibrarian")
	public String updateLibrarian(@RequestBody Librarian L) {
		LR.save(L);
		return "successful";
	}
	@DeleteMapping("/deleteLibrarian")
	public String deleteLibrarian(@RequestParam int  id) {
		LR.deleteById(id);
		return "successful";
	}
//	@GetMapping("/getLibrarian")
//	public Librarian getLibrarian(@RequestBody Librarian L) {
//		
//		return LR.findByEmail(L.getLibrarian_Email(), L.getPassword());
//	}
	

}
