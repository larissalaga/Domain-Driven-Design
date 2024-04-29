package br.com.fiap.excecao;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Excecao extends Exception {
	public Excecao() {
		super();
	}
	public Excecao(Exception e) {
		super();
		if (e.getClass().toString().equals("class java.lang.ArithmeticException")) {
			System.out.println("Falha ao dividir por zero.");			
		} else if(e.getClass().toString().equals("class java.util.InputMismatchException")) {
			System.out.println("Falha ao inserir letra em campo numérico.");				
		} else {
			System.out.println("Falha desconhecida.");
			e.printStackTrace();
		}
	}
	
	

}
