package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Produto;
import br.com.fiap.dao.ProdutoDAO;

public class TesteCadastrar{
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
	Produto objProduto = new Produto();
	ProdutoDAO dao = new ProdutoDAO();
	
	objProduto.setCodigo(inteiro("Código: "));
	objProduto.setTipo(texto("Tipo: "));
	objProduto.setMarca(texto("Marca: "));
	objProduto.setValor(real("Valor: "));
	
	System.out.println(dao.inserir(objProduto));
	}

}
