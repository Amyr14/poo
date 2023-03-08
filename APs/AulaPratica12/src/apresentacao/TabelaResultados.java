package apresentacao;
import javax.swing.table.AbstractTableModel;
import dados.CalculadoraEstatistica;

public class TabelaResultados extends AbstractTableModel {
	
	private String[] colunas = { "Sorteado", "Somatorio", "Média Aritmética",
								 "Média Geométrica", "Variancia", "Desvio Padrão", "Amplitude" };
	
	private CalculadoraEstatistica calculadora = CalculadoraEstatistica.getInstance();
	
	@Override
	public int getColumnCount() {
		return colunas.length;
	}
	
	@Override
	public int getRowCount() {
		return 1;
	}
	
	@Override
	public Object getValueAt(int linha, int coluna) {
		if ( calculadora.getValores().isEmpty() )
			return "-";
		
		switch(coluna) {
			case 0:
				return calculadora.sortear();
			case 1:
				return calculadora.somatorio();
			case 2:
				return calculadora.mediaAritmetica();
			case 3:
				return calculadora.variancia();
			case 4:
				return calculadora.desvioPadrao();
			case 5:
				return calculadora.amplitude();
		}
		
		return null;
	}
	
	@Override
	public String getColumnName(int coluna) {
		return colunas[coluna];
	}
	
	public void atualizar() {
		fireTableStructureChanged();
	}
}
