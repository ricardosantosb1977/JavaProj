package com.ricardo.desafio.entidades.resource;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ricardo.desafio.entidades.Pessoa;
import com.ricardo.desafio.entidades.Setor;
import com.ricardo.desafio.entidades.service.PessoaService;

@Controller
public class PessoaResource {

	@Autowired
	PessoaService pessoaService = new PessoaService();
	
	@GetMapping("/listapessoa")
	public String listapessoa(Model model) {
		String variavel = "Ricardo";
		model.addAttribute("teste", variavel);
		return "listapessoa";
	}
	
	@GetMapping("/pessoas")
	public ResponseEntity<ArrayList<Pessoa>> pessoas() {
		Pessoa pessoa1 = new Pessoa(1, "Ricardo", 1);
		Pessoa pessoa2 = new Pessoa(1, "Luciana", 1);
		
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		
		return ResponseEntity.ok().body(pessoas);
	}
	
	@GetMapping("/cadastrapessoa")
	public String cadastrapessoa(Model model) {
		return "cadastrapessoa";
	}
	
	@PostMapping(value="salvarPessoa")
	public String save(@RequestParam("nome") String nome, @RequestParam("setor") String setor, Model model){
	   Pessoa pessoa = new Pessoa(1, nome, 1);
	   pessoaService.salvar(pessoa);
	   //Pessoa[] pessoas = pessoaService.getPessoas();
	   //model.addAttribute("pessoa", pessoas);
	   return "listapessoa";
	}
	
}
