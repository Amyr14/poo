package dados;

public class TrianguloEquilatero extends FormaGeometrica {

    private float lado;

    public TrianguloEquilatero(int x, int y, float lado) {
        this.x = x;
        this.y = y;
        this.lado = lado;
    }

    public double getPerimetro() {
        return lado * 3;
    }

    public double getArea() {
        return (Math.sqrt(3) * Math.pow(lado, 2))/4;
    }

}
