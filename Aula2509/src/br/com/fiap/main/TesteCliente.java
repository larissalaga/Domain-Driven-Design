package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Colaborador;
import br.com.fiap.beans.Endereco;

public class TesteCliente {

	public static void main(String[] args) {
		// Instanciar objetos
		Cliente objCliente = new Cliente();
		Colaborador objColaborador = new Colaborador();
		Endereco objEndereco = new Endereco();
		
		//Entradas
		//Cliente
		objCliente.setNome(JOptionPane.showInputDialog("Digite o nome: "));
		objCliente.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: ")));
		
		
		//Endereco
		objEndereco.setLogradouro(JOptionPane.showInputDialog("Digite o logradouro: "));
		objEndereco.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite o número: ")));
		objCliente.setEndereco(objEndereco);
		
		//Colaborador
		objColaborador.setNome(JOptionPane.showInputDialog("Digite o nome do colaborador: "));
		objColaborador.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Digite o salário: ")));
		
		//Saidas
		System.out.println("INFORMAÇÕES CLIENTE " + 
				"\nNome: "	+ objCliente.getNome() +
				"\nNome: " + objCliente.getIdade() + 
				"\n\nINFORMAÇÕES ENDEREÇO " + 
				"\nLogradouro: " + objCliente.getEndereco().getLogradouro() + 
				"\nNúmero: " + objCliente.getEndereco().getNumero() + 
				"\n\nINFORMAÇÕES COLABORADOR" + 
				objColaborador.getTudo());
		
		System.out.println("\n\nTAXA: \n" + 
		objColaborador.pagaTaxa());
		

	}

}
