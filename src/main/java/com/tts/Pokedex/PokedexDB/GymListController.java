package com.tts.Pokedex.PokedexDB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GymListController {

	@Autowired
	private GymList gymList;
	
	@GetMapping(value="/")
	public String index(GymList gymList) {
		return "index";
	}
}
