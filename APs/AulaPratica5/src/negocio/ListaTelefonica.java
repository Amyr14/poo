
package negocio;
import dados.Contato;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class ListaTelefonica {
	
	private List<Contato> contatos = new ArrayList<Contato>();
	
	public void adicionarContato(Contato c) {
		contatos.add(c);
	}
	
	public void removerContato(Contato c) {
		contatos.remove(c);
	}
	
	public List<Contato> buscarContatos(char letra){
		List<Contato> temp = new ArrayList<Contato>();
		for(Contato c : contatos)
			if ( c.getNome().charAt(0) == letra )
				temp.add(c);
		return temp;
	}
	
	public Map<Character, List<Contato>> buscarContatos(){
		String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		Map<Character, List<Contato>> hash = new HashMap<Character, List<Contato>>();
		for(int i = 0; i < 26; i++) {
			char letra = alfabeto.charAt(i);
			hash.put(letra, buscarContatos(letra));
		}
		return hash;
	}
}
