package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Aluno;

public class TesteVetorDo {
		//String
		static String texto(String j) {
			return JOptionPane.showInputDialog(j);
		}
		//Int
		static int inteiro(String j) {
			return Integer.parseInt(JOptionPane.showInputDialog(j));
		}
		//Double
		static double real(String j) {
			return Double.parseDouble(JOptionPane.showInputDialog(j));
		}


	public static void main(String[] args) {
		// Preparar o vetor e o limite de posiçoes
		Aluno[] vetorAluno = new Aluno[2];
		// Preparar índice
		int indice =0;
		//Entrada
		do {
			vetorAluno[indice] = new Aluno();
			vetorAluno[indice].setRm(inteiro("Informe o RM do aluno: "));
			vetorAluno[indice].setNome(texto("Informe o nome do aluno: "));
			vetorAluno[indice].setTurma(texto("Informe a turma: "));
			vetorAluno[indice].setNota(real("Informe a nota do aluno: "));
			
			indice ++;
			
			
		} while(JOptionPane.showConfirmDialog(null, "Deseja continuar? ", "CADASTRO DE ALUNOS", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)==0);
		
		//Saida
		//Para saida dos vetores utilizamod o for
		for(int contador = 0; contador < indice; contador ++) {
			System.out.println("\n\nRM: " + vetorAluno[contador].getRm() +
					"\nNome: " + vetorAluno[contador].getNome() + 
					"\nTurma: " + vetorAluno[contador].getTurma() + 
					"\nNota: " + vetorAluno[contador].getNota());
		}
	}

}
