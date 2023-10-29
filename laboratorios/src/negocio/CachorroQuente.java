package negocio;

public class CachorroQuente {

	private Queijo queijo;
	private Proteina proteina;
	private Bebida bebida;
	private Adicionais adicionais;
	
	public CachorroQuente(Queijo queijo, Proteina proteina, Bebida bebida, Adicionais adicionais) {
		
		this.queijo = queijo;
		this.proteina = proteina;
		this.bebida = bebida;
		this.adicionais = adicionais;
		
		
	}

	public Queijo getQueijo() {
		return queijo;
	}

	public void setQueijo(Queijo queijo) {
		this.queijo = queijo;
	}

	public Proteina getProteina() {
		return proteina;
	}

	public void setProteina(Proteina proteina) {
		this.proteina = proteina;
	}

	public Bebida getBebida() {
		return bebida;
	}

	public void setBebida(Bebida bebida) {
		this.bebida = bebida;
	}

	public Adicionais getAdicionais() {
		return adicionais;
	}

	public void setAdicionais(Adicionais adicionais) {
		this.adicionais = adicionais;
	}
	
	
	
	
}
