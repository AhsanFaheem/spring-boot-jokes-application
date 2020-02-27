package com.jokesapp.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokesServiceFromNorris implements JokesService {
	private final ChuckNorrisQuotes chuckNorrisQuotes;
	

	public JokesServiceFromNorris(ChuckNorrisQuotes chuckNorrisQuotes) {
		super();
		this.chuckNorrisQuotes = chuckNorrisQuotes;
	}


	@Override
	public String obtainJoke() {
		return chuckNorrisQuotes.getRandomQuote();
	}

}
