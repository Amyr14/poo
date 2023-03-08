
package dados;

public class Primos extends Gerador {
	
	public void gerar(int n) {
		boolean primo;
		int primos = 0;
		for(int i = 1; primos < n; i++) {
			primo = true;
			for(int j = i; j > 1; j--)
				if ( i % j == 0 ) {
					primo = false;
					continue;
				}
			if ( primo ) {
				sequencia.add(i);
				primos++;
			}
		}
	}
	
}
