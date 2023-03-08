
package dados;

public class Fibonacci extends Gerador {
	
	public void gerar(int n) {
		
		if ( n > 0 )
			this.sequencia.add(0);
		
		int primAntecedente = 1;
		int segAntecedente = 0;
		int atual;
		
		for(int i = 0; i < n - 1; i++) {
			atual = primAntecedente + segAntecedente;
			this.sequencia.add(atual);
			segAntecedente = primAntecedente;
			primAntecedente = atual;
		}
		
	}
}
