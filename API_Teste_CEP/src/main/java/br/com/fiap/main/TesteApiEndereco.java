package br.com.fiap.main;

import java.io.IOException;

import javax.swing.JOptionPane;

import org.apache.http.client.ClientProtocolException;

import br.com.fiap.modelo.Endereco;
import br.com.fiap.services.ViacepService;

public class TesteApiEndereco {

	public static void main(String[] args) throws ClientProtocolException, IOException {
		// Instanciar objetos
		ViacepService viacep = new ViacepService();
		
		String cep = JOptionPane.showInputDialog("Informe o CEP: ");
		
		Endereco endereco = viacep.getEndereco(cep);
		
		System.out.println(endereco);

	}

}
