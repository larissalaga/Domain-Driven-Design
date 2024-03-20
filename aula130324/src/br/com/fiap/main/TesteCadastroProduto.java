package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Produto;
import br.com.fiap.dao.ProdutoDAO;

public class TesteCadastroProduto {
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
	ProdutoDAO dao = new ProdutoDAO();
	Produto objProduto = new Produto();
	
	objProduto.setCodigo(inteiro("Código"));
	objProduto.setTipo(texto("Tipo"));
	objProduto.setMarca(texto("Marca"));
	objProduto.setValor(real("Valor"));
	
	System.out.println(dao.inserir(objProduto));
	

	}

}
