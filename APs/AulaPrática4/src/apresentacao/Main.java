
package apresentacao;
import negocio.Zoologico;
import dados.*;
import java.util.Scanner;
import java.util.ArrayList;
import exceptions.EspacoIndisponivelException;

public class Main {
	
	Scanner scan = new Scanner(System.in);
	Zoologico zoo = new Zoologico();
	
	public static void main(String[] args) {
		Main main = new Main();
		Zoologico zoo = new Zoologico();
		ArrayList<Viveiro> viveiros = zoo.getSoViveiros();
		ArrayList<Aquario> aquarios = zoo.getSoAquarios();
		ArrayList<Animal> animais = zoo.getAnimais();
		int opcao;
		do {
			opcao = main.menu();
			switch( opcao ) {
			case 1:
				if ( main.ehAquario() )
					zoo.cadastrarViveiro(main.criaAquario());
				else
					zoo.cadastrarViveiro(main.criaViveiro());
				break;
			case 2:
				if ( main.ehPeixe() )
					zoo.cadastrarAnimal(main.criaPeixe());
				else
					zoo.cadastrarAnimal(main.criaAnimal());
				break;
			case 3:
				for(Viveiro v : viveiros)
					System.out.println(v);
				break;
			case 4:
				for(Aquario a : aquarios)
					System.out.println(a);
				break;
			case 5:
				for(int i = 0; i < animais.size(); i++)
					System.out.println((i + 1) + " - " + animais.get(i));
				System.out.println("Selecione um animal: ");
				int num = Integer.valueOf(main.scan.nextLine());
				Animal a = animais.get(num - 1);
				for (int i = 0; i < viveiros.size(); i++)
					System.out.println((i+ 1) + " - " + viveiros.get(i));
				System.out.println("Selecione um viveiro: ");
				num = Integer.valueOf(main.scan.nextLine());
				Viveiro v = viveiros.get(num - 1);
				try {
					zoo.alocarAnimal(a, v);
				} catch(EspacoIndisponivelException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 6:
				break;
			default:
				System.out.println("Opção inválida");
				break;
			}
		} while ( opcao != 6 );
	}
	
	public Animal criaAnimal() {
		Animal a = new Animal();
		System.out.println("Informe a espécie: ");
		a.setEspecie(scan.nextLine());
		System.out.println("Informe o nome: ");
		a.setNome(scan.nextLine());
		System.out.println("Informe a idade: ");
		a.setIdade(Integer.valueOf(scan.nextLine()));
		System.out.println("Informe a cor: ");
		a.setCor(scan.nextLine());
		System.out.println("Informe a altura: ");
		a.setAltura(Float.valueOf(scan.nextLine()));
		System.out.println("Informe a largura: ");
		a.setLargura(Float.valueOf(scan.nextLine()));
		System.out.println("Informe o comprimento: ");
		a.setComprimento(Float.valueOf(scan.nextLine()));
		return a;
	}
	
	public Peixe criaPeixe() {
		Peixe p = new Peixe();
		System.out.println("Informe a altura: ");
		p.setAltura(Float.valueOf(scan.nextLine()));
		System.out.println("Informe a largura: ");
		p.setLargura(Float.valueOf(scan.nextLine()));
		System.out.println("Informe o comprimento: ");
		p.setComprimento(Float.valueOf(scan.nextLine()));
		System.out.println("Informe a temperatura ideal: ");
		p.setTemperaturaIdeal(Float.valueOf(scan.nextLine()));
		return p;
	}
	
	public Viveiro criaViveiro() {
		Viveiro v = new Viveiro();
		System.out.println("Informe o comprimento: ");
		v.setComprimento(Float.valueOf(scan.nextLine()));
		System.out.println("Informe a largura: ");
		v.setLargura(Float.valueOf(scan.nextLine()));
		return v;
	}
	
	public Aquario criaAquario() {
		Aquario a = new Aquario();
		System.out.println("Informe o comprimento: ");
		a.setComprimento(Float.valueOf(scan.nextLine()));
		System.out.println("Informe a largura: ");
		a.setLargura(Float.valueOf(scan.nextLine()));
		System.out.println("Informe a altura: ");
		a.setAltura(Float.valueOf(scan.nextLine()));
		System.out.println("Informe a temperatura do aquario: ");
		a.setTemperatura(Float.valueOf(scan.nextLine()));
		return a;
	}

	public int menu() {
		int opcao;
		System.out.println("1 - Cadastrar viveiro");
		System.out.println("2 - Cadastrar animal");
		System.out.println("3 - Mostrar viveiros");
		System.out.println("4 - Mostrar aquarios");
		System.out.println("5 - Alocar animal");
		System.out.println("6 - Sair");
		System.out.println("Escolha uma opcao: ");
		opcao = Integer.valueOf(scan.nextLine());
		return opcao;	
	}
	
	public boolean ehPeixe() {
		String input;
		boolean ehPeixe;
		do {
			System.out.println("O animal é um peixe? [S/N]: ");
			input = scan.nextLine();
		} while ( !input.equals("S") && !input.equals("N"));
		ehPeixe = input.equals("S");
		return ehPeixe;
	}
	
	public boolean ehAquario() {
		String input;
		boolean ehAquario;
		do {
			System.out.println("O viveiro é um aquário? [S/N]: ");
			input = scan.nextLine();
		} while ( !input.equals("S") && !input.equals("N"));
		ehAquario = input.equals("S");
		return ehAquario;
	}
}
