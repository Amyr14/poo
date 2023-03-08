package pkg;

public class Processo {
	
	private int id;
	private String nome;
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	@Override
	public boolean equals(Object o) {
		Processo p = (Processo)o;
		return id == p.getId() && nome.equals(p.getNome());
	}
	
}
