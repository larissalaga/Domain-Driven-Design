package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Banco;
import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Endereco;

public class teste {

	public static void main(String[] args) {
		// instanciar objetos
		
		//public Banco(String nome, String agencia) {
		Banco objBanco = new Banco(
				JOptionPane.showInputDialog("Nome do Banco: ").toUpperCase(),
				Integer.parseInt(JOptionPane.showInputDialog("Numero da agencia"))
				);
				
		//String nome, String cpg, int conta, String email, double saldo
		Cliente objCliente = new Cliente(
				JOptionPane.showInputDialog("Informe o nome: "),
				JOptionPane.showInputDialog("Digite o CPF: "),
				Integer.parseInt(JOptionPane.showInputDialog("Informe a conta: ")),
				null, Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo: ")),
				Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do depósito: "))
				);
		objBanco.setCliente(objCliente);
		
		
		
		//String logradouro, String cep, int numero, String bairro
		Endereco objEndereco = new Endereco(
				JOptionPane.showInputDialog("Informe o logradouro: "),
				JOptionPane.showInputDialog("Digite o CEP: "),
				Integer.parseInt(JOptionPane.showInputDialog("Informe o número do endereço")),
				JOptionPane.showInputDialog("Bairro: ")
				);
		objBanco.setEndereco(objEndereco);
		
		//saidas
		System.out.println("Banco: " + objBanco.getNome() + 
				"\nAgencia: " + objBanco.getAgencia() + 
				"\nLogradouro: " + objBanco.getEndereco().getLogradouro() + 
				"\nCEP: " + objBanco.getEndereco().getCep() + 
				"\nBairro: "  + objBanco.getEndereco().getBairro() + 
				"\nNumero: " + objBanco.getEndereco().getNumero() + 
				"\n\nINFORMAÇÕES DO CLIENTE" + 
				"\nNome: " + objBanco.getCliente().getNome() + 
				"\nCPF: " + objBanco.getCliente().getCpf() + 
				"\nNumero da conta: " + objBanco.getCliente().getConta() + 
				"\nE-mail: " + objBanco.getCliente().getEmail() + 
				"\nSaldo anterior: " + objBanco.getCliente().getSaldo()
				);
		System.out.println("SALDO ATUALIZADO\n" + objCliente.atualizacaoSaldo());
		
	}

}
