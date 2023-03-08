
package negocio;
import dados.ContaBancaria;
import dados.ContaCorrente;
import dados.ContaSalario;
import java.util.ArrayList;

public class Sistema {
	
	private int quantidade = 0;
	private ArrayList<ContaBancaria> contasBancarias = new ArrayList<ContaBancaria>();
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public ArrayList<ContaBancaria> getContasBancarias() {
		return contasBancarias;
	}
	
	public void cadastrarConta(ContaBancaria conta) {
		contasBancarias.add(conta);
		quantidade++;
	}
	
	public boolean realizarSaque(ContaBancaria conta, float valor) {
		if ( conta.sacar(valor) == -1 )
			return false;
		
		return true;
	}
	
	public boolean realizarDeposito(ContaCorrente conta, float valor) {
		return conta.depositar(valor);
	}
	
	public boolean realizarDeposito(ContaSalario conta, float valor, String cnpj) {
		return conta.depositar(valor, cnpj);
	}
	
	public ArrayList<ContaBancaria> getContas(){
		return contasBancarias;
	}
	
	public ArrayList<ContaCorrente> getContasCorrente(){
		ArrayList<ContaCorrente> contasCorrentes = new ArrayList<ContaCorrente>();
		
		for(ContaBancaria conta : contasBancarias) 
			if ( conta instanceof ContaCorrente )
				contasCorrentes.add((ContaCorrente)conta);
		
		return contasCorrentes;
	}
	
	public ArrayList<ContaSalario> getContasSalario(){
		ArrayList<ContaSalario> contasSalarios = new ArrayList<ContaSalario>();
		
		for(ContaBancaria conta : contasBancarias)
			if ( conta instanceof ContaSalario )
				contasSalarios.add((ContaSalario)conta);
		
		return contasSalarios;
	}
	
	public String obterExtrato(ContaBancaria conta) {
		return conta.gerarExtrato();
	}
	
	
}
