package br.com.fiap.beans;

public class Endereco {
	private String logradouto;
	private String cep;
	private int numero;
	private String bairro;
	public Endereco() {
		super();
	}
	public Endereco(String logradouto, String cep, int numero, String bairro) {
		super();
		this.logradouto = logradouto;
		this.cep = cep;
		this.numero = numero;
		this.bairro = bairro;
	}
	public String getLogradouto() {
		return logradouto;
	}
	public void setLogradouto(String logradouto) {
		this.logradouto = logradouto;
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
