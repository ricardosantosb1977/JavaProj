package com.ricardo.desafio.entidades;

public class Pessoa {
	private int codigo;
	private String nome;
	private int idsetor;
	
	public Pessoa() {}
	
	public Pessoa(int codigo, String nome, int idsetor) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.idsetor = idsetor;
	}

	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdsetor() {
		return idsetor;
	}
	
	public void setIdsetor(int idsetor) {
		this.idsetor = idsetor;
	}
}
