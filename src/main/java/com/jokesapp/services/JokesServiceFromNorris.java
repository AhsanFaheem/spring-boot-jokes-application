package com.jokesapp.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokesServiceFromNorris implements JokesService {
	private final ChuckNorrisQuotes chuckNorrisQuotes;
	
	public JokesServiceFromNorris() {
		this.chuckNorrisQuotes = new ChuckNorrisQuotes();
	}
	@Override
	public String obtainJoke() {
		return chuckNorrisQuotes.getRandomQuote();
	}

}
