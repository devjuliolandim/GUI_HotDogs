package negocio;

import java.util.ArrayList;

public class Memoria {

	private ArrayList<Pedidos> pedidos = new ArrayList<>();

	public Memoria() {

	}

	public ArrayList<Pedidos> getPedidos() {
		return pedidos;
	}

	public void setPedidos(ArrayList<Pedidos> pedidos) {
		this.pedidos = pedidos;
	}

}
