package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.Produto;

public class testCliente {

	public static void main(String[] args) {
		//Instanciar objetos
		//(String nome, String cpf, String rg)
		Cliente objCliente = new Cliente(
				JOptionPane.showInputDialog("Digite seu nome: "), 
				JOptionPane.showInputDialog("Digite o CPF: "), 
				JOptionPane.showInputDialog("Digite o RG: "));
		//(String logradouro, int numero, String cep, String bairro, String cidade, String estado,
		//String nacionalidade)
		Endereco objEndereco = new Endereco(
				JOptionPane.showInputDialog("Digite o logradouro: "), 
				Integer.parseInt(JOptionPane.showInputDialog("Digite o número: ")), 
				JOptionPane.showInputDialog("Digite o CEP: "), 
				JOptionPane.showInputDialog("Digite o bairro: "), 
				JOptionPane.showInputDialog("Digite a cidade: "),
				JOptionPane.showInputDialog("Digite o estado: "), 
				JOptionPane.showInputDialog("Digite a nacionalidade: ")
				);

		
		//String nomeProduto, String marca, double valor
		Produto objProduto = new Produto(
				JOptionPane.showInputDialog("Digite o nome do produto: "), 
				JOptionPane.showInputDialog("Digite a marca: "), 
				Double.parseDouble(JOptionPane.showInputDialog("Digite o valor: ")));
		
		//saidas
		System.out.println("Nome: " + objCliente.getNome() + 
				"\nCPF" + objCliente.getCpf() + 
				"\nRG: " + objCliente.getRg() +
				"\nLogradouro: " + objEndereco.getLogradouro() + 
				"\nNúmero: " + objEndereco.getNumero() + 
				"\nCEP: " +  objEndereco.getCep() + 
				"\nBairro: " + objEndereco.getBairro() + 
				"\nCidade: " + objEndereco.getCidade() + 
				"\nEstado: " + objEndereco.getEstado() + 
				"\nNacionalidade: " + objEndereco.getNacionalidade() + 
				"\nINFORMAÇÕES DO PRODUTO\n" + 
				"\nProduto: " + objProduto.getNomeProduto()+ 
				"\n Marca: " + objProduto.getMarca() + 
				"\nValor: " + objProduto.getValor()
				);

	}

}
