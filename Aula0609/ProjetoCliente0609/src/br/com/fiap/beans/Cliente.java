package br.com.fiap.beans;

public class Cliente {	
	//Visibilidade,tipo de dado e variável
	private String nome;
	private String email;
	private int idade;
	private double valorMensalidade;
	private Endereco endereco;
	
	//Getters and Setters
	public String getNome() {
		return nome;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getValorMensalidade() {
		return valorMensalidade;
	}
	public void setValorMensalidade(double valorMensalidade) {
		this.valorMensalidade = valorMensalidade;
	}
	
	
	
	
}
