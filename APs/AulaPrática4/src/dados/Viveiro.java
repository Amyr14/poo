package dados;
import java.util.ArrayList;

public class Viveiro {
	
	protected float comprimento;
	protected float largura;
	protected ArrayList<Animal> animais = new ArrayList<Animal>();
	
	private float espacoOcupado() {
		float espaco = 0;
		for(Animal animal : animais)
			espaco += animal.calculaArea();
		return espaco;
	}
	
	public float calculaEspaco() {
		return comprimento * largura;
	}
	
	public float areaDisponivel() {
		return calculaEspaco() - espacoOcupado();
	}
	
	public boolean adicionalAnimal(Animal animal) {
		if ( areaDisponivel() <= animal.calculaArea() * 1.7 )
			return false;
		animais.add(animal);
		return true;
	}

	public float getComprimento() {
		return comprimento;
	}

	public void setComprimento(float comprimento) {
		this.comprimento = comprimento;
	}

	public float getLargura() {
		return largura;
	}

	public void setLargura(float largura) {
		this.largura = largura;
	}

	public ArrayList<Animal> getAnimais() {
		return animais;
	}
	
	@Override
	public String toString() {
		String strAnimais = " Animais: ";
		if ( animais.isEmpty() )
			strAnimais += "viveiro vazio";
		else 
			for(Animal a : animais)
				strAnimais += a.toString();
		return strAnimais;
	}
	
}
