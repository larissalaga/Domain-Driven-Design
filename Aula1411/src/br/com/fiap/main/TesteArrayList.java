package br.com.fiap.main;

import java.util.ArrayList;
import java.util.List;

import br.com.br.beans.Aluno;

public class TesteArrayList {

	public static void main(String[] args) {
		Aluno alunoUm = new Aluno("Rafael", 11, 3724);
		Aluno alunoDois = new Aluno("Karina", 16, 3546);
		Aluno alunoTres = new Aluno("Leonardo", 17, 1521);
		Aluno alunoQuatro = new Aluno("Carlos", 65, 2654);

		// Nome do arrylist
		List<Aluno> alunos = new ArrayList<Aluno>();
		alunos.add(alunoUm);
		alunos.add(alunoDois);
		alunos.add(alunoTres);
		alunos.add(alunoQuatro);

		for (Aluno aluno : alunos) {
			System.out.println("Nome: " + aluno.getNome() + " " + "Idade: " + aluno.getIdade() + " " + "RM: "
					+ aluno.getRm() + "\n");
		}

	}

}
