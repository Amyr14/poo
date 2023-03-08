package pkg;

public class Mod implements IOperacaoInteira {
	
	public int executar(int valor1, int valor2)  {
		if( valor2 == 0 )
			return -1;
		int resto = valor1;
		while( resto >= valor2 ) 
			resto -= valor2;
		return resto;
	}

}
