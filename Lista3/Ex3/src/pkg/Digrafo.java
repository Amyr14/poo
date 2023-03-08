package pkg;
import java.util.List;
import java.util.ArrayList;

public class Digrafo {
	
	protected List<List<Integer>> matrizAdjacencia = new ArrayList<List<Integer>>();
	
	public void adicionarVertice() {
		for(List<Integer> linha : matrizAdjacencia)
			linha.add(0);
		List<Integer> novoVertice = new ArrayList<Integer>();
		for(int i = 0; i < matrizAdjacencia.size() + 1; i++)
			novoVertice.add(0);
		matrizAdjacencia.add(novoVertice);
	}
	
	public void adicionarAresta(int origem, int destino) {
		matrizAdjacencia.get(origem).set(destino, 1);
	}
	
	@Override
	public String toString() {
		String matrizStr = "";
		for(int i = 0; i < matrizAdjacencia.size(); i++) {
			String linhaStr = Integer.toString(i) + ": ";
			for(Integer num : matrizAdjacencia.get(i))
				linhaStr += Integer.toString(num) + " ";
			matrizStr += linhaStr + "\n";
		}
		return matrizStr;
	}
}
