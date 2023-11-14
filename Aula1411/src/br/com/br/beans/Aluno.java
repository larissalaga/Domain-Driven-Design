package br.com.br.beans;

public class Aluno extends Pessoa {
	private int rm;

	// getters e setters
	// vazio
	public Aluno() {
		super();
	}

	public int getRm() {
		return rm;
	}

	public void setRm(int rm) {
		this.rm = rm;
	}

	// cheio
	public Aluno(String nome, int idade, int rm) {
		super(nome, idade);
		this.rm = rm;
	}

}
