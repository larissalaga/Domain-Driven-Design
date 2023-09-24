package br.com.fiap.beans;

public class Cliente {
	
	//visibilidade, tipode dados e variável
	private String nome;
	private int idade;
	private double valor;
	
	
	//Setters (Entrada)
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;		
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	//Getters (Saida)
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public double getValor() {
		return valor;
	}

}
