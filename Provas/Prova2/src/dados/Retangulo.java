package dados;


public class Retangulo extends Quadrilatero {

    public Retangulo(int x, int y, float altura, float base) {
        super(x, y, altura, altura, base, base);
    }

    public double getArea() {
        return lado1 * lado3;
    }

}
