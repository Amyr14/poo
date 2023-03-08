
package dados;

public class ContaSalario extends ContaBancaria {
	
	private String cnpjEmpresa;
	
	public void setCpnjEmpresa(String cnpj) {
		cnpjEmpresa = cnpj;
	}
	
	public String getCnpjEmpresa() {
		return cnpjEmpresa;
	}
	
	public boolean depositar(float valor, String cnpj) {
		if ( !cnpjEmpresa.equals(cnpj) )
			return false;
		
		this.saldo += valor;
		return true;
	}
}
