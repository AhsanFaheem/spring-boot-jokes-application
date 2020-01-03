package com.jokesapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jokesapp.services.JokesService;

@Controller
public class JokesController {

	JokesService JokesService;

	@RequestMapping(value = "/")
	public String index(Model model) {

		model.addAttribute("joke", JokesService.obtainJoke());
		return "chucknorris";
	}

	@Autowired
	public JokesController(JokesService jokesService) {
		super();
		JokesService = jokesService;
	}

}
