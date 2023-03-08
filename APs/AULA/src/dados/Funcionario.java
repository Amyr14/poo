
package dados;

public class Funcionario {

	private String nome;
	private String funcao;
	private float salario;
	
	public Funcionario(String nome, String funcao, float salario){
		this.nome = nome;
		this.funcao = funcao;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Funcionario [ nome=" + nome + ", funcao=" + funcao + ", salario=" + salario + " ]";
	}
	
	public boolean equals(Funcionario funcionario) {
		return nome.equals(funcionario.nome) 
				&& funcao.equals(funcionario.funcao) 
				&& salario == funcionario.salario;
	}
}
