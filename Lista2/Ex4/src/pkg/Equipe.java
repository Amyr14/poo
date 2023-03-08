
package pkg;
import java.util.List;
import java.util.ArrayList;

public class Equipe<T> {
	
	private String nome;
	List<T> alunos = new ArrayList<T>(); 
	
	@Override
	public String toString() {
		String strAlunos = "";
		for(T aluno : alunos)
			strAlunos += aluno.toString();
		return "Nome: " + nome + " Alunos: " + strAlunos;
	}
	
}
