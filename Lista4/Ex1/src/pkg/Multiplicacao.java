package pkg;

public class Multiplicacao extends Soma {
	
	public int executar(int valor1, int valor2) {
		int soma = 0;
		for(int i = 0; i < valor2; i++)
			soma = super.executar(soma, valor1);
		return soma;
	}
	
}
