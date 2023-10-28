package apresentacao;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JCheckBox;

public class CheckBoxCustomizada extends JCheckBox {

	public CheckBoxCustomizada(String text) {
		super(text);
		setOpaque(false);
		setBackground(Color.decode("#007e80"));

	}

	protected void paintComponent(Graphics g) {
		g.setColor(getBackground());
		g.fillRect(0, 0, getWidth(), getHeight());
		super.paintComponent(g);
	}

}
