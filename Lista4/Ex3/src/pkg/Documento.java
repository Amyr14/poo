package pkg;

public class Documento extends Arquivo {
	
	private String texto;
	
	public Documento(String nome, String texto) throws NomeInvalidoException {
		super(nome);
		this.texto = texto;
		extensao = ".txt";
	}

	@Override
	public String toString() {
		return super.toString() + ", Texto: " + texto;
	}
	
}
