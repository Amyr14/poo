package pkg;

public class Circulo extends FormaGeometrica {
	
	public double calculaArea() {
		return Math.pow(Math.PI * medida1, 2);
	}
	
	public double calculaPerimetro() {
		return Math.PI * medida2;
	}
	
	public void setRaio(double raio) {
		medida1 = raio;
		medida2 = raio * 2;
	}
	
	@Override
	public String toString() {
		return "Raio: " + medida1 + " Diametro: " + medida2 + " Area: " +
				calculaArea() + " Perimetro: " + calculaPerimetro();
	}
	
}
