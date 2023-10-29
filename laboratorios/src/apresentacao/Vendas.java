package apresentacao;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Vendas extends JPanel {

	PainelDeVendasEsquerda vendasEsquerda;

	PainelDeVendasDireita vendasDireita;

	public Vendas() {

		this.setBackground(Color.decode("#007e80"));
		this.setLayout(new GridLayout(1, 2));
		
		organizador();

	}

	private void organizador() {

		vendasEsquerda = new PainelDeVendasEsquerda();
		vendasDireita = new PainelDeVendasDireita();

		add(vendasEsquerda);
		add(vendasDireita);
	}

}
