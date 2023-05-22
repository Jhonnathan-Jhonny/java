package atividade04;

public class Node {
	private int dado;
	private Node proximo;

//	Construtor	
	public Node(int dado) {
        this.dado = dado;
        this.proximo = null;
	}
	
//	Getter Setter

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
	
	public boolean isNIL() {
		return this.dado == -1;
	}
}