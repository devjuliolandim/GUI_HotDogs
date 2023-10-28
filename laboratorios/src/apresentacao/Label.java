package apresentacao;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

public class Label extends JLabel {

	public Label(String nome) {
		this.setText(nome);
		this.setFont(new Font("Arial", Font.BOLD, 16));
		this.setForeground(Color.white);
		
	}
	
	
}
