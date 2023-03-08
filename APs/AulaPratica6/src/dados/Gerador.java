
package dados;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.lang.Math;
import java.util.Collections;


public abstract class Gerador implements ISequencia {
	
	protected List<Integer> sequencia = new ArrayList<Integer>();
	
	public abstract void gerar(int n);
	
	public List<Integer> getSequencia(){
		return sequencia;
	}
	
	public int sortear() {
		Random r = new Random();
		int num = r.nextInt(sequencia.size() - 1);
		return sequencia.get(num);
	}
	
	public long somatorio() {
		long soma = 0;
		for(int num : sequencia)
			soma += num;
		return soma;
	}
	
	public double mediaAritmetica() {
		long soma = somatorio();
		return soma / sequencia.size();
	}
	
	public double variancia() {
		double soma = 0;
		for(int num : sequencia) 
			soma += Math.pow(num -  mediaAritmetica(), 2);
		return soma / (sequencia.size() - 1);
	}
	
	public double desvioPadrao() {
		return Math.sqrt(variancia());
	}
	
	public long amplitude() {
		return Collections.max(sequencia) - Collections.min(sequencia);
	}
	
	public double mediaGeometrica() {
		double produto = 1;
		for(int num : sequencia) 
			produto *= num;
		return Math.pow(produto, 1/sequencia.size());
	}
	
}
