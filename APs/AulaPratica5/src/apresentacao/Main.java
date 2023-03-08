
package apresentacao;
import dados.Contato;
import negocio.ListaTelefonica;
import java.util.Scanner;
import java.util.List;
import java.util.Map;

public class Main {

	Scanner scan = new Scanner(System.in);
	ListaTelefonica listaTelefonica = new ListaTelefonica();
	
	public static void main(String[] args) {
		Main main = new Main();
		int opcao;
		do {
			opcao = main.menu();
			switch(opcao) {
				case 1:
					main.adicionarContato();
					break;
				case 2:
					main.exibirContatos();
					break;
				case 3:
					main.removerContato();
					break;
				default:
					System.out.println("Opção inválida!");
					break;
			}
		} while( opcao != 5 );
	}
	
	public Contato novoContato() {
		Contato c = new Contato();
		System.out.println("Informe o nome do contato: ");
		c.setNome(scan.nextLine());
		System.out.println("Informe o telefone do contato: ");
		c.setTelefone(scan.nextLine());
		return c;
	}
	
	public void adicionarContato() {
		Contato c = novoContato();
		listaTelefonica.adicionarContato(c);
	}
	
	public void exibirContatos(char letra) {
		List<Contato> contatos = listaTelefonica.buscarContatos(letra);
		if ( contatos.isEmpty() )
			System.out.println("Não existe nenhum contato com essa inicial");
	
		else
			for(int i = 0; i < contatos.size(); i++) {
				System.out.print((i + 1) + " - ");
				System.out.println(contatos.get(i));
			}
	}
	
	public void exibirContatos() {
		Map<Character, List<Contato>> hash = listaTelefonica.buscarContatos();
		String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		List<Contato> contatos;
		char letra;
		for(int i = 0; i < 26; i++) {
			letra = alfabeto.charAt(i);
			System.out.println(letra + ":");
			contatos = hash.get(letra);
			for(Contato c : contatos)
				System.out.println(c);
		}
	}
	
	public void removerContato() {
		char letra;
		int opcao;
		List<Contato> contatos;
		System.out.print("Informe a inicial do contato: ");
		letra = scan.nextLine().charAt(0);
		contatos = listaTelefonica.buscarContatos(letra);
		exibirContatos(letra);
		if ( !contatos.isEmpty() ) {
			System.out.print("Digite o número correspondente ao contato: ");
			opcao = Integer.valueOf(scan.nextLine()) - 1;
			listaTelefonica.removerContato(contatos.get(opcao));
		}
	}
	
	public int menu() {
		int opcao;
		System.out.println("1 - Adicionar novo contato");
		System.out.println("2 - Exibir todos contatos");
		System.out.println("3 - Remover contato");
		System.out.println("4 - Sair");
		System.out.print("Selecione uma opção: ");
		opcao = Integer.valueOf(scan.nextLine());
		return opcao;
	}

}
