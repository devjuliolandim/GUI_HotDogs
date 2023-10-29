package apresentacao;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JCheckBox;
import javax.swing.JPanel;

public class OpcoesDeAdicionais extends JPanel{

	CheckBoxCustomizada maionese = new CheckBoxCustomizada("<html><font color='white'><b>Maionese</html>");
	CheckBoxCustomizada ovo = new CheckBoxCustomizada("<html><font color='white'><b>Ovo</html>");
	CheckBoxCustomizada ketchup = new CheckBoxCustomizada("<html><font color='white'><b>Ketchup</html>");
	CheckBoxCustomizada batataPalha = new CheckBoxCustomizada("<html><font color='white'><b>Batata Palha</html>");
	
	
	public OpcoesDeAdicionais() {
		
		this.setLayout(new GridLayout(2,2));
		this.setBackground(Color.orange);
		
		add(maionese);
		add(ovo);
		add(ketchup);
		add(batataPalha);
	}


	public CheckBoxCustomizada getMaionese() {
		return maionese;
	}


	public void setMaionese(CheckBoxCustomizada maionese) {
		this.maionese = maionese;
	}


	public CheckBoxCustomizada getOvo() {
		return ovo;
	}


	public void setOvo(CheckBoxCustomizada ovo) {
		this.ovo = ovo;
	}


	public CheckBoxCustomizada getKetchup() {
		return ketchup;
	}


	public void setKetchup(CheckBoxCustomizada ketchup) {
		this.ketchup = ketchup;
	}


	public CheckBoxCustomizada getBatataPalha() {
		return batataPalha;
	}


	public void setBatataPalha(CheckBoxCustomizada batataPalha) {
		this.batataPalha = batataPalha;
	}
	
	
	
	
	
}
