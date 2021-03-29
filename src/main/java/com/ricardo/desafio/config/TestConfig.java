package com.ricardo.desafio.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.ricardo.desafio.entidades.repositorio.SetorRepositorio;

@Configuration
@Profile("test")
public class TestConfig {

	//@Autowired
	//private SetorRepositorio setorRepositorio;
}
