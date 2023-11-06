package br.com.fiap.beans;

public class Endereco {
	private String logradouro;
//contrutor vazio
	public Endereco() {
		super();
	}
//construtor cheio
	public Endereco(String logradouro) {
		super();
		this.logradouro = logradouro;
	}

	public String getLogradouro() {
		return logradouro;
	}
//getters e setters
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

}
