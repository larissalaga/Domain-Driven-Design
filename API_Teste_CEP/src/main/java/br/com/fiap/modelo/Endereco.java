package br.com.fiap.modelo;

public class Endereco {
	
	private String cep;
	private String logradouro;
	private String complemento;
	private String bairro;
	
	public Endereco() {
		super();
	}
	public Endereco(String cep, String logradouro, String complemento, String bairro) {
		super();
		this.cep = cep;
		this.logradouro = logradouro;
		this.complemento = complemento;
		this.bairro = bairro;
	}

	@Override
	public String toString() {
		return "Endereco [cep=" + cep + ", logradouro=" + logradouro + ", complemento=" + complemento + ", bairro="
				+ bairro + "]";
	}
	
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	
	
	/*{
    "cep": "12947-450",
    "logradouro": "Rua Atibaia",
    "complemento": "",
    "bairro": "Jardim Paulista",
    "localidade": "Atibaia",
    "uf": "SP",
    "ibge": "3504107",
    "gia": "1909",
    "ddd": "11",
    "siafi": "6181"
}*/

}
