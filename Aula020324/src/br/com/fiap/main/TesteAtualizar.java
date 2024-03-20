package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Produto;
import br.com.fiap.dao.ProdutoDAO;

public class TesteAtualizar {
	// String
		static String texto(String j) {
			return JOptionPane.showInputDialog(j);
		}

		// Inteiro
		static int inteiro(String j) {
			return Integer.parseInt(JOptionPane.showInputDialog(j));
		}

		// Double
		static double real(String j) {
			return Double.parseDouble(JOptionPane.showInputDialog(j));
		}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Produto objProduto = new Produto();
		ProdutoDAO dao = new ProdutoDAO();
		
		objProduto.setCodigo(inteiro("Informe o código do produto a ser atualizado"));
		objProduto.setTipo(texto("Tipo de Produto"));
		objProduto.setMarca(texto("Marca de Produto"));
		objProduto.setValor(real("Valor do Produto"));
		
		System.out.println(dao.atualizar(objProduto));
		
	
	

	}

}
