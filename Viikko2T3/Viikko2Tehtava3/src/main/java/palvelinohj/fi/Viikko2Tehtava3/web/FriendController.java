package palvelinohj.fi.Viikko2Tehtava3.web;

import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import palvelinohj.fi.Viikko2Tehtava3.domain.Friend;

@Controller
public class FriendController {

	ArrayList<String> friendlist = new ArrayList<>();

	@RequestMapping("/index")
	public String addFriends(@RequestParam(name="name", required=false) String name, Model model) {
		
		friendlist.add(name);
		
		model.addAttribute("friend", friendlist);
		
		return "nameForm";
	}
	
	


	
}
