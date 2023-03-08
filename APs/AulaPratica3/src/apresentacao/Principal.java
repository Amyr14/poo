
package apresentacao;
import dados.Cliente;
import dados.Reserva;
import dados.Cidade;
import negocio.ReservaPassagem;
import java.util.Scanner;

public class Principal {
	
	private Scanner scan = new Scanner(System.in);
	private ReservaPassagem reservaPassagem = new ReservaPassagem();

	public static void main(String[] args) {
		Principal principal = new Principal();
		int opcao;
		do {
			opcao = principal.menu();
			switch( opcao ) {
				case 0:
					break;
				case 1:
					principal.fazerReserva();
					break;
				case 2:
					principal.cadastrarCliente();
					break;
				case 3:
					principal.cadastrarCidade();
					break;
				case 4:
					principal.mostrarReservas();
					break;
				default:
					System.out.println("Opção inválida!");
					break;
			}
		} while ( opcao != 0 );
	}
	
	public void fazerReserva() { 
		Cliente[] clientes = reservaPassagem.mostrarClientes();
		Cidade[] cidades = reservaPassagem.mostrarCidades();
		Reserva reservaIda, reservaVolta;
		Cliente cliente;
		int num;
		
		if ( clientes[0] == null )
			System.out.println("Nenhum cliente cadastrado");
		
		else if ( cidades[0] == null )
			System.out.println("Nenhuma cidade cadastrada");
		
		else {
			
			for(int i = 0; i < clientes.length; i++)
				if ( clientes[i] != null )
					System.out.println((i + 1) + " -> " + clientes[i].toString());
			
			System.out.println("Selecione um cliente: ");
			num = Integer.valueOf(scan.nextLine());
			cliente = clientes[num - 1];
			reservaIda = criarReserva();
			reservaPassagem.reservarIda(cliente, reservaIda);
			System.out.println("Deseja reservar a volta? (1 para sim, qualquer número para não): ");
			num = Integer.valueOf(scan.nextLine());
			if ( num == 1 ) {
				reservaVolta = criarReserva();
				reservaPassagem.reservarVolta(cliente, reservaIda, reservaVolta);
			}
			
		}
	}
	
	public void cadastrarCliente() {
		Cliente cliente = new Cliente();
		System.out.println("Informe o cpf do cliente: ");
		cliente.setCpf(scan.nextLine());
		System.out.println("Informe o telefone do cliente: ");
		cliente.setTelefone(scan.nextLine());
		System.out.println("Informe o endereço do cliente: ");
		cliente.setEndereco(scan.nextLine());
		reservaPassagem.cadastrarCliente(cliente);
	}
	
	public void cadastrarCidade() {
		Cidade cidade = new Cidade();
		System.out.println("Informe o estado: ");
		cidade.setEstado(scan.nextLine());
		System.out.println("Informe o nome da cidade: ");
		cidade.setNome(scan.nextLine());
		reservaPassagem.cadastrarCidade(cidade);
	}
	
	public void mostrarReservas() {
		String cpfCliente;
		Reserva[] reservas;
		System.out.println("Informe o cpf do cliente: ");
		cpfCliente = scan.nextLine();
		reservas = reservaPassagem.mostrarReservas(cpfCliente);
		if ( reservas == null )
			System.out.println("Esse cliente não possui reservas ou não está cadastrado");
		else 
			for(int i = 0; i < reservas.length; i++)
				if ( reservas[i] != null )
					System.out.println(reservas[i]);
	}
	
	public Reserva criarReserva() {
		Reserva reserva = new Reserva();
		Cidade[] cidades = reservaPassagem.mostrarCidades();
		int num;
		
		for(int i = 0; i < cidades.length; i++)
			if ( cidades[i] != null )
				System.out.println((i + 1) + " -> " + cidades[i].toString());
		
		System.out.println("Selecione a cidade de origem: ");
		num = Integer.valueOf(scan.nextLine());
		reserva.setOrigem(cidades[num - 1]);
		System.out.println("Selecione a cidade de destino: ");
		num = Integer.valueOf(scan.nextLine());
		reserva.setDestino(cidades[num - 1]);
		System.out.println("Informe o número da reserva: ");
		reserva.setNumReserva(Integer.valueOf(scan.nextLine()));
		System.out.println("Informe a data do voo: ");
		reserva.setDataVoo(scan.nextLine());
		System.out.println("Informe a hora do voo: ");
		reserva.setHoraVoo(scan.nextLine());
		System.out.println("Informe o preço a ser pago: ");
		reserva.setPreco(Float.valueOf(scan.nextLine()));
		System.out.println("Informe a classe do voo: ");
		reserva.setClasseVoo(scan.nextLine());
		System.out.println("Informe a poltrona: ");
		reserva.setPoltrona(Integer.valueOf(scan.nextLine()));
		return reserva;
	}
	
	public int menu() {
		int opcao = -1;
		System.out.println("0 - Sair");
		System.out.println("1 - Fazer reserva");
		System.out.println("2 - Cadastrar cliente");
		System.out.println("3 - Cadastrar cidade");
		System.out.println("4 - Mostrar reservas de um cliente");
		System.out.println("Selecione uma opção: ");
		opcao = Integer.valueOf(scan.nextLine());
		return opcao;
	}

	
}
