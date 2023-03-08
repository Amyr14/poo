
package dados;

public class Cliente {
	
	private String cpf;
	private String telefone;
	private String endereco;
	private int numReservas = 0;
	private Reserva[] reservas = new Reserva[10];
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Reserva[] getReservas() {
		return reservas;
	}

	public void setReservas(Reserva[] reservas) {
		this.reservas = reservas;
	}

	public void reservarIda(Reserva reserva) {
		if ( numReservas < reservas.length ) {
			reservas[numReservas] = reserva;
			numReservas++;
		}
	}
	
	public void reservarVolta(Reserva ida, Reserva volta) {
		if( ida.getVolta() == null ) {
			ida.setVolta(volta);
			ida.setIdaEVolta(true);
		}
	}
	
	public String toString() {
		return "Cpf: " + cpf + " | " + "Telefone: " + telefone
				+ " | " + "Endereço: " + endereco;
	}
}
