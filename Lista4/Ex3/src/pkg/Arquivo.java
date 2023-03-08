package pkg;

public class Arquivo {
	
	protected String nome;
	protected String extensao;
	
	public Arquivo(String nome) throws NomeInvalidoException {
		if ( nome.contains("\n") || nome.contains("{") 
			 || nome.contains("}") || nome.contains("(")
			 || nome.contains(")") || nome.length() < 10 
			 || nome.length() > 256 ) {
			throw new NomeInvalidoException("Nome inválido!");
		}
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return "Nome: " + nome + ", Extensão: " + extensao;
	}
}
