package br.com.fiap.main;

import br.com.fiap.beans.Cliente;

public class TesteCliente {

	public static void main(String[] args) {
		// Instanciar objeto -da o poder de manipular o objeto
		Cliente objetoCliente = new Cliente ();
		
		//Entradas
		objetoCliente.setNome("Braufagélio");
		objetoCliente.setIdade(39);
		objetoCliente.setValor(9.75);
		
		//Saídas
		//System.out.println(objetoCliente.getNome());
		//System.out.println(objetoCliente.getIdade());
		//System.out.println(objetoCliente.getValor());
		System.out.println("Nome; " + objetoCliente.getNome() +
				"\nIdade: " + objetoCliente.getIdade());
	}

}
