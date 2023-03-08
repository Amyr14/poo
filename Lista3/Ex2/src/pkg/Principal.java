package pkg;
import java.util.List;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		List<FormaGeometrica> formas = new ArrayList<FormaGeometrica>();
		Circulo c1 = new Circulo();
		c1.setRaio(2);
		formas.add(c1);
		Circulo c2 = new Circulo();
		c2.setRaio(4);
		formas.add(c2);
		TrianguloEquilatero t1 = new TrianguloEquilatero();
		t1.setLado(3);
		formas.add(t1);
		TrianguloEquilatero t2 = new TrianguloEquilatero();
		t2.setLado(3.5);
		formas.add(t2);
		Losango l1 = new Losango();
		l1.setd(2);
		l1.setD(3);
		formas.add(l1);
		Losango l2 =  new Losango();
		l2.setd(2.5);
		l2.setD(3.5);
		formas.add(l2);
		for(FormaGeometrica f : formas)
			System.out.println(f);
		
	}

}
