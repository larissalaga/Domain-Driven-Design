package br.com.fiap.main;

import java.io.IOException;

import javax.swing.JOptionPane;

import org.apache.http.client.ClientProtocolException;

import br.com.fiap.beans.Cliente;
import br.com.fiap.model.Endereco;
import br.com.fiap.services.ViaCepService;

public class TesteClienteEnderecoApi {

	public static void main(String[] args)  {
		// Instanciar
		ViaCepService viacep = new ViaCepService();
		
		Cliente cliente = new Cliente();
		
		String cep = JOptionPane.showInputDialog("Informe o CEP do cliente para bisca: ");
		
		Endereco endereco = null;
		
		try {
			endereco = viacep.getEndereco(cep);
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		cliente.setEndereco(endereco);
		
		System.out.println(cliente);

	}

}
