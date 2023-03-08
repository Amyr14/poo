package apresentacao;
import javax.swing.table.AbstractTableModel;
import dados.CalculadoraEstatistica;

public class TabelaValores extends AbstractTableModel {
	
	private String[] colunas = { "Valores" };
	private CalculadoraEstatistica calculadora = CalculadoraEstatistica.getInstance();
	
	@Override
	public int getColumnCount() {
		return colunas.length;
	}
	
	@Override
	public int getRowCount() {
		return calculadora.getValores().size();
	}
	
	@Override
	public String getColumnName(int coluna) {
		return colunas[coluna];
	}
	
	@Override
	public Object getValueAt(int linha, int coluna) {
		return calculadora.getValores().get(linha);
	}
	
	public void limpar() {
		calculadora.limparValores();
		fireTableStructureChanged();
	}
	
}
