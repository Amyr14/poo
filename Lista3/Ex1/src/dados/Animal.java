package dados;

public abstract class Animal {
	
	String nome;
	
	public abstract String emitirSom();
	
	public void setNome(String nome) {
		this.nome = nome;
	}
}
