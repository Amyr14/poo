
package dados;

public class Contato {
	
	private String nome;
	private String telefone;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	@Override
	public boolean equals(Object o) {
		if ( !(o instanceof Contato) )
			return false;
		Contato c = (Contato)o;
		return c.getNome().equals(getNome())
				&& c.getTelefone().equals(getTelefone());
	}
	
	@Override
	public String toString() {
		return "[ Nome: " + nome + " | Telefone: " 
				+ telefone + " ]\n";
	}
	
}
