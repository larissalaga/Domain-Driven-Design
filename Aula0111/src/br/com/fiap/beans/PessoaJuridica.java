package br.com.fiap.beans;

public class PessoaJuridica extends Pessoa {
	private String cnpj;

	//construtor vazio
		public PessoaJuridica() {
		super();
	}
		
	// construtor cheio
	public PessoaJuridica(String nome, String email, String cnpj) {
			super(nome, email);
			this.cnpj = cnpj;
	}
	
	//getters e setters
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	@Override
	public String identificador() {
		return "Pessoa Jurídica";
	}
	
	

}
