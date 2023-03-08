
public class Main {

	public static void main(String[] args) {
		
		Grupo grupo = new Grupo();
		Pessoa amyr = new Pessoa();
		Pessoa joao = new Pessoa();
		Pessoa cabral = new Pessoa();
		Pessoa vinicius = new Pessoa();
		
		amyr.setNome("Amyr");
		amyr.setAltura((float)1.83);
		amyr.setIdade(19);
		amyr.setMassa(74);
		
		joao.setNome("Joao");
		joao.setAltura((float)1.77);
		joao.setIdade(20);
		joao.setMassa(68);
		
		cabral.setNome("Cabral");
		cabral.setAltura((float)1.67);
		cabral.setIdade(19);
		cabral.setMassa(58);
		
		vinicius.setNome("Vinicius");
		vinicius.setAltura((float)1.78);
		vinicius.setIdade(19);
		vinicius.setMassa(73);
		
		grupo.setPessoa(amyr);
		grupo.setPessoa(joao);
		grupo.setPessoa(cabral);
		grupo.setPessoa(vinicius);
		
		grupo.mostraPessoas();
		
	}

}
