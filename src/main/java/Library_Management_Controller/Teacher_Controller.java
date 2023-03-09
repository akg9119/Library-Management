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

import Library_Management_Entity.Student;
import Library_Management_Entity.Teacher;
import Library_Management_repository.TeacherRepository;

@RestController
public class Teacher_Controller {
	@Autowired
	TeacherRepository TR;
	
	@PostMapping("/SaveTeacher")
	public String SaveTeacher(@RequestBody Teacher T) {
		TR.save(T);
		return "successful";
	}
	@GetMapping("/getTeacher")
	public Teacher getTeacher(@RequestParam int id) {
		Optional<Teacher> T=TR.findById(id);
		return T.get();
	}
	@PutMapping("/updateTeacher")
	public String updateTeacher(@RequestBody Teacher  T) {
		TR.save(T);
		return "successful";
	}
	@DeleteMapping("/deleteTeacher")
	public String deleteTeacher(@RequestParam int  id) {
		TR.deleteById(id);
		return "successful";
	}
//	@GetMapping("/getTeacher")	
//	public Teacher getTeacher(@RequestBody Teacher T) {
//		
//		return TR.findByEmail(T.getTeacher_Email(), T.getPassword());
//	}
	

}
