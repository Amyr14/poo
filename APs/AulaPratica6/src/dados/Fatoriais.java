
package dados;

public class Fatoriais extends Gerador {
	
	public void gerar(int n) {
		for(int i = 1; i <= n; i++) {
			int fat = 1;
			for(int j = i; j > 0; j--)
				fat *= j;
			sequencia.add(fat);
		}
	}
	
}
