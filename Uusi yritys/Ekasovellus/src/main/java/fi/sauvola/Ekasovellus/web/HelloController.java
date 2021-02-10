package fi.sauvola.Ekasovellus.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@ResponseBody
public class HelloController {
	
		
	@RequestMapping("/hello")
	public String returnGreetingForName(@RequestParam(name="firstname", required=false, defaultValue="Pasila") String name, @RequestParam(name="age") int ika) {
	return "Hello " + name + ", " + ika + " years old!";
}



}
