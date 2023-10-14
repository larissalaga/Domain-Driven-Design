package br.com.fiap.beans;

public class Endereco {
	//variaveis
	private String logradouro;
	private String cep;
	private int numero;
	private String bairro;
	//construtor vazio
	public Endereco() {
		super();
	}
	//construtor cheio
	public Endereco(String logradouro, String cep, int numero, String bairro) {
		super();
		this.logradouro = logradouro;
		this.cep = cep;
		this.numero = numero;
		this.bairro = bairro;
	}	
	//getters e setters
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	




}