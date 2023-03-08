
package dados;

public class Produto {
	
	private String nome;
	private int codigo;
	private int quantidade;
	private float preco;
	
	public Produto(String nome, int codigo, float preco, int quantidade){
		this.nome = nome;
		this.codigo = codigo;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public int getQuantidade() {
		return quantidade; 
	}

	@Override
	public String toString() {
		return "Produto [ nome=" + nome + ", codigo=" +
				codigo + ", preco=" + preco + " ]";
	}
	
	public boolean equals(Produto produto) {
		return codigo == produto.codigo;
	}
	
	public void adicionarProduto(int quantidade) {
		this.quantidade += quantidade;
	}
	
}
