package pkg;

public class Musica extends Arquivo {

	private int duracao;
	
	public Musica(String nome, int duracao) throws NomeInvalidoException {
		super(nome);
		this.duracao = duracao;
	}

	@Override
	public String toString() {
		return super.toString() + ", Duração: " + duracao;
	}
	
}
