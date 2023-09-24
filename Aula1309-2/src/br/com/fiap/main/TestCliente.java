package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.Produto;

public class TestCliente {

	public static void main(String[] args) {
		// Instanciar objetos
		Cliente objetoCliente = new Cliente();
		Endereco objetoEndereco = new Endereco();
		Produto objetoProduto = new Produto();

		// Entradas input
		// Cliente
		//objetoCliente.setNome("Sherlock");
		objetoCliente.setNome(JOptionPane.showInputDialog("Digite o nome do cliente: "));
		//objetoCliente.setIdade(35);
		objetoCliente.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: ")));
		//objetoCliente.setEmail("@elementar");
		objetoCliente.setEmail(JOptionPane.showInputDialog("Digite o email: "));

		// Endereco
		//objetoEndereco.setLogradouro("Baker Street");
		objetoEndereco.setLogradouro(JOptionPane.showInputDialog("Digite o logradouro: "));
		//objetoEndereco.setNumero(221);
		objetoEndereco.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite O número: ")));
		//objetoEndereco.setCep("nw16xe");
		objetoEndereco.setCep(JOptionPane.showInputDialog("Digite o CEP: "));
		//objetoEndereco.setBairro("B");
		objetoEndereco.setBairro(JOptionPane.showInputDialog("Digite o Bairro: "));
		//objetoEndereco.setMunicipio("Londres");
		objetoEndereco.setMunicipio(JOptionPane.showInputDialog("Digite o município:"));
		

		// Produto
		//objetoProduto.setTipo("lupa");
		objetoProduto.setTipo(JOptionPane.showInputDialog("Digite o tipo: "));
		//objetoProduto.setMarca("Watson");
		objetoProduto.setMarca(JOptionPane.showInputDialog("Digite a marca:"));
		//objetoProduto.setQuantidade(2);
		objetoProduto.setQuantidade(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade: ")));

		//objetoProduto.setValor(1235.50);
		objetoProduto.setValor(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor: ")));

		// Saídas
		// Cliente
		System.out.println("Nome do Cliente: " + objetoCliente.getNome() + "\nCPf do Cliente: "
				+ objetoCliente.getIdade() + "\nEmail: " + objetoCliente.getEmail());
		// Endereco
		System.out.println("Logradouro: " + objetoEndereco.getLogradouro() + "\nCEP: " + objetoEndereco.getCep()
				+ "\nNúmero: " + objetoEndereco.getNumero() + "\nBairro: " + objetoEndereco.getBairro()
				+ "\nMunicípio: " + objetoEndereco.getMunicipio());

		// Produto
		System.out.println("Tipo: " + objetoProduto.getTipo() + "\nMarca: " + objetoProduto.getMarca()
				+ "\nQuantidade: " + objetoProduto.getQuantidade() + "\nValor: " + objetoProduto.getValor());

	}

}
