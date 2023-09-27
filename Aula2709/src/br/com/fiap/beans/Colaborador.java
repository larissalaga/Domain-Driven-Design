package br.com.fiap.beans;

public class Colaborador {
	
	// visibilidade, tipo, nome 
	private String nome;
	private int idade;
	private double qtdadeHoras;
	private double valorHora;
	private Endereco endereco;
	
	//Setters e Getters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getQtdadeHoras() {
		return qtdadeHoras;
	}
	public void setQtdadeHoras(double qtdadeHoras) {
		this.qtdadeHoras = qtdadeHoras;
	}
	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	

	
}
