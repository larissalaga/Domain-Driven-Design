package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Produto;

public class TesteSistema {
	
	//String
	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	//Int
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	//Double
	static double real(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	

	public static void main(String[] args) {		
		//Instanciar objetos
		Produto[] objVetorProduto = new Produto[3];
		
		// indice
		int indice = 0;
		
		//começa a executar as entradas
		do {
			objVetorProduto[indice] = new Produto();
			objVetorProduto[indice].setCodigo(inteiro("Digite o código: "));
			objVetorProduto[indice].setTipo(texto("Digite o tipo de produto: "));
			objVetorProduto[indice].setMarca(texto("Digite a Marca: "));
			objVetorProduto[indice].setQuantidade(inteiro("Digite a quantidade:"));
			objVetorProduto[indice].setPreco(real("Digite o preço: "));
			
			indice ++;
			
		} while(JOptionPane.showConfirmDialog(null, "Adicionar mais produtos ao carrinho?", 
				"CARRINHO DE COMPRAS", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) ==0);
		
		for(int contador = 0; contador < indice; contador ++) {
			System.out.println("\n\nCódigo: " + objVetorProduto[contador].getCodigo() +
					"\nTipo: " + objVetorProduto[contador].getTipo() + 
					"\nMarca: " + objVetorProduto[contador].getMarca() +
					"\nQuantidade: " + objVetorProduto[contador].getQuantidade() + 
					"\nPreço: " + objVetorProduto[contador].getPreco()  		
					);		
		}
		System.out.println("\n\nValor total: ");

		
		
		
	}
}
