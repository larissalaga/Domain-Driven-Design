package br.com.fiap.main;

import br.com.br.beans.Aluno;

public class Teste {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		aluno.setNome("Larissa");
		aluno.setRm(1235);
		aluno.setIdade(31);
		// Instanciando um aluno com o construtor cheio
		Aluno alunoDois = new Aluno("Karina", 1233, 35);

	}

}
