package br.com.fiap.beans;

public class Credito extends Cartao {
	
	 public Credito() {
		 super();
	 }

	public Credito(String nome, String bandeira, String banco, int numero, int cvv, double saldo, double compra) {
		super(nome, bandeira, banco, numero, cvv, saldo, compra);
		
	}
	
	public String status() {
		return "Verificar limite Crédito";
	}
	
	public double limite() {
		return saldo + (30 * saldo/100);
		
	}
	
	 
	 
}
