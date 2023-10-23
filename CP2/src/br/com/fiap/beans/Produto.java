package br.com.fiap.beans;

public class Produto {
	private String nomeProduto;
	private String marca;
	private double valor;
	
	//construtor cheio
	public Produto(String nomeProduto, String marca, double valor) {
		super();
		this.nomeProduto = nomeProduto;
		this.marca = marca;
		this.valor = valor;
	}
	//construtor vazio
		public Produto() {
			super();
		}
	//gettes e setters
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	

}
