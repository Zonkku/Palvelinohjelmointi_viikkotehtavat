package palvelinohj.fi.Viikko2Tehtava2.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import palvelinohj.fi.Viikko2Tehtava2.domain.Student;


@Controller
public class StudentController {
	
	@GetMapping("/hello")
	
	public String showStudents(Model model) {
		ArrayList<Student> studentList = new ArrayList<>();
		studentList.add(new Student("Ville", "Vallaton"));
		studentList.add(new Student("Peppi", "Pitkätossu"));
		studentList.add(new Student("Prinsessa", "Diana"));
		System.out.println(studentList);
		
		model.addAttribute("studentlist", studentList);
		
		return "studentlist";
	
	}
	
	
	
}
