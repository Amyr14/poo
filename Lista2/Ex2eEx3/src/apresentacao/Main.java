
package apresentacao;
import dados.*;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	
	Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		Main main = new Main();
		Matriz<Integer> matriz = new Matriz<Integer>(5, 5);
		int input = 0;
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.printf("Digite o valor de matriz[%d][%d]: ", i, j);
				input = Integer.valueOf(main.scan.nextLine());
				if ( input == -1 )
					break;
				matriz.set(input, i, j);
			}
		if ( input == -1 )
			break;
		}
		List<Integer> primeiroQ = matriz.getElementosQuadrante(Quadrante.PRIMEIRO);
		List<Integer> segundoQ = matriz.getElementosQuadrante(Quadrante.SEGUNDO);
		List<Integer> terceiroQ = matriz.getElementosQuadrante(Quadrante.TERCEIRO);
		List<Integer> quartoQ = matriz.getElementosQuadrante(Quadrante.QUARTO);
		List<Integer> menores = new ArrayList<Integer>();
		menores.add(Collections.min(primeiroQ));
		menores.add(Collections.min(segundoQ));
		menores.add(Collections.min(terceiroQ));
		menores.add(Collections.min(quartoQ));
		System.out.println("O menor elemento da matriz é: " + Collections.min(menores));
	}

}
