package br.com.fiap.beans;

public class Cliente {
	private String nome;
	private String cpf;
	private int conta;
	private double deposito;
	private String email;
	private double saldo;
	//construtor vazio
	public Cliente() {
		super();
	}
	//construtor cheio
	public Cliente(String nome, String cpf, int conta, String email, double saldo, double deposito) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.conta = conta;
		this.email = email;
		this.saldo = saldo;
		this.deposito = deposito;
	}
	//getters e setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getConta() {
		return conta;
	}
	public void setConta(int conta) {
		this.conta = conta;
	}
	public double getDeposito() {
		return deposito;
	}
	public void setDeposito(double deposito) {
		this.deposito = deposito;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	//metodo worker
	public double atualizacaoSaldo() {
		return saldo += deposito;
	}
	
}
