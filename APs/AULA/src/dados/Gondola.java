
package dados;
import java.util.ArrayList;

public class Gondola {
	
	private String tipo;
	private int quantProdutos = 0;
	private ArrayList<Produto> produtos = new ArrayList<Produto>();
	
	public Gondola(String tipo) {
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getQuantProdutos() {
		return quantProdutos;
	}

	public void setQuantProdutos(int quantProdutos) {
		this.quantProdutos = quantProdutos;
	}

	public ArrayList<Produto> getProdutos() {
		return produtos;
	}
	
	public void registraProduto(Produto produto) {
		produtos.add(produto);
		quantProdutos += produto.getQuantidade();
	}
	
	public void incrementarProduto(int codigo, int quantidade) {
		for( Produto produto : produtos )
			if ( produto.getCodigo() == codigo ) {
				produto.adicionarProduto(quantidade);
				quantProdutos += quantidade;
			}
	}

	@Override
	public String toString() {
		return "Gondola [ tipo=" + tipo + ", quantProdutos=" + quantProdutos +
				", produtos=" + produtos.toString() + " ]";
	}
	
	public boolean equals(Gondola gondola) {
		return tipo.equals(gondola.tipo) &&
			   produtos.equals(gondola.produtos) &&
			   quantProdutos == gondola.quantProdutos;
	}
	
	
}
