package pkg;
import java.util.List;
import java.util.ArrayList;

public class Principal {
	
	SistemaArquivos sistema = new SistemaArquivos();

	public static void main(String[] args) {
		try {
			Musica musica1 =  new Musica("Musica1", 3);
		} catch(NomeInvalidoException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			Documento documento1 = new Documento("Documento1{", "Eu sou o documento1");
		} catch (NomeInvalidoException e) {
			System.out.println(e.getMessage());
		}
	}

}
