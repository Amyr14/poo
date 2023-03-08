
package pkg;
import java.util.List;
import java.util.ArrayList;
import pkg.Aluno;
import java.util.Collections;

public class Turma {
	
	private List<Aluno> alunos;
	
	public void adicionarAluno(Aluno a) {
		alunos.add(a);
		ordenaAlunosPorMedia();
	}
	
	private void ordenaAlunosPorMedia() {
		Collections.sort(alunos);
	}
	
	
}
