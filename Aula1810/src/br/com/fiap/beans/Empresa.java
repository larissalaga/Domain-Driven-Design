package br.com.fiap.beans;

public class Empresa {
	private String razaoSocial;
	private String segmento;
	private String email;
	private int unidade;
	private Endereco endereco;
	private Produto produto;
	//Metodo construtor vazio
	public Empresa() {
		super();
	}
	//Metodo construtor cheio	
	public Empresa(String razaoSocial, String segmento, String email, int unidade) {
		super();
		this.razaoSocial = razaoSocial;
		this.segmento = segmento;
		this.email = email;
		this.unidade = unidade;
	}
	//getters e setters
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getSegmento() {
		return segmento;
	}
	public void setSegmento(String segmento) {
		this.segmento = segmento;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getUnidade() {
		return unidade;
	}
	public void setUnidade(int unidade) {
		this.unidade = unidade;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}

}
