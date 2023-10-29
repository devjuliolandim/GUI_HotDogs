package negocio;

public class Pedidos {

	private Aluno aluno;
	private CachorroQuente cachorroQuente;
	
	public Pedidos(Aluno aluno, CachorroQuente cachorroQuente) {
		this.aluno = aluno;
		this.cachorroQuente= cachorroQuente;
		
		
		
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public CachorroQuente getCachorroQuente() {
		return cachorroQuente;
	}

	public void setCachorroQuente(CachorroQuente cachorroQuente) {
		this.cachorroQuente = cachorroQuente;
	}
	
	
	
	
}
