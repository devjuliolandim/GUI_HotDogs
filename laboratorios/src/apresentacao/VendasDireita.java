package apresentacao;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VendasDireita extends JPanel {

	JTextField alunoNome = new JTextField(20);
	JTextField matriculaTexto = new JTextField(20);
	
	String[] queijos = { "Mussarela", "Parmesão", "Prato", "Coalho" };
	JComboBox<String> comboBoxQueijos = new JComboBox(queijos);
	
	
	String[] proteinas = { "Bacon", "Frango", "Linguiça", "Salsicha" };
	JComboBox<String> comboBoxProteinas = new JComboBox(proteinas);
	
	String[] bebidas = {"Coca-Cola" , "Fanta", "Suco do Chaves"};
	JComboBox<String> comboBoxBebidas = new JComboBox(bebidas);
	
	Botao realizarVenda = new Botao("Realizar Venda");
	
	OpcoesDeAdicionais opcoesAdicionais = new OpcoesDeAdicionais();
	
	
	public VendasDireita() {

		this.setBackground(Color.decode("#007e80"));
		this.setLayout(new GridLayout(7, 1));

		organizador();

	}

	public void organizador() {
					
		add(alunoNome);
		add(matriculaTexto);
		add(comboBoxQueijos);
		add(comboBoxProteinas);
		add(opcoesAdicionais);
		add(comboBoxBebidas);
		add(realizarVenda);
		
	}
	
	

}
