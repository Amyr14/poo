package Dados;

public class Endereco {
	
	private int numero;
	private String rua;
	private String bairro;
	private String cidade;
	private String estado;
	private String cep;
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getRua() {
		return rua;
	}
	
	public void setRua(String rua) {
		this.rua = rua;
	}
	
	public String getBairro() {
		return bairro;
	}
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public String getCep() {
		return cep;
	}
	
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public String toString() {
		String sNumero = "Numero: " + Integer.toString(numero);
		String sEstado = "Estado: " + estado;
		String sCidade = "Cidade: " + cidade;
		String sBairro = "Bairro: " + bairro;
		String sRua = "Rua: " + rua;
		String sCep = "Cep: " + cep;
		String pipe = " | ";
		return sEstado + pipe + sCidade + pipe + sBairro + pipe + sRua + pipe + sNumero + pipe + sCep;
	}
	
}
