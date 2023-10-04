package br.com.fiap.beans;

import javax.swing.JOptionPane;

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
	
	//metodo ger com mais de um atributo
	public String getNomeIdade() {
				
		return "Nome: " + nome + "\nIdade: " + idade;
	}
	// metodos worker
	public double calcularSalario() {
		return valorHora * 	qtdadeHoras;
	}
	
	// if else
	public String pagarTaxa() {
		String informacao = null;
		
		if (calcularSalario() > 15200.55){
			informacao = "Paga taxa";
		} else {
			informacao = "Não paga taxa";
		}
		
		return informacao;
	}
	
	

	
}
