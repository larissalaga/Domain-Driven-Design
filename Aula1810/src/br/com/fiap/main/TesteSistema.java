package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Empresa;
import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.Produto;

public class TesteSistema {
	
	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
		
	}
	static double real(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
		
	}
	
	public static void main(String[] args) {
		// Instanciar objetos
		//String razaoSocial, String segmento, String email, int unidade
		Empresa objEmpresa = new Empresa(
				texto("Digite a razão social: "),
				texto("Digite o seguimento: "),
				texto("Digite o email: "),
				inteiro("Digie a unidade: ")
				);
		//String logradouto, String cep, int numero, String bairro
		Endereco objEndereco = new Endereco(
				texto("Digite o logradouro: "),
				texto("Digite o CEP: "),
				inteiro("Digie o número: "),
				texto("Digite o Bairro: ")				
				);
		objEmpresa.setEndereco(objEndereco);
		//String tipo, int marca, double quantidade, String valor
		Produto objProduto = new Produto(
				texto("Digite o tipo: "),
				texto("Digite a marca: "),
				inteiro("Digie a quantidade: "),				
				real("Digite o valor: ")				
				);
		objEmpresa.setProduto(objProduto);
		
		System.out.println("\n" + 
		"\nEmpresa: " + objEmpresa.getRazaoSocial() +
		"\nSegmento: " + objEmpresa.getSegmento() +
		"\nEmail: " + objEmpresa.getEmail() +
		"\nUnidade: " + objEmpresa.getUnidade() +
		"\n" +
		"\nLogradouro: " + objEmpresa.getEndereco().getLogradouto() +
		"\nCEP: " + objEmpresa.getEndereco().getCep() +
		"\nNúmero:" + objEmpresa.getEndereco().getNumero() +
		"\nBairro: " + objEmpresa.getEndereco().getBairro() +
		"\n\nPRODUTO" +
		"\nTipo: " + objEmpresa.getProduto().getTipo() +
		"\nMarca: " + objEmpresa.getProduto().getMarca() +
		"\nQuantidade: " + objEmpresa.getProduto().getQuantidade() +
		"\nValor: " + objEmpresa.getProduto().getValor()
		);

	
	
	
	
	}
}
