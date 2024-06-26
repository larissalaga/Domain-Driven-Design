package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Colaborador;
import br.com.fiap.beans.Endereco;

public class TesteSistema {

	public static void main(String[] args) {
		// Instanciar objetos
		Cliente objetoCliente = new Cliente();
		Colaborador objetoColaborador = new Colaborador();
		Endereco objetoEndereco = new Endereco();

		// Entradas
		//Cliente
		objetoCliente.setNome(JOptionPane.showInputDialog("Digite o nome: "));
		objetoCliente.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: ")));
		objetoCliente.setEmail(JOptionPane.showInputDialog("Digite o email: "));
		
		//Endereco
		objetoEndereco.setLogradouro(JOptionPane.showInputDialog("Digite a Rua: "));
		objetoEndereco.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite o número: ")));
		objetoEndereco.setCep(JOptionPane.showInputDialog("Digite o CEP: "));
		objetoEndereco.setBairro(JOptionPane.showInputDialog("Digite o Bairro: "));
		objetoCliente.setEndereco(objetoEndereco);
		
		//Colaborador
		objetoColaborador.setNome(JOptionPane.showInputDialog("Digite o nome do colaborador: "));
		objetoColaborador.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Digite o salário: ")));
		
		//Saidas
		//Cliente
		System.out.println("Nome: " + objetoCliente.getNome()+
				"\nIdade: " + objetoCliente.getIdade()+
				"\nEmail: " + objetoCliente.getEmail());
		//Endereco
		System.out.println("\nRua: " + objetoCliente.getEndereco().getLogradouro()+
				"\nNumero: " + objetoCliente.getEndereco().getNumero()+
				"\nCEP: "+ objetoCliente.getEndereco().getCep()+
				"\nBairro:" + objetoCliente.getEndereco().getBairro());
		
		//Colaborador
		System.out.println("\nColaborador: " + objetoColaborador.getNome()+
				"\nSalario: " + objetoColaborador.getSalario());

	}

}
