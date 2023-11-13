package br.com.fiap.main;

import java.awt.JobAttributes;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Produto;

public class SistmaProdutos {
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
		//valor total
		static double valorTotal(List<Produto> lp, Produto p) {
			double total = 0;
			for (Produto pr : lp) {
				total +=  pr.getQuantidade()*pr.getValor();
			}
			
			return total;
			
		}

	public static void main(String[] args) {
		// Instanciar
		List<Produto> listaProdutos = new ArrayList<Produto>();		
		
		Produto objProduto;
		
		//entradas
		do {
			objProduto = new Produto();
			objProduto.setCodigo(inteiro("Informe o código: "));
			objProduto.setTipo(texto("Informe o tipo de produto: "));
			objProduto.setMarca(texto("Informe a Marca: "));
			objProduto.setQuantidade(inteiro("	Quantidade: "));
			objProduto.setValor(real("Valor do Produto: "));
			listaProdutos.add(objProduto);
			
		
		}while(JOptionPane.showConfirmDialog(null, "Continuar Comprando?", "CARRINHO DE COMPRAS", 
			JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)==0);
		
		for (Produto produto : listaProdutos) {
			System.out.println("Codigo: " + produto.getCodigo() +
					"\nTipo: " + produto.getTipo() + 
					"\nMarca: " + produto.getMarca() + 
					"\nQuantidade: " + produto.getQuantidade() +
					"\nValor: " + produto.getValor()
					);
		}
		System.out.println("\n\n\nVALOR TOTAL: " + valorTotal(listaProdutos, objProduto));
		

	}

}
