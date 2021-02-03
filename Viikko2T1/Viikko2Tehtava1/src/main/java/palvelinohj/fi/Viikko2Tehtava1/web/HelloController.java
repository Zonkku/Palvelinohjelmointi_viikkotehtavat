package palvelinohj.fi.Viikko2Tehtava1.web;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller

public class HelloController {
	
		
	@GetMapping("/hello")
	public String returnGreetingForName(@RequestParam(name="name") String name, Model model, @RequestParam(name="age") int age) {
		model.addAttribute("name", name);
		model.addAttribute("age", age);
				return "hello";
	}


}
