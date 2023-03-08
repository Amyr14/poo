package dados;

public class Circulo extends FormaGeometrica {

    private float raio;

    public Circulo(int x, int y, float raio) {
        this.x = x;
        this.y = y;
        this.raio = raio;
    }

    public double getPerimetro() {
        return 2 * Math.PI * raio;
    }

    public double getArea() {
        return Math.PI * Math.pow(raio, 2);
    }

}
