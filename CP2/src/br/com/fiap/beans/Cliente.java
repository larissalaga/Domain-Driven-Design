package br.com.fiap.beans;

public class Cliente {
	// visibilidade, tipo, nome
	private String nome;
	private Endereco endereco;
	private String cpf;
	private String rg;
	
	// construtor cheio
	public Cliente(String nome, String cpf, String rg) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
	}
	//construtor vazio
		public Cliente() {
			super();
		}
	//getters e setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	
}
