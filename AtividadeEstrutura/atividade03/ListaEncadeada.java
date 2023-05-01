package atividade03;

public class ListaEncadeada implements ListaEncadeada_IF {
	
	Node NIL = new Node(-1);
	protected Node head;
	protected Node tail;
	int tamanho;

	@Override
	public boolean isEmpty() {
		if (head == NIL) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int size() {
		return tamanho;
	}

	@Override
	public int search(int element) throws Exception {
		int index = 0;
		Node x = head;
		while(x != NIL) {
			if(x.getDado() == element) {
				return index;
			}
			index++;
			x = x.getProximo();
		}
		return -1;
	}

	@Override
	public void insert(int element) {
		Node auxHead = head;
		if(head == NIL) {
			Node newHead = new Node(element);
			newHead.setProximo(head);
			head = newHead;
			tamanho++;
		}
		else {
			while(auxHead.getProximo() != NIL) {
				auxHead = auxHead.getProximo();
			}
			Node newNode = new Node(element);
			newNode.setProximo(auxHead.getProximo());
			auxHead.setProximo(newNode);
			tamanho++;
		}
	}

	@Override
	public void remove(int element) {
		if(head.getDado() == element) {
			head = head.getProximo();
			tamanho--;
		}
		else {
			Node anterior = null;
			Node aux = head;
			while(aux != NIL && aux.getDado() != element) {
				anterior = aux;
				aux = aux.getProximo();
			}
			if(aux != NIL) {
				anterior.setProximo(aux.getProximo()); 
			}
		}
	}

	@Override
	public int[] toArray() {
		int[] result = (int[]) new Object();
		Node aux = head;
		int contador = 0;
		while(aux != NIL) {
			result[contador] = aux.getDado();
			aux = aux.getProximo();
			contador++;
		}
		return result;
	}
	  
}