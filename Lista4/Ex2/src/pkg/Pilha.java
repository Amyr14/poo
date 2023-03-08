package pkg;
import java.util.List;
import java.util.ArrayList;

public class Pilha<T> {
	
	private int limite;
	private List<T> elementos = new ArrayList<T>();
	
	public Pilha(int limite) {
		this.limite = limite;
	}
	
	public void inserir(T objeto) throws PilhaCheiaException {
		if( elementos.size() == limite )
			throw new PilhaCheiaException("A pilha está cheia");
		
		elementos.add(objeto);
	}
	
	public T remover() throws PilhaVaziaException {
		if( elementos.size() == 0 )
			throw new PilhaVaziaException("A pilha está vazia");
		
		T temp = elementos.get(elementos.size() - 1);
		elementos.remove(temp);
		return temp;
	}
	
	public int getSize() {
		return elementos.size();
	}
}
