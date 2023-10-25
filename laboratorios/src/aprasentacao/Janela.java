package aprasentacao;


import java.awt.Color;


import javax.swing.*;

//import java.awt.Color;
//import java.awt.Font;

public class Janela extends JFrame {

	private Header header;
	private PainelPrincipal painelPrincipal;
	private PainelSecundario painelSecundario;

	
	
	public Janela() {

		instancias();

		this.setTitle("Sistema de Venda de Cachorro-Quente");
		this.setSize(800, 800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLayout(null);
		
		
		
		adicionarPaineis();
		setVisible(true);
	}

	private void adicionarPaineis() {
		add(header);
		add(painelPrincipal);
		add(painelSecundario);
	}

	private void instancias() {

		
		header = new Header();
		painelPrincipal = new PainelPrincipal();
		painelSecundario = new PainelSecundario();
	}


}
