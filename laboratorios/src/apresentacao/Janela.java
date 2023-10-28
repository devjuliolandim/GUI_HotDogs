package apresentacao;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.*;

public class Janela extends JFrame {

	private Header header;
	private PainelPrincipal painelPrincipal;
	private Vendas vendas;
	private ListarVendas listarVendas;
	private PainelPrincipal listarClientes;
	private PainelPrincipal mostrarRelatorio;
	public static JPanel cardPanel;
	public static CardLayout cardLayout;

	public Janela() {

		instancias();

		this.setTitle("Sistema de Venda de Cachorro-Quente");
		this.setSize(800, 700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLayout(new BorderLayout());
		this.setLocationRelativeTo(null);

		adicionarPaineis();
		organizador();

		setVisible(true);

	}

	private void adicionarPaineis() {
		add(header, BorderLayout.NORTH);
		add(cardPanel, BorderLayout.CENTER);
	}

	private void instancias() {

		cardLayout = new CardLayout();
		cardPanel = new JPanel(cardLayout);
		mostrarRelatorio = new PainelPrincipal(Color.orange);
		listarClientes = new PainelPrincipal(Color.pink);
		listarVendas = new ListarVendas();
		vendas = new Vendas();
		header = new Header();
		painelPrincipal = new PainelPrincipal(Color.white);

	}

	private void organizador() {

		cardPanel.add(painelPrincipal, "painel principal");
		cardPanel.add(vendas, "vendas");
		cardPanel.add(listarVendas, "listar Vendas");
		cardPanel.add(mostrarRelatorio, "mostrar Relatório");
		cardPanel.add(listarClientes, "listar Clientes");

		cardLayout.show(cardPanel, "menu");

	}

}
