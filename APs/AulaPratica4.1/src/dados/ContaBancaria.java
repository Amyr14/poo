
package dados;

public class ContaBancaria {
	
	protected String cpf;
	protected float saldo;
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public float getSaldo() {
		return saldo;
	}
	
	public float sacar(float valor) {
		if ( valor > saldo )
			return -1;
		saldo -= valor;
		return valor;
	}
	
	public String gerarExtrato() {
		return "Saldo: " + saldo; 
	}
	
}
