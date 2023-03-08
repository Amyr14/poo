package pkg;

public enum Qualidade {
	MUITO_BAIXA(240),
	BAIXA(360),
	MEDIA(720),
	ALTA(1024);
	
	private final int qualidade;
	
	private Qualidade(int qualidade) {
		this.qualidade = qualidade;
	}

}
