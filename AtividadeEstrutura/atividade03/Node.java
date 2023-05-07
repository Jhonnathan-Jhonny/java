package atividade03;

public class Node {
	private Integer dado;
	private Node proximo;

	public Node() {
	}
	
	public Node(Integer dado) {
        this.dado = dado;
        this.proximo = null;
	}

	public Integer getDado() {
		return dado;
	}

	public void setDado(Integer dado) {
		this.dado = dado;
	}

	public Node getProximo() {
		return proximo;
	}

	public void setProximo(Node proximo) {
		this.proximo = proximo;
	}
	
	public boolean isNIL() {
		return (dado == null);
	}	
}