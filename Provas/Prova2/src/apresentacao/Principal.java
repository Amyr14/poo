package apresentacao;
import dados.*;
import negocio.GerenciadorFormasGeometricas;

import java.util.Scanner;

public class Principal {

    public static Scanner scanner = new Scanner(System.in);
    public static GerenciadorFormasGeometricas gerenciador = new GerenciadorFormasGeometricas();

    public static void main(String[] args) {
        int opcao;
        do {
            opcao = menu();
            switch (opcao) {
                case 1 -> gerenciador.addFormaGeometrica(criaQuadrado());
                case 2 -> gerenciador.addFormaGeometrica(criaRetangulo());
                case 3 -> gerenciador.addFormaGeometrica(criaCirculo());
                case 4 -> gerenciador.addFormaGeometrica(criaTriangulo());
                case 5 -> gerenciador.salvarNoArquivo();
                default -> System.out.println("Opção Inválida!");
            }
        } while( opcao != 0 );
    }

    public static int menu() {
        System.out.println("-----Gerenciador de Formas Geométricas-----");
        System.out.println("0 - Sair");
        System.out.println("1 - Criar Quadrado");
        System.out.println("2 - Criar Retângulo");
        System.out.println("3 - Criar Circulo");
        System.out.println("4 - Criar Triângulo Equilátero");
        System.out.println("5 - Salvar No Arquivo");
        System.out.print("Selecione uma das opções: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public static void printAreaEPerimetro(FormaGeometrica f) {
        System.out.println("Area: " + f.getArea());
        System.out.println("Perímetro: " + f.getPerimetro());
    }

    public static Quadrado criaQuadrado() {
        int x, y;
        float lado;

        System.out.print("Informe a coordenada x: ");
        x = Integer.parseInt(scanner.nextLine());
        System.out.print("Informe a coordenada y: ");
        y = Integer.parseInt(scanner.nextLine());
        System.out.print("Informe o lado: ");
        lado = Float.parseFloat(scanner.nextLine());

        return new Quadrado(x, y, lado);
    }

    public static Retangulo criaRetangulo() {
        int x, y;
        float base, altura;

        System.out.print("Informe a coordenada x: ");
        x = Integer.parseInt(scanner.nextLine());
        System.out.print("Informe a coordenada y: ");
        y = Integer.parseInt(scanner.nextLine());
        System.out.print("Informe a base: ");
        base = Float.parseFloat(scanner.nextLine());
        System.out.print("Informe a altura: ");
        altura = Float.parseFloat(scanner.nextLine());

        return new Retangulo(x, y, altura, base);
    }

    public static Circulo criaCirculo() {
        int x, y;
        float raio;

        System.out.print("Informe a coordenada x: ");
        x = Integer.parseInt(scanner.nextLine());
        System.out.print("Informe a coordenada y: ");
        y = Integer.parseInt(scanner.nextLine());
        System.out.print("Informe o raio: ");
        raio = Float.parseFloat(scanner.nextLine());

        return new Circulo(x, y, raio);
    }

    public static TrianguloEquilatero criaTriangulo() {
        int x, y;
        float lado;

        System.out.print("Informe a coordenada x: ");
        x = Integer.parseInt(scanner.nextLine());
        System.out.print("Informe a coordenada y: ");
        y = Integer.parseInt(scanner.nextLine());
        System.out.print("Informe o lado: ");
        lado = Float.parseFloat(scanner.nextLine());

        return new TrianguloEquilatero(x, y, lado);
    }
}
