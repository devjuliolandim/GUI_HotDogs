package apresentacao;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import negocio.*;

public class ListarVendas extends JPanel {

	DefaultTableModel model = new DefaultTableModel();
	JTable table = new JTable(model);
	JScrollPane scrollPane = new JScrollPane(table);
	Memoria memoria = new Memoria();

	public ListarVendas() {

		
		
		
		this.setBackground(Color.decode("#004853"));

		addColumns();

		for (Pedidos pedidos : memoria.getPedidos()) {
			Object[] row = {

					pedidos.getAluno().getNome(), pedidos.getAluno().getMatricula(),
					pedidos.getCachorroQuente().getQueijo().getTipoQueijo(), pedidos.getCachorroQuente().getProteina().getTipoProteina(),
					pedidos.getCachorroQuente().getAdicionais().getAdicionais(), pedidos.getCachorroQuente().getBebida().getTipoBebida()

			};

			model.addRow(row);
		}

		add(scrollPane);

	}

	private void addColumns() {
		model.addColumn("Nome do Cliente");
		model.addColumn("Matrícula");
		model.addColumn("Op. Queijo");
		model.addColumn("Op. Proteína");
		model.addColumn("Op. Adicionais");
		model.addColumn("Op. Bebida");
	}

}
