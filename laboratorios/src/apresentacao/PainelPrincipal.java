package apresentacao;


import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

public class PainelPrincipal extends JPanel {

	public PainelPrincipal(Color color) {

		this.setBackground(color);
		
		JLabel label = new JLabel("Bem-Vindo!");
	
		label.setFont(new Font("Arial", Font.BOLD, 26));
		
		add(label);
	}
	

}
