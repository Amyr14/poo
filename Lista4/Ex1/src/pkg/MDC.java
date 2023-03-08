package pkg;

public class MDC implements IOperacaoInteira {
	
	private Mod mod = new Mod();
	
	public int executar(int valor1, int valor2) {
		int i = valor1;
		
		if ( valor1 > valor2 )
			i = valor2;
		
		while( !(mod.executar(valor1, i) == 0 && mod.executar(valor2, i) == 0) )
			i -= 1;
		
		return i;
	}
	
}
