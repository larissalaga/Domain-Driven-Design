package br.com.fiap.beans;

public class Colaborador {

	private String nome;
	private String cargo;
	private double valorHora;
	private double qtdHora;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public double getQtdHora() {
		return qtdHora;
	}

	public void setQtdHora(double qtdHora) {
		this.qtdHora = qtdHora;
	}

	// get com mais de um atributo
	public String getTudo() {
		return "\nNome: " + nome + "\nCargo: " + cargo + "\nValor da Hora: " + valorHora + "\nQuantidade de Horas: "
				+ qtdHora;
	}

	// método worker
	public double calcularSalario() {
		return valorHora * qtdHora;
	}

	// if else
	public String pagarTaxa() {
		if(calcularSalario() > 17500.55) {
			return "Pagar Taxa";
		}else {
			return "Não Paga Taxa";
		}
	}
}
