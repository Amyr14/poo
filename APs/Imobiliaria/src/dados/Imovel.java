
package dados;

public class Imovel {
	
	private float largura;
	private float comprimento;
	private float preco;
	
	public float getLargura() {
		return largura;
	}
	
	public void setLargura(float largura) {
		this.largura = largura;
	}
	
	public float getComprimento() {
		return comprimento;
	}
	
	public void setComprimento(float comprimento) {
		this.comprimento = comprimento;
	}
	
	public float getPreco() {
		return preco;
	}
	
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public float areaTotal() {
		return comprimento * largura;
	}
	
	public String toString() {
		return "Largura: " + largura + " Comprimento: " + comprimento +
				" Preco: " + preco;
	}
	
}
