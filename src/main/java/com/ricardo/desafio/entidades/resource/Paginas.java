package com.ricardo.desafio.entidades.resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/")
public class Paginas {

	@RequestMapping(method = RequestMethod.GET)
	public String index() {
		return "index";
	}
}
