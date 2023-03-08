package pkg;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

public class SistemaArquivos {
	
	private Map<String, List<Arquivo>> diretorios = new HashMap<String, List<Arquivo>>();
	private List<Arquivo> arquivos = new ArrayList<Arquivo>();
	
	public void criarDocumento(String nome, String diretorio, String texto) throws NomeInvalidoException {
		//Testar se o nome é válido primeiro
		if (!diretorios.containsKey(diretorio))
			diretorios.put(diretorio, new ArrayList<Arquivo>());
		
		Arquivo arqNovo = new Documento(nome, texto);
		diretorios.get(diretorio).add(arqNovo);
		arquivos.add(arqNovo);
	}
	
	public void criarMusica(String nome, String diretorio, int duracao) throws NomeInvalidoException {
		//Testar se o nome é válido primeiro
		if (!diretorios.containsKey(diretorio))
			diretorios.put(diretorio, new ArrayList<Arquivo>());
		
		Arquivo arqNovo = new Musica(nome, duracao);
		diretorios.get(diretorio).add(arqNovo);
		arquivos.add(arqNovo);
	}
	
	public void criarVideo(String nome, String diretorio, Qualidade qualidade) throws NomeInvalidoException {
		//Testar se o nome é válido primeiro
		if (!diretorios.containsKey(diretorio))
			diretorios.put(diretorio, new ArrayList<Arquivo>());
		
		Arquivo arqNovo = new Video(nome, qualidade);
		diretorios.get(diretorio).add(arqNovo);
		arquivos.add(arqNovo);
	}
	
	@Override
	public String toString() {
		String arquivosStr = "-----Arquivos-----" + "\n";
		for(Arquivo arq : arquivos)
			arquivosStr += arq.toString() + "\n";
		return arquivosStr;
	}
}
