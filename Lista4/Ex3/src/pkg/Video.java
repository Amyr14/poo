package pkg;

public class Video extends Arquivo {
	
	private Qualidade qualidade;
	
	public Video(String nome, Qualidade qualidade) throws NomeInvalidoException {
		super(nome);
		this.qualidade = qualidade;
	}

	@Override
	public String toString() {
		return super.toString() + ", Qualidade: " + qualidade;
	}
	
}
