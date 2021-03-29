package com.ricardo.desafio.entidades.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ricardo.desafio.entidades.Setor;
import com.ricardo.desafio.entidades.service.SetorService;

@RestController
@RequestMapping(value = "/setor")
public class SetorResource {
	
	private SetorService setorService; 
	
	@GetMapping
	public ResponseEntity<Setor> listaSetor(){
		Setor setor = new Setor(1, "Adm");
		
		return ResponseEntity.ok().body(setor);
	}
	
	@GetMapping("/listasetor")
	public String listaSetores(Model model) {
		//Setor[] setor = setorService.getSetor();
		//model.addAttribute("setor", setor);
		return "listasetor";
	}
	
}
