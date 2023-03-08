
package negocio;
import dados.Cidade;
import dados.Cliente;
import dados.Reserva;



public class ReservaPassagem {
	
	private Cidade[] listaDeCidades = new Cidade[10];
	private Cliente[] listaDeClientes = new Cliente[10];
	private int numCidades = 0;
	private int numClientes = 0;
	
	public void cadastrarCidade(Cidade cidade) {
		if ( numCidades < listaDeCidades.length ) {
			listaDeCidades[numCidades] = cidade;
			numCidades++;
		}
	}
	
	public void cadastrarCliente(Cliente cliente) {
		if ( numClientes < listaDeClientes.length ) {
			listaDeClientes[numClientes] = cliente;
			numClientes++;
		}
	}
	
	public void reservarIda(Cliente cliente, Reserva reserva) {
		cliente.reservarIda(reserva);
	}
	
	public void reservarVolta(Cliente cliente, Reserva ida, Reserva volta) {
		cliente.reservarVolta(ida, volta);
	}
	
	public Reserva[] mostrarReservas(String cpfCliente) {
		for(int i = 0; i < numClientes; i++)
			if ( cpfCliente.equals(listaDeClientes[i].getCpf()) )
					return listaDeClientes[i].getReservas();
		return null;
	}
	
	public Cliente[] mostrarClientes() {
		return listaDeClientes;
	}
	
	public Cidade[] mostrarCidades() {
		return listaDeCidades;
		
	}
	
	
	
}
