package apresentacao;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ListarVendas extends JPanel {

	
	DefaultTableModel model = new DefaultTableModel();
	JTable table = new JTable(model);
	JScrollPane scrollPane = new JScrollPane(table);
	
	
	public ListarVendas() {
		
		this.setBackground(Color.decode("#004853"));
		
		addColumns();
		
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
