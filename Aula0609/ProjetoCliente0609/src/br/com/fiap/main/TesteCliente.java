package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Endereco;

public class TesteCliente {

	public static void main(String[] args) {
		// Instanciar objeto
		Cliente objetoCliente = new Cliente();
		Endereco objetoEndereco = new Endereco();		
		//Entrada
		objetoCliente.setNome(JOptionPane.showInputDialog("Digite o nome: "));
		objetoCliente.setEmail(JOptionPane.showInputDialog("Digite o Email: "));
		objetoCliente.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: ")));
		objetoCliente.setValorMensalidade(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da mensalidade: ")));
		objetoEndereco.setLogradouro(JOptionPane.showInputDialog("Digite o Logradouro do Cliente: "));
		
		//Saídas
		System.out.println("Nome: " + objetoCliente.getNome() + 
				"\nEmail: " + objetoCliente.getEmail() + 
				"\nIdade: " + objetoCliente.getIdade() + 
				"\nValor da Mensalidade: " + objetoCliente.getValorMensalidade()+
				"\nLogradouro: " + objetoEndereco.getLogradouro());
		
	}
}
