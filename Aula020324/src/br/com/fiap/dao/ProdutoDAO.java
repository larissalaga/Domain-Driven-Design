package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fiap.beans.Produto;
import br.com.fiap.conexoes.ConexaoFactory;

public class ProdutoDAO {
	public Connection minhaConexao;
	public ProdutoDAO() throws ClassNotFoundException, SQLException {
		super();
		this.minhaConexao = new ConexaoFactory().conexao();
	}
	//insert
	public String inserir(Produto produto) throws SQLException{
		PreparedStatement stmt = minhaConexao.prepareStatement(" Insert into T_FIAP_PRODUTO values(?, ?, ?, ?)");
		stmt.setInt(1, produto.getCodigo());
		stmt.setString(2, produto.getTipo());
		stmt.setString(3, produto.getMarca());
		stmt.setDouble(4, produto.getValor());
		stmt.execute();
		stmt.close();
		
		
		return "Produto cadastrado com sucesso!";
	}
	
	//Delete
	public String deletar (Produto produto) throws SQLException {
		PreparedStatement stmt = minhaConexao.prepareStatement("Delete from T_FIAP_PRODUTO where CODIGO = ? ");
		stmt.setInt(1, produto.getCodigo());
		stmt.execute();
		stmt.close();
		
		return "Produto deletado com sucesso!";
		
	}
	//Update
	public String atualizar (Produto produto) throws SQLException {
		PreparedStatement stmt = minhaConexao.prepareStatement("Update T_FIAP_PRODUTO set TIPO = ? , MARCA = ? , VALOR = ? where CODIGO = ? ");
		stmt.setString(1, produto.getTipo());
		stmt.setString(2, produto.getMarca());
		stmt.setDouble(3, produto.getValor());
		stmt.setInt(4, produto.getCodigo());
		stmt.execute();
		stmt.close();
		
		
		return "Produto Atualizado com Sucesso";
	}

}
