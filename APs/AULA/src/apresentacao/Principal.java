
package apresentacao;
import dados.*;

public class Principal {
	
	public static void main(String[] args) {
		
		Mercado mercado1 = new Mercado("Bistek");
		Mercado mercado2 = new Mercado("Angeloni");
		Gondola gondola1 = new Gondola("Limpeza");
		Gondola gondola2 = new Gondola("Laticíneos");
		Produto pao = new Produto("Pão de Forma", 123, (float)6.50, 30);
		Produto leite = new Produto("Leite", 321, (float)5.5, 35);
		
		Funcionario funcionario1 = new Funcionario("José Carlos", "Caixa", 1500);
		Funcionario funcionario2 = new Funcionario("Pedro Luís", "Faxineiro", 1650);
		Membro membro1 = new Membro("Amyr Allan", "09924260902", "01");
		Membro membro2 = new Membro("João Pedro", "09993049203", "02");
		
		
		System.out.println(funcionario1);
		System.out.println(funcionario2);
		System.out.println(mercado1);
		System.out.println(mercado2);
		System.out.println(gondola1);
		System.out.println(gondola2);
		System.out.println(pao);
		System.out.println(leite);
		System.out.println(membro1);
		System.out.println(membro2);
		
		funcionario1.setSalario(1640);
		funcionario2.setSalario(2000);
		mercado1.setNome("Mercadinho do Bairro");
		mercado1.setNome("Giassi");
		gondola1.setTipo("Padaria");
		gondola2.setTipo("Bebidas");
		pao.setPreco((float)7.50);
		leite.setPreco((float)6.50);
		membro1.setNome("Vinicius José");
		membro2.setNome("Roberto Carlos");
		
		System.out.println(funcionario1);
		System.out.println(funcionario2);
		System.out.println(mercado1);
		System.out.println(mercado2);
		System.out.println(gondola1);
		System.out.println(gondola2);
		System.out.println(pao);
		System.out.println(leite);
		System.out.println(membro1);
		System.out.println(membro2);
		

	}

}
