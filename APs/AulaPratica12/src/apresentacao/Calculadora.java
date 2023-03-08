package apresentacao;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.Container;
import java.awt.GridLayout;


public class Calculadora extends JFrame {

	private JPanel conteudo = new JPanel();
	private JPanel painelEntrada = new JPanel();
	private JScrollPane resultados = new JScrollPane();
	private JScrollPane valores = new JScrollPane();
	private JLabel infoTexto = new JLabel("Digite um valor:");
	private JTextField caixaTexto = new JTextField();
	private JButton botaoAdicionar = new JButton("Adicionar");
	
	public Calculadora() {
		setTitle("Calculadora Estatística");
		setBounds(100, 100, 900, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setContentPane(conteudo);
		conteudo.setLayout(null);
		resultados.add(new JTable(new TabelaResultados()));
		valores.add(new JTable(new TabelaValores()));
		painelEntrada.setBounds(15, 80, 280, 173);
		painelEntrada.setLayout(null);
		infoTexto.setBounds(30, 30, 200, 15);
		caixaTexto.setBounds(30, 50, 200, 20);
		botaoAdicionar.setBounds(77, 94, 117, 25);
		painelEntrada.add(infoTexto);
		painelEntrada.add(caixaTexto);
		painelEntrada.add(botaoAdicionar);
		
		
	}

}
