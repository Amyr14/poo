package pkg;

public class Principal {

	public static void main(String[] args) {
		
		Digrafo digrafo = new Digrafo();
		Grafo grafo = new Grafo();
		
		for(int i = 0; i < 4; i++) {
			digrafo.adicionarVertice();
			grafo.adicionarVertice();
		}
		
		grafo.adicionarAresta(0, 2);
		grafo.adicionarAresta(1, 3);
		digrafo.adicionarAresta(0, 2);
		digrafo.adicionarAresta(1, 3);
		System.out.println(digrafo);
		System.out.println(grafo);
		
	}
	
}
