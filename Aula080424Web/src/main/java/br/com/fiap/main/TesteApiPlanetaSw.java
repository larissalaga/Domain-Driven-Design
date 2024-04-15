package br.com.fiap.main;

import java.io.IOException;

import javax.swing.JOptionPane;

import org.apache.http.client.ClientProtocolException;

import br.com.fiap.model.Planeta;
import br.com.fiap.services.PlanetaSwService;

public class TesteApiPlanetaSw {

	public static void main(String[] args) throws ClientProtocolException, IOException {
		// TInstanciar objetos
		PlanetaSwService planetaService = new PlanetaSwService();
		
		String p = JOptionPane.showInputDialog("Informe o numero do planeta para pesquisa");
		
		Planeta planeta = planetaService.getPlaneta(p);
		System.out.println(planeta);
		

	}

}
