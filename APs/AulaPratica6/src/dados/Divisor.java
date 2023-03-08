
package dados;
import java.util.ArrayList;

public class Divisor {
	
	public ArrayList<Integer> divisores(int n) {
		ArrayList<Integer> divisores = new ArrayList<Integer>();
		divisores.add(1);
		for(int i = n - 1; i > 0; i--)
			if ( n % i == 0 )
				divisores.add(i);
		return divisores;
	}
}
