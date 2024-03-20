package br.com.fiap.main;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.fiap.conexoes.ConexaoFactory;

public class TesteConexao {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Instanciar chamando o metodo de conexao da classe ConexaoFactory
		Connection cn = new ConexaoFactory().conexao();
		System.out.println("Conectado com o Banco de Dados");
		cn.close();
		

	}

}
