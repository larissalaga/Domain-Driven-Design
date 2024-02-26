package br.com.fiap.main;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;

public class TesteArray {
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
		// Preparar
		List<Cliente> listaClientes = new ArrayList<Cliente>();
		// Preparar objeto
		Cliente objCliente;
		// Entrada
		do {
			objCliente = new Cliente();
			objCliente.setCodigo(inteiro("Código: "));
			objCliente.setNome(texto("Nome: "));
			objCliente.setRg(texto("Rg: "));
			objCliente.setRenda(real("Renda: "));

			listaClientes.add(objCliente);
		} while (JOptionPane.showConfirmDialog(null, "Cadastrar mais clientes?", "CADASTRO DE CLIENTES",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);

		// Saida
		// para vetor utilizamos o for
		for (Cliente c : listaClientes) {
			System.out.println("\n\nCodigo: " + c.getCodigo() + "\nNome: " + c.getNome() + "\nRG: " + c.getRg()
					+ "\nRenda: " + c.getRenda());

		}
	}

}
