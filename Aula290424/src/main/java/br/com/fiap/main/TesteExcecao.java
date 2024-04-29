package br.com.fiap.main;

import java.util.Scanner;

import br.com.fiap.excecao.Excecao;

public class TesteExcecao {

	public static void main(String[] args) throws Excecao {
		
		/*primeiro jeito
		 * Scanner leitor = new Scanner (System.in);
		
		try {
			int dividendo = leitor.nextInt();
			
			int divisor = leitor.nextInt();
			
			int resultado = dividendo/divisor;
			
			System.out.println(resultado);
			
			leitor.close();
			
		} catch (ArithmeticException e) {
			System.out.println("Falha ao dividir por zero.");
		} catch (InputMismatchException e) {
			System.out.println("Falha ao inserir letra no capo numérico..");
		} finally {
			System.out.println("Passei por aqui.");
			leitor.close();
		}*/
		
		
		Scanner leitor = new Scanner (System.in);
		
		try {
			int dividendo = leitor.nextInt();
			
			int divisor = leitor.nextInt();
			
			int resultado = dividendo/divisor;
			
			System.out.println(resultado);
			
		} catch (Exception e) {
			throw new Excecao(e);
			
		} finally {
			leitor.close();
		}
		
		
		
		leitor.close();
		
		
		
		
		
		
		

	}

}
