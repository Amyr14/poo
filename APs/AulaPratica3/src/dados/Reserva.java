
package dados;

public class Reserva {
	
	private int numReserva;
	private float preco;
	private int poltrona;
	private boolean idaEVolta;
	private String dataVoo;
	private String horaVoo;
	private String classeVoo;
	private Cidade origem;
	private Cidade destino;
	private Reserva Volta = null;
	
	
	public int getNumReserva() {
		return numReserva;
	}


	public void setNumReserva(int numReserva) {
		this.numReserva = numReserva;
	}


	public float getPreco() {
		return preco;
	}


	public void setPreco(float preco) {
		this.preco = preco;
	}


	public float getPoltrona() {
		return poltrona;
	}


	public void setPoltrona(int poltrona) {
		this.poltrona = poltrona;
	}


	public boolean isIdaEVolta() {
		return idaEVolta;
	}


	public void setIdaEVolta(boolean idaEVolta) {
		this.idaEVolta = idaEVolta;
	}


	public String getDataVoo() {
		return dataVoo;
	}


	public void setDataVoo(String dataVoo) {
		this.dataVoo = dataVoo;
	}


	public String getHoraVoo() {
		return horaVoo;
	}


	public void setHoraVoo(String horaVoo) {
		this.horaVoo = horaVoo;
	}


	public String getClasseVoo() {
		return classeVoo;
	}


	public void setClasseVoo(String classeVoo) {
		this.classeVoo = classeVoo;
	}


	public Cidade getOrigem() {
		return origem;
	}


	public void setOrigem(Cidade origem) {
		this.origem = origem;
	}


	public Cidade getDestino() {
		return destino;
	}


	public void setDestino(Cidade destino) {
		this.destino = destino;
	}


	public Reserva getVolta() {
		return Volta;
	}


	public void setVolta(Reserva volta) {
		Volta = volta;
	}


	public String toString() {
		return "{ Reserva: " + numReserva + " | Poltrona: " + poltrona + " | Data: " +
				dataVoo + " | Hora: " + horaVoo + " | Classe: " + classeVoo +
				" | Origem: " + origem + " | Destino: " + destino + " }";
	}
	
}
