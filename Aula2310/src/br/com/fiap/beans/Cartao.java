package br.com.fiap.beans;

public class Cartao {
	private String nome;
	private String bandeira;
	private String banco;
	private int numero;
	private int cvv;
	protected double saldo;
	private double compra;
	//Construtor vazio
	public Cartao() {
		super();
	}
	//Construtor cheio
	public Cartao(String nome, String bandeira, String banco, int numero, int cvv, double saldo, double compra) {
		super();
		this.nome = nome;
		this.bandeira = bandeira;
		this.banco = banco;
		this.numero = numero;
		this.cvv = cvv;
		this.saldo = saldo;
		this.compra = compra;
	}
	//Getters e Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getBandeira() {
		return bandeira;
	}
	public void setBandeira(String bandeira) {
		this.bandeira = bandeira;
	}
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getCompra() {
		return compra;
	}
	public void setCompra(double compra) {
		this.compra = compra;
	}
	public String status() {
		return "Verificar limite";
	}
	

}
