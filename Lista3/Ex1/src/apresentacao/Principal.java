package apresentacao;
import dados.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
	
	static private Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		List<Animal> animais = new ArrayList<Animal>();
		Animal rex = new Cachorro();
		animais.add(rex);
		Animal jose = new Cachorro();
		animais.add(jose);
		Animal fluffy = new Gato();
		animais.add(fluffy);
		Animal jobim = new Gato();
		animais.add(jobim);
		Animal mimosa = new Vaca();
		animais.add(mimosa);
		Animal mimosa2 = new Vaca();
		animais.add(mimosa2);
		rex.setNome("Rex");
		jose.setNome("Jose");
		fluffy.setNome("Fluffy");
		jobim.setNome("Jobim");
		mimosa.setNome("Mimosa");
		mimosa2.setNome("Mimosa2");
		for(Animal a : animais)
			System.out.println(a.emitirSom());
	}
	
}
