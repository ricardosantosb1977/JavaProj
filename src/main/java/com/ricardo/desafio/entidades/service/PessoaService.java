package com.ricardo.desafio.entidades.service;

import org.springframework.http.HttpEntity;
import org.springframework.web.client.RestTemplate;

import com.ricardo.desafio.entidades.Pessoa;

public class PessoaService {
	
	static final String URL_API_PESSOA = "/pessoas";

    RestTemplate restTemplante = new RestTemplate();

    public Pessoa[] getPessoa(){
       Pessoa[] pessoaResult = restTemplante.getForObject(URL_API_PESSOA, Pessoa[].class);
       return pessoaResult;
    }

    public void salvar(Pessoa pessoa){
       HttpEntity<Pessoa> requestPessoa = new HttpEntity<Pessoa>(pessoa);
       pessoa = restTemplante.postForObject(URL_API_PESSOA, requestPessoa, Pessoa.class);
    }
	
}
