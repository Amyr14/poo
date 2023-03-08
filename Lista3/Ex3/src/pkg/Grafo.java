package pkg;

public class Grafo extends Digrafo {
	
	@Override
	public void adicionarAresta(int origem, int destino) {
		matrizAdjacencia.get(origem).set(destino, 1);
		matrizAdjacencia.get(destino).set(origem, 1);
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}
