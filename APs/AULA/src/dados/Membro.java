package dados;

public class Membro {
	
	private String nome;
	private String cpf;
	private String inscricao;
	
	public Membro(String nome, String cpf, String inscricao){
		this.nome = nome;
		this.cpf = cpf;
		this.inscricao = inscricao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getInscricao() {
		return inscricao;
	}

	public void setInscricao(String inscricao) {
		this.inscricao = inscricao;
	}

	@Override
	public String toString() {
		return "Membro [ nome=" + nome + ", cpf=" + cpf + ", inscricao=" + inscricao + " ]";
	}
	
	public boolean equals(Membro membro) {
		return nome.equals(membro.getNome()) &&
			   cpf.equals(membro.getCpf()) &&
			   inscricao.equals(membro.getInscricao());
	}
	
}
