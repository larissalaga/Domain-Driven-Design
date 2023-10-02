package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Colaborador;
import br.com.fiap.beans.Endereco;

public class TesteCliente {

	public static void main(String[] args) {
		// Instanciar objetos
		Cliente objCliente = new Cliente();
		Endereco objEndereco = new Endereco();
		Colaborador objColaborador = new Colaborador();
		
		//Entradas
		//Cliente
		objCliente.setNome(JOptionPane.showInputDialog("Digite o nome: "));
		objCliente.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: ")));
		
		//Endereco
		objEndereco.setLogradouro(JOptionPane.showInputDialog("DIgite o Logradouro: "));
		objEndereco.setCep(JOptionPane.showInputDialog("CEP: "));
		objEndereco.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Número: ")));
		objCliente.setEndereco(objEndereco);
		  
		//Colaborador
		objColaborador.setNome(JOptionPane.showInputDialog("Digite o nome do colaborador"));
		objColaborador.setCargo(JOptionPane.showInputDialog("Digite o cargo"));
		objColaborador.setValorHora(Double.parseDouble(JOptionPane.showInputDialog
				("Informe o valor da hora trabalhada")));
		objColaborador.setQtdHora(Double.parseDouble(JOptionPane.showInputDialog
				("Informe a quantidade de horas trabalhadas")));
		//Saidas
		System.out.println("Nome do cliente: " + objCliente.getNome() + 
				"\nIdade: " + objCliente.getIdade() + 
				"\nLogradouro: " +objCliente.getEndereco().getLogradouro() + 
				"\nCEP: " + objCliente.getEndereco().getCep() + 
				"\nNumero: " + objCliente.getEndereco().getNumero() + 
				"\n\nINFORMAÇÕES DO COLABORADOR" + ]
				//"Nome: " + objColaborador.getNome() +
				//"\nCargo: " + objColaborador.getCargo() + 
				//"\nValor da Hora: " + objColaborador.getValorHora() + 
				//"\nQuantidade de horas: " + objColaborador.getQtdHora());
				objColaborador.getTudo() + 
				"\nO salário é: " + objColaborador.calcularSalario());
		
		System.out.println("\n\nINFORMAÇÕES DE TAXA \n" + 
		objColaborador.pagarTaxa());
		
	}

}
