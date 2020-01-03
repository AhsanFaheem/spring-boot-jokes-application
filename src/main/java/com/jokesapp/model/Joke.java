package com.jokesapp.model;

import org.springframework.web.bind.annotation.RequestMapping;

public class Joke {

	String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	

}
