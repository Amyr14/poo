
import java.util.Scanner;

public class aula {

	public static void main(String[] args) {
	
		int[] valores = new int[5];
		float media = 0;
		Scanner entrada = new Scanner(System.in);
		for( int i = 0; i < 5; i++ ) {
			System.out.printf("Insira o %d* valor: ", i + 1);
			valores[i] = Integer.valueOf(entrada.nextLine());
			media += valores[i];
		}
		entrada.close();
		media = media / 5;
		System.out.println("Media: " + media);
	} 

}
