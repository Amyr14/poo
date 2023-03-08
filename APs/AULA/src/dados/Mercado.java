
package dados;
import java.util.ArrayList;

public class Mercado {
	
	private String nome;
	private int quantFuncionarios = 0;
	private int quantGondolas = 0;
	private ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
	private ArrayList<Gondola> gondolas = new ArrayList<Gondola>();
	
	public Mercado(String nome) {
		this.nome = nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public ArrayList<Funcionario> getFuncionarios(){
		return funcionarios;
	}
	
	public ArrayList<Gondola> getGondolas(){
		return gondolas;
	}
	
	public void registrarFuncionario(Funcionario funcionario) {
		funcionarios.add(funcionario);
		quantFuncionarios++;
	}
	
	public void registrarGondola(Gondola gondola) {
		gondolas.add(gondola);
		quantGondolas++;
	}

	@Override
	public String toString() {
		return "Mercado [ funcionarios=" +
				funcionarios + ", gondolas=" + gondolas + " ]";
	}
	
	public boolean equals(Mercado mercado) {
		return funcionarios.equals(mercado.getFuncionarios()) &&
			   gondolas.equals(mercado.getGondolas());
	}
	
}
