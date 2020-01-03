package com.jokesapp.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokesServiceFromNorris implements JokesService {
	
	@Override
	public String obtainJoke() {
		ChuckNorrisQuotes chuckNorrisQuotes=new ChuckNorrisQuotes();
		return chuckNorrisQuotes.getRandomQuote();
	}

}
