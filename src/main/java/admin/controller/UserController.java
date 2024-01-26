package admin.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import admin.entities.CustomUserDetails;

@Controller
@RequestMapping("/user")
public class UserController {
	@RequestMapping("/user")
	public String userPage(Model model) {
		return "user";
	}
	@RequestMapping("/profile")
	public String profile(Model model) {

		CustomUserDetails user =  (CustomUserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		model.addAttribute("user", user);
		return "profile";
	}

	// ...
}