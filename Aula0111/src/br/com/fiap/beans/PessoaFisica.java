package br.com.fiap.beans;

public class PessoaFisica extends Pessoa{
	private String cpf;
	//construtor vazio
	public PessoaFisica() {
		super();
	}
	
	//construtor cheio
	public PessoaFisica(String nome, String email, String cpf) {
		super(nome, email);
		this.cpf = cpf;
	}
	
	//getters e setters
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	//
	@Override
	public String identificador() {
		return "Pessoa Física";
	}
	
	

}
