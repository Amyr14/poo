
package dados;

public class ContaCorrente extends ContaBancaria {
	
	public boolean depositar(float valor) {
		if ( valor < 0 )
			return false;
		this.saldo += valor;
		return true;
	}
}
