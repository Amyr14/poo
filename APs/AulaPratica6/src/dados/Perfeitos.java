
package dados;
import java.util.ArrayList;

public class Perfeitos extends Gerador {
	
	public void gerar(int n) {
		Divisor div = new Divisor();
		int somaDiv = 0;
		int perfeitos = 0;
		for(int i = 1; i <= perfeitos; i++) {
			ArrayList<Integer> divisores = div.divisores(i);
			for(int j = 0; j < divisores.size(); j++)
				somaDiv += divisores.get(j);
			if ( somaDiv == i ) {
				this.sequencia.add(i);
				perfeitos++;
			}
		}
	}
}
