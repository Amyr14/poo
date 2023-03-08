package dados;

public class Peixe extends Animal {
	
	private float temperaturaIdeal;
	
	public float calculaEspacoOcupado() {
		return largura * comprimento * altura;
	}
	
	public void setTemperaturaIdeal(float temperaturaIdeal) {
		this.temperaturaIdeal = temperaturaIdeal;
	}
	
	public float getTemperaturaIdeal() {
		return temperaturaIdeal;
	}
	
	public String toString() {
		return " [Nome: não possui " + "Temperatura Ideal: " + temperaturaIdeal + "] ";
	}
	
}
