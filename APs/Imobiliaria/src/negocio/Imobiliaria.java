
package negocio;
import dados.Imovel;
import java.util.ArrayList;

public class Imobiliaria {
	
	private String nome;
	private ArrayList<Imovel> imoveis = new ArrayList<Imovel>();
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public ArrayList<Imovel> getImoveis(){
		return imoveis;
	}
	
	public void registrarImovel(Imovel imovel) {
		imoveis.add(imovel);
	}
	
	public ArrayList<Imovel> filtrarPorArea(float area){
		
		boolean ordenado = false;
		ArrayList<Imovel> filtrados = new ArrayList<Imovel>();
		
		for(int i = 0; i < imoveis.size(); i++) 
			if ( imoveis.get(i).areaTotal() >= area )
				filtrados.add(imoveis.get(i));
		
		while( !ordenado ) {
			ordenado = true;
			for(int i = 0; i < filtrados.size(); i++)
				if ( filtrados.get(i + 1).getPreco() > filtrados.get(i).getPreco() ) {
					ordenado = false;
					Imovel temp = filtrados.get(i);
					filtrados.set(i, filtrados.get(i + 1));
					filtrados.set(i + 1, temp);
				}
		}
		
		return filtrados;
		
	}
	
	public String toString() {
		
		if ( imoveis.size() == 0 )
			return "Nenhum imóvel registrado";
		
		String stringImoveis = imoveis.get(0).toString() + "\n";

		for(int i = 0; i < imoveis.size(); i++)
			stringImoveis = stringImoveis + imoveis.get(i).toString() + "\n";
		
		return stringImoveis;
	}
}
