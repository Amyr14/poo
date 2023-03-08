
package negocio;
import dados.Animal;
import dados.Viveiro;
import dados.Aquario;
import java.util.ArrayList;
import exceptions.EspacoIndisponivelException;

public class Zoologico {
	
	private ArrayList<Viveiro> viveiros = new ArrayList<Viveiro>();
	private ArrayList<Animal> animais = new ArrayList<Animal>();

	public void cadastrarViveiro(Viveiro viveiro) {
		viveiros.add(viveiro);
	}
	
	public void cadastrarAnimal(Animal animal) {
		animais.add(animal);
	}
	
	public ArrayList<Viveiro> getSoViveiros(){
		return viveiros;
	}
	
	public ArrayList<Aquario> getSoAquarios(){
		
		ArrayList<Aquario> aquarios = new ArrayList<Aquario>();
		
		for(Viveiro viveiro : viveiros)
			if ( viveiro instanceof Aquario )
				aquarios.add((Aquario)viveiro);
		
		return aquarios;
	}
	
	public void alocarAnimal(Animal animal, Viveiro viveiro) throws EspacoIndisponivelException {
		if ( !viveiro.adicionalAnimal(animal) )
			throw new EspacoIndisponivelException("Espaço Indisponível!");
	}
	
	public ArrayList<Animal> getAnimais(){
		return animais;
	}
	
}
