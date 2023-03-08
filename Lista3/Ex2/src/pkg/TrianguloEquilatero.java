package pkg;

public class TrianguloEquilatero extends FormaGeometrica {
	
	public double calculaArea() {
		return ( Math.sqrt(3)/4 ) * Math.pow(medida1, 2);
	}
	
	public double calculaPerimetro() {
		return medida1 * 3;
	}
	
	public void setLado(double lado) {
		this.medida1 = lado;
	}
	
	@Override
	public String toString() {
		return "Lado: " + medida1 + " Area: "
				+ calculaArea() + " Perimetro: " + calculaPerimetro();
	}
	
}
