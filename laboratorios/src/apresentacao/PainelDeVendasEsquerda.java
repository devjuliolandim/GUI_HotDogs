package apresentacao;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class PainelDeVendasEsquerda extends JPanel {

	Label nomeCliente = new Label("Nome do Cliente:");
	Label matricula = new Label("Matrícula:");
	Label opcaoQueijo = new Label("Opção do Queijo:");
	Label opcaoProteina = new Label("Opção de Proteína:");
	Label adicionais = new Label("Escolha o seu adicional:");
	Label bebida = new Label("Bebida:");

	public PainelDeVendasEsquerda() {

		this.setBackground(Color.decode("#007e80"));
		this.setLayout(new GridLayout(7, 1));

		organizador();

	}

	public void organizador() {

		add(nomeCliente);
		add(matricula);
		add(opcaoQueijo);
		add(opcaoProteina);
		add(adicionais);
		add(bebida);

	}

}
