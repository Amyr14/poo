
package dados;

public class Quadrados extends Gerador {
	
	public void gerar(int n) {
		double raiz;
		int quadrados = 0;
		for(int i = 1; quadrados <= n; i++) {
			raiz = Math.sqrt(i);
			if ( raiz == Math.ceil(raiz) ) {
				sequencia.add(i);
				quadrados++;
			}
		}
	}
	
}
