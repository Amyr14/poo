package dados;

public class Animal {
	
	private String nome;
	private String cor;
	private String especie;
	private int idade;
	protected float largura;
	protected float comprimento;
	protected float altura;
	
	public float calculaArea() {
		return largura * comprimento;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getEspecie() {
		return especie;
	}
	
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public float getLargura() {
		return largura;
	}
	
	public void setLargura(float largura) {
		this.largura = largura;
	}
	
	public float getComprimento() {
		return comprimento;
	}
	
	public void setComprimento(float comprimento) {
		this.comprimento = comprimento;
	}
	
	public float getAltura() {
		return altura;
	}
	
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	@Override
	public String toString() {
		return " [Nome: " + nome + " Especie: " + especie + "] ";
	}
	
	@Override
	public boolean equals(Object o) {
		Animal a = (Animal)o;
		return nome.equals(a.nome) && cor.equals(a.cor) && especie.equals(a.especie)
			   && idade == a.idade && largura == a.largura && comprimento == a.comprimento
			   && altura == a.altura;
	}
}
