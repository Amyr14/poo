package pkg;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class SistemaProcessos {
	
	private List<Juiz> juizes = new ArrayList<Juiz>();
	private List<Processo> processos = new ArrayList<Processo>();
	
	public void cadastrarProcesso(Processo processo) {
		processos.add(processo);
	}
	
	public void cadastrarJuiz(Juiz juiz) {
		juizes.add(juiz);
	}
	
	public void distribuirProcessos() throws ProcessoSemJuizException {
		Random r = new Random();
		int i = 0, num;
		Juiz juiz;
		Processo processoAleatorio;
		
		while( !processos.isEmpty() && i < juizes.size() ) {
			num = r.nextInt(processos.size() - 1);
			processoAleatorio = processos.get(num);
			juiz = juizes.get(i);
			try {
				juiz.cadastrarProcesso(processoAleatorio);
			} catch( PilhaCheiaException e ) {
				i++;
			}
		}
		if ( !processos.isEmpty() )
			throw new ProcessoSemJuizException("Processo sem juiz!");
	}
}
