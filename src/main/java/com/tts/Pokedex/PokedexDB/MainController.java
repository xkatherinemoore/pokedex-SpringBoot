package com.tts.Pokedex.PokedexDB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping(value="/")
	public String index() {
		return "index.html";
	}
	
	private User user;
	
	@PostMapping(value="/")
	public String addNewUser(User user, Model model) {
		userRepository.save(new User(user.getFirstName(), user.getLastName(), user.getEmail(), user.getUsername()));
		model.addAttribute("", user.getFirstName());
		return "index";
	}
}
