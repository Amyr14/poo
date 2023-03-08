package pkg;

public class Juiz {
	
	private String nome;
	private Pilha<Processo> processos;
	
	public Juiz(String nome, int limite) {
		this.nome = nome;
		processos = new Pilha<Processo>(limite);
	}
	
	public void cadastrarProcesso(Processo processo) throws PilhaCheiaException {
		processos.inserir(processo);
	}
	
	public String getNome() {
		return nome;
	}
	
}
