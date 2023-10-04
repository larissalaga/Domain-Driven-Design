package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Colaborador;
import br.com.fiap.beans.Endereco;

public class TesteSistema {

	public static void main(String[] args) {
		// instanciar
		Colaborador objColaborador = new Colaborador();
		Endereco objEndereco = new Endereco();

		// Entradas
		objColaborador.setNome(JOptionPane.showInputDialog("Digite o nome: "));
		objColaborador.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: ")));
		objColaborador.setValorHora(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da hora trabalhada: ")));
		objColaborador.setQtdadeHoras(Double.parseDouble(JOptionPane.showInputDialog
				("Digite a quantidade de horas trabalhadas: ")));
		objEndereco.setLogradouro(JOptionPane.showInputDialog("Digite a rua: "));
		objEndereco.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite o número: ")));
		objEndereco.setCep(JOptionPane.showInputDialog("Digite o CEP: "));
		objColaborador.setEndereco(objEndereco);

		// Saidas
		System.out.println("\n\nINFORMAÇÕES GERAIS\n" + 
		objColaborador.getNomeIdade() + 
		"\nHoras Trabalhadas: " + objColaborador.getQtdadeHoras() + 
		"\nValor da Hora Trabalhada: " + objColaborador.getValorHora() +
		"\nSalário: " + objColaborador.calcularSalario() +
		"\nPaga Taxa? " + objColaborador.pagarTaxa());

	}

}
