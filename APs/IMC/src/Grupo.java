
public class Grupo {
	
	private int quantPessoas = 0;
	private Pessoa[] pessoas = new Pessoa[4];
	
	public void setPessoa( Pessoa pessoa ) {
		if ( quantPessoas < pessoas.length ) {
			pessoas[quantPessoas] = pessoa;
			quantPessoas++;
			ordPessoas();
		}
	}
	
	private void ordPessoas() {
		boolean ordenado = false;
		while( !ordenado ) {
			ordenado = true;
			for(int i = 0; i + 1 < quantPessoas; i++) 
				if ( pessoas[i + 1].getImc() > pessoas[i].getImc() ) {
					Pessoa temp;
					temp = pessoas[i];
					pessoas[i] = pessoas[i + 1];
					pessoas[i + 1] = temp;
					ordenado = false;
				}
		}
	}
	
	public void mostraPessoas() {
		for(int i = 0; i < quantPessoas; i++) {
			System.out.println("-------------");
			System.out.println("Nome: " + pessoas[i].getNome());
			System.out.println("Idade: " + pessoas[i].getIdade());
			System.out.println("Altura: " + pessoas[i].getAltura());
			System.out.println("Massa: " + pessoas[i].getMassa());
			System.out.println("IMC: " + pessoas[i].getImc());
			System.out.println("-------------");
		}
	}
}
