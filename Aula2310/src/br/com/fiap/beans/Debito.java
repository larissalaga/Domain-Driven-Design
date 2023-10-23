package br.com.fiap.beans;

public class Debito extends Cartao{
	private double consignado;

	public Debito() {
		super();
	}

	public Debito(double consignado) {
		super();
		this.consignado = consignado;
	}

	public Debito(String nome, String bandeira, String banco, int numero, int cvv, double saldo, double compra,
			double consignado) {
		super(nome, bandeira, banco, numero, cvv, saldo, compra);
		this.consignado = consignado;
	}

	public double getConsignado() {
		return consignado;
	}

	public void setConsignado(double consignado) {
		this.consignado = consignado;
	}
	public String status() {
		return "Verificar limite DébitoSS";
	}
	public double limite() {
		return saldo - consignado;
	}
	
	}



