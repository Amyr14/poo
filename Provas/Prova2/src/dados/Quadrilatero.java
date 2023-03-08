package dados;

public abstract class Quadrilatero extends FormaGeometrica {

    protected float lado1, lado2, lado3, lado4;

    public Quadrilatero(int x, int y, float lado1, float lado2, float lado3, float lado4) {
        this.x = x;
        this.y = y;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.lado4 = lado4;
    }

    public double getPerimetro() {
        return lado1 + lado2 + lado3 + lado4;
    }

}
