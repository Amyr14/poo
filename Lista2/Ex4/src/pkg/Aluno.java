
package pkg;

public class Aluno implements Comparable<Aluno> {
	
	private String nome;
	private int idade;
	int quantNotas = 0;
	double notas[] = new double[5];
	
	public Aluno(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public double[] getNotas() {
		return notas;
	}
	
	public boolean addNota(double nota) {
		if ( quantNotas == notas.length )
			return false;
		notas[quantNotas] = nota;
		return true;
	}
	
	public String toString() {
		return "[nome=" + nome + "|idade=" + idade +
				"|media=" + this.calcularMedia() + "]";
	}
	
	public double calcularMedia() {
		if ( quantNotas == 0 )
			return 0;
		double soma = 0;
		for(int i = 0; i < quantNotas; i++)
			soma += notas[i];
		return soma / quantNotas;
	}
	
	@Override
	public int compareTo(Aluno a) {
		if ( calcularMedia() > a.calcularMedia() )
			return 1;
		else if ( calcularMedia() < a.calcularMedia() )
			return -1;
		return 0;
	}
}
