package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Aluno;
import br.com.fiap.beans.Colaborador;
import br.com.fiap.beans.Endereco;

public class TesteSistema {

	public static void main(String[] args) {
		//instanciar objetos
		
		//int rm , String nome, String turma, double nota
		Aluno objAluno = new Aluno(
				Integer.parseInt(JOptionPane.showInputDialog("Digite o rm do aluno: ")),
				JOptionPane.showInputDialog("Digite o nome: "),
				JOptionPane.showInputDialog("Digite a turma: "),
				Double.parseDouble(JOptionPane.showInputDialog("Digite a nota: "))				
				);
		
		
		//String logradouro, String cep, int numero
		Endereco objEndereco = new Endereco(
				JOptionPane.showInputDialog("Digite o Logradouro: "),
				JOptionPane.showInputDialog("CEP: "),
				Integer.parseInt(JOptionPane.showInputDialog("Digite o número: "))
				);
		objAluno.setEndereco(objEndereco);
		
		//String nome, String cargo, double salario
		Colaborador objColaborador = new Colaborador(
				JOptionPane.showInputDialog("Digite o nome: "),
				JOptionPane.showInputDialog("Digite o Cargo: "),
				Double.parseDouble(JOptionPane.showInputDialog("Digite o salário: "))
				);
		
		//Saidas
		System.out.println("RM: " + objAluno.getRm() + 
				"\nNome: " + objAluno.getNome() +
				"\nTurma: " + objAluno.getTurma() + 
				"\nNota: " + objAluno.getNota() + 
				"\nLogradouro: " + objAluno.getEndereco().getLogradouro() + 
				"\nCEP: " + objAluno.getEndereco().getCep() + 
				"\nNumero: " + objAluno.getEndereco().getNumero() + 
				"\n\nINFORMAÇÕES DO COLABORADOR" + 
				"\nNome: " + objColaborador.getNome() + 
				"\nCargo: " + objColaborador.getCargo() + 
				"\nSalário: " + objColaborador.getSalario());
		
		
		
		
		
		
		

	}

}
