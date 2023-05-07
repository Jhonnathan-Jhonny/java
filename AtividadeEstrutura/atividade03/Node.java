package atividade03;

public class Node {
	private int dado;
	private Node proximo;
	private Node anterior;

	public Node(int dado) {
		this.dado = dado;
		this.proximo = null;
		this.anterior = null;
	}

	public Node getAnterior() {
		return anterior;
	}

	public void setAnterior(Node anterior) {
		this.anterior = anterior;
	}

	public int getDado() {
		return dado;
	}

	public void setDado(int dado) {
		this.dado = dado;
	}

	public Node getProximo() {
		return proximo;
	}

	public void setProximo(Node proximo) {
		this.proximo = proximo;
	}
	
	public boolean isNIL () {
		return (this.dado == -1);
	}
}