package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Carro;
import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Endereco;

public class TesteCliente {

	public static void main(String[] args) {
		//Instanciar objetos
		Cliente objetoCliente = new Cliente();
		Endereco objetoEndereco = new Endereco();
		Carro objetoCarro = new Carro();
		
		//Entrada input
		//ex : 
		//objetoCliente.setNome(JOptionPane.showInputDialog("Digite o nome: "));
		//objetoCliente.setIdade(Integer.parseInt(JOptionPane("Digite a idade: ")));
		//Cliente
		objetoCliente.setNome("Braufa");
		objetoCliente.setCpf("222222");
		objetoCliente.setIdade(22);
		objetoCliente.setValor(3555);
		
		//Endereco
		objetoEndereco.setLogradouro("Rua bla bla bla");
		objetoEndereco.setCep("12347.485");
		objetoEndereco.setNumero(177);
		objetoEndereco.setComplemento("Bloco A");
		objetoEndereco.setBairro("Bairro é isso ai");
		objetoEndereco.setMunicipio("Asa Branca");
		objetoEndereco.setEstado("Bruatana");
		
		//Carro
		objetoCarro.setModelo("feio");
		objetoCarro.setMarca("Preto");
		objetoCarro.setAno(1992);
		objetoCarro.setValorCarro(22);
		
		//Saídas
		System.out.println("Logradouro: " + objetoEndereco.getLogradouro());
		
		

	}

}
