
package GUI;
import Dados.*;
import java.util.Scanner;

public class SistemaPetShop {
	
	private Veterinario[] vets = new Veterinario[50];
	private Animal[] todosAnimais = new Animal[250];
	private int quantVets = 0;
	private int quantAnimais = 0;
	private Scanner scanner = new Scanner(System.in);
	
	public void iniciarPrograma() {
		boolean rodando = true;
		while( rodando ) {
			int selecao;
			System.out.println("--------------------");
			System.out.println("1 - Cadastrar veterinario");
			System.out.println("2 - Cadastrar animal");
			System.out.println("3 - Cadastrar dono");
			System.out.println("4 - Cadastrar endereco de um veterinario");
			System.out.println("5 - Cadastrar endereco de um dono");
			System.out.println("6 - Mostrar animais associados a um veterinario");
			System.out.println("7 - Mostrar todos os veterinarios");
			System.out.println("8 - Sair");
			System.out.println("--------------------");
			System.out.print("Selecione uma opcao: ");
			selecao = Integer.valueOf(scanner.nextLine());
			switch(selecao){
				case 1:
					cadastrarVeterinario();
					break;
				case 2:
					cadastrarAnimal();
					break;
				case 3:
					cadastrarDono();
					break;
				case 4:
					cadastrarEnderecoVeterinario();
					break;
				case 5:
					cadastrarEnderecoDono();
					break;
				case 6:
					mostrarAnimais();
					break;
				case 7:
					mostrarVeterinarios();
					break;
				case 8:
					rodando = false;
					break;
				default:
					break;		
			}
		}
	}
	
	private void mostrarVeterinarios() {
		for(int i = 0; i < quantVets; i++ )
			System.out.println(i + 1 + " -> " + vets[i].toString());
	}
	
	private void cadastrarVeterinario() {
		Veterinario vet = criaVeterinario();
		if ( quantVets < vets.length ) {
			vets[quantVets] = vet;
			quantVets++;
		}
	}
	
	private void cadastrarAnimal() {
		Veterinario vet = selecaoVeterinario();
		Animal animal;
		animal = criaAnimal();
		vet.addAnimal(animal);
		this.addAnimal(animal);
	}
	
	private void cadastrarDono() {
		Animal animal;
		Dono dono;
		int num;
		mostrarTodosAnimais();
		System.out.print("Selecione o animal cujo dono quer cadastrar: ");
		num = Integer.valueOf(scanner.nextLine());
		animal = todosAnimais[num - 1];
		dono = criaDono();
		animal.setDono(dono);
	}
	
	private void cadastrarEnderecoVeterinario() {
		Veterinario vet = selecaoVeterinario();
		Endereco endereco;
		endereco = criaEndereco();
		vet.setEndereco(endereco);
	}
	
	private void cadastrarEnderecoDono() {
		Animal animal;
		Dono dono;
		Endereco endereco;
		int num;
		mostrarTodosAnimais();
		System.out.print("Selecione o animal cujo dono o endereco quer cadastrar: ");
		num = Integer.valueOf(scanner.nextLine());
		animal = todosAnimais[num - 1];
		dono = animal.getDono();
		endereco = criaEndereco();
		dono.setEndereco(endereco);
	}
	
	private void mostrarAnimais() {
		Veterinario vet = selecaoVeterinario();
		Animal[] animais = vet.getAnimais();
		int quantAnimais = vet.getQuantAnimais();
		
		if ( quantAnimais == 0 )
			System.out.println("Nenhum animal associado a esse veterinario");
		
		for(int i = 0; i < quantAnimais; i++)
			System.out.println((i + 1) + " -> " + animais[i].toString());
	}
	
	private Veterinario criaVeterinario() {
		Veterinario vet = new Veterinario();
		System.out.print("Digite o nome do veterinario: ");
		vet.setNome(scanner.nextLine());
		System.out.print("Digite o salario do veterinario: ");
		vet.setSalario(Integer.valueOf(scanner.nextLine()));
		return vet;
	}
	
	private Endereco criaEndereco() {
		Endereco endereco = new Endereco();
		System.out.println("-----------------------------");
		System.out.println("Preencha os campos do endereco");
		System.out.println("-----------------------------");
		System.out.print("Estado: ");
		endereco.setEstado(scanner.nextLine());
		System.out.print("Cidade: ");
		endereco.setCidade(scanner.nextLine());
		System.out.print("Bairro: ");
		endereco.setBairro(scanner.nextLine());
		System.out.print("Rua: ");
		endereco.setRua(scanner.nextLine());
		System.out.print("Numero: ");
		endereco.setNumero(Integer.valueOf(scanner.nextLine()));
		System.out.print("Cep: ");
		endereco.setCep(scanner.nextLine());
		return endereco;
	}
	
	private Animal criaAnimal() {
		Animal animal = new Animal();
		System.out.println("---------------------------");
		System.out.println("Preencha os campos do animal");
		System.out.println("---------------------------");
		System.out.print("Nome: ");
		animal.setNome(scanner.nextLine());
		System.out.print("Especie: ");
		animal.setEspecie(scanner.nextLine());
		System.out.print("Descricao: ");
		animal.setDescricao(scanner.nextLine());
		return animal;
	}
	
	private Dono criaDono() {
		Dono dono = new Dono();
		System.out.println("-------------------------");
		System.out.println("Preencha os campos do dono");
		System.out.println("-------------------------");
		System.out.print("Nome: ");
		dono.setNome(scanner.nextLine());
		System.out.print("Cpf: ");
		dono.setCpf(scanner.nextLine());
		return dono;
	}
	
	private Veterinario selecaoVeterinario() {
		int num;
		mostrarVeterinarios();
		System.out.print("Selecione o veterinario: ");
		num = Integer.valueOf(scanner.nextLine());
		return vets[num - 1];
	}
	
	private void addAnimal(Animal animal) {
		if ( quantAnimais < todosAnimais.length ) {
			todosAnimais[quantAnimais] = animal;
			quantAnimais++;
		}
	}
	
	private void mostrarTodosAnimais() {
		for(int i = 0; i < quantAnimais; i++ )
			System.out.println((i + 1) + " - " + todosAnimais[i].getNome());
	}
	
}
