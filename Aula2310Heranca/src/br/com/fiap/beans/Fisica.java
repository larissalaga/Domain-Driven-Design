package br.com.fiap.beans;

public class Fisica extends Pessoa {
	private String cpf;

	public Fisica() {
		super();
	}

	public Fisica(String cpf) {
		super();
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public Fisica(String nome, String email, String cpf) {
		super(nome, email);
		this.cpf = cpf;
	}

	public String identifiador() {
		return "Fisica";
	}
	

}
