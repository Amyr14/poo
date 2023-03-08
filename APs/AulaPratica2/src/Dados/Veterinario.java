package Dados;

public class Veterinario {
	
	private String nome;
	private Endereco endereco;
	private Animal[] animais = new Animal[5];
	private int quantAnimais = 0;
	private float salario;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public Animal[] getAnimais() {
		return animais;
	}
	
	public void addAnimal(Animal animal) {
		if ( quantAnimais < animais.length ) {
			animais[quantAnimais] = animal;
			quantAnimais++;
		}
	}
	
	public int getQuantAnimais() {
		return quantAnimais;
	}
	
	public void setQuantAnimais(int quantAnimais) {
		this.quantAnimais = quantAnimais;
	}
	
	public float getSalario() {
		return salario;
	}
	
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	public String toString() {
		String sNome = "Nome: " + nome;
		String sSalario = "Salario: " + salario;
		String sAnimais = "Animais: ";
		String aux;
		String pipe = " | ";
		
		if ( quantAnimais == 0 )
			aux = "Vazio";
		else
			aux = animais[0].getNome();
		
		for(int i = 1; i < quantAnimais; i++)
			aux = aux + ", " + animais[i].getNome();
		
		sAnimais = sAnimais + aux;
		
		return "{ " + sNome + pipe + sSalario + pipe + sAnimais + " }";
	}
	
}
