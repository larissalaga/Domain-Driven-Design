package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.Fisica;
import br.com.fiap.beans.Juridica;

public class TesteSistema {

	public static void main(String[] args) {
		// Instanciar
		//String nome, String email, String cpf
		Fisica objF = new Fisica(
				JOptionPane.showInputDialog("Nome: "),
				JOptionPane.showInputDialog("E-mail: "),
				JOptionPane.showInputDialog("CPF: ")
				);
		Juridica objJ = new Juridica();
		Endereco objEndereco = new Endereco();

	}

}
