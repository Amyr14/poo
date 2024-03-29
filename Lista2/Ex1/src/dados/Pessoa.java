
package dados;

public class Pessoa implements Comparable<Pessoa>{
	
	private String nome;
	private String cpf;
	private String cidade;
	private int idade;
	
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
	
	public String getCidade() {
		return cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public int compareTo(Pessoa p) {
		return nome.compareToIgnoreCase(p.getNome());
	}
	
	@Override
	public String toString() {
		return "[ Nome: " + nome + " | Cidade: " + cidade
				+ " | CPF: " + cpf + " | Idade: " + idade + " ]";
	}
}


