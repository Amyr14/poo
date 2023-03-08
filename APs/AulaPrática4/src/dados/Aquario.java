package dados;

public class Aquario extends Viveiro {
	
	private float altura;
	private float temperatura;
	
	public float calculaEspaco() {
		return comprimento * largura * altura;
	}
	
	public boolean adicioanarAnimal(Peixe peixe) {
		if ( areaDisponivel() <= peixe.calculaEspacoOcupado() * 1.7
			|| temperatura - peixe.getTemperaturaIdeal() >= 3
			|| temperatura - peixe.getTemperaturaIdeal() <= -3 )
			return false;
		
		animais.add(peixe);
		return true;
	}
	
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public float getAltura() {
		return altura;
	}
	
	public void setTemperatura(float temperatura) {
		this.temperatura = temperatura;
	}
	
	public float getTemperatura() {
		return temperatura;
	}
	
}

