package br.com.fiap.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Aluno;

public class TesteArrayDoWhile {
	//String
	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	static double real(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}

	public static void main(String[] args) {
		//Preparar a lista 
		List<Aluno> listaAlunos = new ArrayList<Aluno>();
		//Preparar objeto
		Aluno objAluno;
		//Entrada
		do {
			objAluno = new Aluno();
			objAluno.setRm(inteiro("Informe o número do RM: "));
			objAluno.setNome(texto("Informe o nome do aluno: "));
			objAluno.setTurma(texto("Informe a turma: "));
			objAluno.setNota(real("Informe a nota do aluno: "));
			//adicionando novos alunos no array
			listaAlunos.add(objAluno);
			
		} while (JOptionPane.showConfirmDialog(null, "Deseja continuar? ", "CADASTRO DE ALUNOS", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)==0);
		
		//Saidas
		//foreach para as saidas de arraylist
		for (Aluno a : listaAlunos) {
			System.out.println("\n\nRM: " + a.getRm() +
					"\nNome: " + a.getNome() + 
					"\nTurma: " + a.getTurma() + 
					"\nNota: " + a.getNota());
		}

	}

}
