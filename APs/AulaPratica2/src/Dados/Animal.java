package Dados;

public class Animal {
	
	private String nome;
	private String especie;
	private String descricao;
	private Dono dono;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEspecie() {
		return especie;
	}
	
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Dono getDono() {
		return dono;
	}
	
	public void setDono(Dono dono) {
		this.dono = dono;
	}
	
	public String toString() {
		String sNome = "Nome: " + nome;
		String sEspecie = "Especie: " + especie;
		String sDescricao = "Descricao: " + descricao;
		String pipe = " | ";
		String sDono;
		
		if ( dono != null )
			sDono = "Dono: " + dono.getNome();
		else
			sDono = "Sem dono";
		
		return "{ " + sNome + pipe + sEspecie + pipe + sDono + pipe + sDescricao + " }";
	}
	
}
