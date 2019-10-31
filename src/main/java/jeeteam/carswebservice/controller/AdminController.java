package jeeteam.carswebservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admins")
public class AdminController {
	
	@RequestMapping("/adminPanel")
	public String showAdmin() {
		return "admins";
	}

}
