package pkg;

public class Losango extends FormaGeometrica {
	
	public double calculaArea() {
		return (medida1 * medida2) / 2;
	}
	
	public double calculaPerimetro() {
		return 4 * Math.sqrt((Math.pow(medida1, 2) + Math.pow(medida2, 2))/4);
	}
	
	public void setD(double D) {
		this.medida1 = D;
	}
	
	public void setd(double d) {
		this.medida2 = d;
	}
	
	@Override
	public String toString() {
		return "D: " + medida1 + " d: " + medida2 + " Area: "
				+ calculaArea() + " Perimetro: " + calculaPerimetro();
	}
}
