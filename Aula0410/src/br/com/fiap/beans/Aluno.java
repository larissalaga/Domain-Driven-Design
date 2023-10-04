package br.com.fiap.beans;

public class Aluno {
	private int rm;
	private String nome;
	private String turma;
	private double nota;
	private Endereco endereco;
	// Toda classe beans vai ter: variaveis, metodo construtor vazio, 
	//metodo construtor cheio(sem atributos de referencia, setters e getters
	
	// metodo construtor vazio
	public Aluno() {
		super();
	}
	
	//metodo construtor cheio //Aluno objAluno = new Aluno();
	public Aluno(int rm , String nome, String turma, double nota){
		super();
		this.rm = rm;
		this.nome = nome;
		this.turma = turma;
		this.nota = nota;
	}
	
	
	
	// Setters e Getters
	public int getRm() {
		return rm;
	}	
	public void setRm(int rm) {
		this.rm = rm;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTurma() {
		return turma;
	}
	public void setTurma(String turma) {
		this.turma = turma;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	
	

}
