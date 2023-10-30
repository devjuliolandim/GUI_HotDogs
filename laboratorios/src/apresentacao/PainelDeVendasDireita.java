package apresentacao;

import negocio.*;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PainelDeVendasDireita extends JPanel implements ActionListener {

	private JTextField alunoNome = new JTextField(20);
	private JTextField matriculaTexto = new JTextField(20);

	private String[] queijos = { "Mussarela", "Parmesão", "Prato", "Coalho" };
	private JComboBox<String> comboBoxQueijos = new JComboBox(queijos);

	private String[] proteinas = { "Bacon", "Frango", "Linguiça", "Salsicha" };
	private JComboBox<String> comboBoxProteinas = new JComboBox(proteinas);

	private String[] bebidas = { "Coca-Cola", "Fanta", "Suco do Chaves" };
	private JComboBox<String> comboBoxBebidas = new JComboBox(bebidas);

	private Botao realizarVenda = new Botao("Realizar Venda");

	private OpcoesDeAdicionais opcoesAdicionais = new OpcoesDeAdicionais();

	private String nome;
	private int matricula;

	private Proteina proteina = new Proteina();
	private Queijo queijo = new Queijo();
	private Adicionais adicionais = new Adicionais();
	private ArrayList<String> adicionaisEscolhidos = new ArrayList<>();
	private Bebida bebida = new Bebida();
	private ArrayList<Pedidos> pedidos = new ArrayList<>();
	private Memoria memoria = new Memoria();

	public PainelDeVendasDireita() {

		this.setBackground(Color.decode("#007e80"));
		this.setLayout(new GridLayout(7, 1));

		organizador();

		realizarVenda.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				Aluno aluno = criarAluno();
				CachorroQuente cachorroQuente = criarCachorroQuente();
				Pedidos pedido = new Pedidos(aluno, cachorroQuente);
				pedidos.add(pedido);
				memoria.setPedidos(pedidos);

				limparDados();

			}

			private CachorroQuente criarCachorroQuente() {
				queijo.setTipoQueijo(comboBoxQueijos.getSelectedItem().toString());
				proteina.setTipoProteina(comboBoxProteinas.getSelectedItem().toString());
				escolherAdicionais();
				adicionais.setAdicionais(adicionaisEscolhidos);
				bebida.setTipoBebida(comboBoxBebidas.getSelectedItem().toString());
				CachorroQuente cachorroQuente = new CachorroQuente(queijo, proteina, bebida, adicionais);

				return cachorroQuente;
			}

			private Aluno criarAluno() {
				nome = (alunoNome.getText());
				matricula = (Integer.parseInt(matriculaTexto.getText()));
				Aluno aluno = new Aluno(nome, matricula);
				return aluno;
			}

			private void escolherAdicionais() {
				if (opcoesAdicionais.maionese.isSelected())
					adicionaisEscolhidos.add("Maionese");
				if (opcoesAdicionais.ovo.isSelected())
					adicionaisEscolhidos.add("Ovo");
				if (opcoesAdicionais.ketchup.isSelected())
					adicionaisEscolhidos.add("Ketchup");
				if (opcoesAdicionais.batataPalha.isSelected())
					adicionaisEscolhidos.add("Batata Palha");
			}

			private void limparDados() {
				alunoNome.setText("");
				matriculaTexto.setText("");
				comboBoxBebidas.setSelectedIndex(0);
				comboBoxProteinas.setSelectedIndex(0);
				comboBoxQueijos.setSelectedIndex(0);
				opcoesAdicionais.getMaionese().setSelected(false);
				opcoesAdicionais.getOvo().setSelected(false);
				opcoesAdicionais.getBatataPalha().setSelected(false);
				opcoesAdicionais.getKetchup().setSelected(false);
			}
		});

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

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
