
package dados;
import java.util.ArrayList;

public class Abundantes extends Gerador {
	
	public void gerar(int n) {
		Divisor div = new Divisor();
		int abundantes = 0;
		int somaDiv = 0;
		for(int i = 1; abundantes <= n; i++) {
			ArrayList<Integer> divisores = div.divisores(i);
			for(int j = 0; j < divisores.size(); j++)
				somaDiv += divisores.get(j);
			if ( somaDiv > i ) {
				sequencia.add(i);
				abundantes++;
			}
		}
	}
	
}
