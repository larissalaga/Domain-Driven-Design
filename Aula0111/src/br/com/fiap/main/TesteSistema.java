package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.PessoaFisica;
import br.com.fiap.beans.PessoaJuridica;

public class TesteSistema {
	
	//String
	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	//int
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	//double
	static double real(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}

	public static void main(String[] args) {
		
		// Instanciar objetos
		
		
		//String nome, String email, String cnpj
		PessoaJuridica objPj = new PessoaJuridica(
				texto("Digite o nome da empresa: "),
				texto("Digite o email da empresa: "),
				texto("Digite o CNPJ: ")				
				);
		
		//String nome, String email, String cpf
		PessoaFisica objPf = new PessoaFisica(
				
				);
		
		Endereco objEndereco = new Endereco();

		
		System.out.println(objPf.identificador() 
				
				);
		
		System.out.println(objPj.identificador());

	}

}
