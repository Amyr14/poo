package dados;

public class Quadrado extends Quadrilatero {

    public Quadrado(int x, int y, float lado) {
        super(x, y, lado, lado, lado, lado);
    }

    public double getArea() {
        return lado1 * lado2;
    }

}
