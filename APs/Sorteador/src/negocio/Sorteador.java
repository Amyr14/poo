
package negocio;
import dados.Pessoa;
import java.util.ArrayList;
import java.util.Random;

public class Sorteador {

	private ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
	private Random randomizador = new Random();
	
	public Pessoa sortearProximo() {
		
		if ( pessoas.size() == 0 )
			return null;
		
		int num = randomizador.nextInt(pessoas.size());
		Pessoa sorteado = pessoas.get(num);
		pessoas.remove(num);
		return sorteado;
	}
}
