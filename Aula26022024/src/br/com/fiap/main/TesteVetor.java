package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;

public class TesteVetor {
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

	public static void main(String[] args) {
	//preparar vetor e determinar o máximo de posições
		Cliente[] vetorClientes = new Cliente[2]; 
		
		// o indice controla as posições
		int indice = 0;
		
		//Entrada
		do {
			vetorClientes[indice] = new Cliente();
			vetorClientes[indice].setCodigo(inteiro("Informe o código do cliente"));
			vetorClientes[indice].setNome(texto("Informe o nome do cliente"));
			vetorClientes[indice].setRg(texto("Informe o RG do cliente"));
			vetorClientes[indice].setRenda(real("Informe a renda do cliente"));
			
			indice ++;
						
		} while (JOptionPane.showConfirmDialog(null, "Cadastrar mais clientes?", "CADASTRO DE CLIENTES", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)==0);
		
		//Saida
		// para vetor utilizamos o for
		for (int contador = 0; contador < indice; contador ++ ) {
			System.out.println("\n\nCodigo: " + vetorClientes[contador].getCodigo() +
								"\nNome: " + vetorClientes[contador].getNome() + 
								"\nRG: " + vetorClientes[contador].getRg() + 
								"\nRenda: " + vetorClientes[contador].getRenda());
			
		}

	}

}
