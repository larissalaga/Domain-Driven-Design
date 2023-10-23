package br.com.fiap.beans;

public class Juridica extends Pessoa{
	private String cnpj;

	public Juridica() {
		super();
	}

	public Juridica(String cnpj) {
		super();
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String identifiador() {
		return "Juridica";
	}

	public Juridica(String nome, String email, String cnpj) {
		super(nome, email);
		this.cnpj = cnpj;
	}

}
