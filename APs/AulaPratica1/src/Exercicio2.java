
import java.util.Scanner;

public class Exercicio2 {
	
	
	public static void main(String[] args) {
		 class Pessoa {
			String nome;
			int idade;
			public Pessoa(String nome, int idade) {
				this.idade = idade;
				this.nome = nome;
			}
		}
		Scanner entrada = new Scanner(System.in);
		Pessoa[] vetorPessoas = new Pessoa[5];
		for( int i = 0; i < vetorPessoas.length; i++ ) {
			System.out.printf("Digite o nome da %d* pessoa: ", i + 1);
			String nome = entrada.nextLine();
			System.out.println("Digite a idade de " + nome + ": ");
			int idade = Integer.valueOf(entrada.nextLine());
			vetorPessoas[i] = new Pessoa(nome, idade);
		}
		entrada.close();
		Boolean ordenado = false;
		while( !ordenado ) {
			ordenado = true;
			for( int i = 0; i + 1 < vetorPessoas.length; i++ ) 
				if( vetorPessoas[i].idade < vetorPessoas[i + 1].idade ) {
					Pessoa temp = new Pessoa(vetorPessoas[i].nome, vetorPessoas[i].idade);
					vetorPessoas[i] = vetorPessoas[i + 1];
					vetorPessoas[i + 1] = temp;
					ordenado = false;
				}
		}
		for( int i = 0; i < vetorPessoas.length; i++ )
			System.out.println("Nome: " + vetorPessoas[i].nome + " | Idade: " + vetorPessoas[i].idade);
	}

}
