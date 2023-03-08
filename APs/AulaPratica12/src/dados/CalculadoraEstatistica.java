package dados;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class CalculadoraEstatistica implements ISequencia {
	
	private List<Integer> sequencia = new ArrayList<Integer>();
	private static CalculadoraEstatistica instance = null;
	
	private CalculadoraEstatistica() {}
	
	static public CalculadoraEstatistica getInstance() {
		if ( instance == null ) {
			instance = new CalculadoraEstatistica();
		}
		return instance;
	}
	
	public void adicionarValor(int valor) {
		sequencia.add(valor);
	}
	
	public void limparValores() {
		sequencia.clear();
	}
	
	public List<Integer> getValores(){
		return sequencia;
	}
	
	@Override
	public int sortear() { //Gera uma excessão se a lista estiver vazia
		Random r = new Random();
		int num = r.nextInt(sequencia.size() - 1);
		return sequencia.get(num);
	}
	
	@Override
	public long somatorio() {
		long soma = 0;
		for(int num : sequencia)
			soma += num;
		return soma;
	}
	
	@Override
	public double mediaAritmetica() {
		long soma = somatorio();
		return soma / sequencia.size();
	}
	
	@Override
	public double variancia() {
		double soma = 0;
		for(int num : sequencia) 
			soma += Math.pow(num -  mediaAritmetica(), 2);
		return soma / (sequencia.size() - 1);
	}
	
	@Override
	public double desvioPadrao() {
		return Math.sqrt(variancia());
	}
	
	@Override
	public long amplitude() {
		return Collections.max(sequencia) - Collections.min(sequencia);
	}
	
	@Override
	public double mediaGeometrica() {
		double produto = 1;
		for(int num : sequencia) 
			produto *= num;
		return Math.pow(produto, 1/sequencia.size());
	}
	
}
