package com.ricardo.desafio.entidades.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ricardo.desafio.entidades.Setor;

@Service
public class SetorService {

	static final String URL_API_SETOR = "/setor";
	RestTemplate restTemplate = new RestTemplate();
	
	public Setor[] getSetor() {
		Setor[] setor = restTemplate.getForObject(URL_API_SETOR, Setor[].class);
		return setor;
	}
}
