package apresentacao;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class Header extends JPanel implements ActionListener {

	public Botao realizarVenda;
	public Botao listarVendas;
	public Botao listarClientes;
	public Botao mostrarRelatorio;

	public Header() {

		this.setLayout(new GridLayout(1, 4));
		this.setBackground(Color.DARK_GRAY);
		this.setPreferredSize(new Dimension(50, 50));
		this.setBorder(new LineBorder(Color.white, 1));

		instancias();
		adicionarBotoes();
	}

	private void instancias() {

		realizarVenda = new Botao("Realizar Vendas");
		listarVendas = new Botao("Listar Vendas");
		listarClientes = new Botao("Listar Clientes");
		mostrarRelatorio = new Botao("Mostrar Relatorio");

		realizarVenda.addActionListener(this);
		listarClientes.addActionListener(this);
		listarVendas.addActionListener(this);
		mostrarRelatorio.addActionListener(this);

	}

	private void adicionarBotoes() {

		add(realizarVenda);
		add(listarVendas);
		add(mostrarRelatorio);
		add(listarClientes);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == realizarVenda) {

			Janela.cardLayout.show(Janela.cardPanel, "vendas");

		} else if (e.getSource() == listarVendas) {
			Janela.cardLayout.show(Janela.cardPanel, "listar Vendas");
		} else if (e.getSource() == listarClientes) {
			Janela.cardLayout.show(Janela.cardPanel, "listar Clientes");
		} else if (e.getSource() == mostrarRelatorio) {
			Janela.cardLayout.show(Janela.cardPanel, "mostrar Relatório");
		}

	}

}
