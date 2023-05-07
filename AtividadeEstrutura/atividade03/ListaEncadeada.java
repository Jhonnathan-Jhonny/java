package atividade03;

import java.io.IOException;

public class ListaEncadeada implements ListaEncadeada_IF {
	
	Node NIL = new Node();
	protected Node head;
	int size = 0;
	
	public ListaEncadeada() {
		head = new Node();
	}
	
	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public int search(int element) throws Exception {
		if(isEmpty()) {
			throw new IOException("Lista vazia");
		}
		int index = 0;
		Node auxHead = head;
		while(auxHead != NIL) {
			if(auxHead.getDado() == element) {
				return index;
			}
			index++;
			auxHead = auxHead.getProximo();
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
		}
		else {
			if(head == NIL){
				while(auxHead.getProximo()!= NIL) {
					auxHead = auxHead.getProximo();
				}
			}
			Node newNode = new Node(element);
			newNode.setProximo(auxHead.getProximo());
			auxHead.setProximo(newNode);
		}
		size++;
	}

	@Override
	public void remove(int element) {
		if(isEmpty()) {
			return;
		}
		if(head.getDado() == element) {
			head = head.getProximo();
			size--;
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
				size--;
			}
		}
	}

	@Override
	public int[] toArray() {
		int[] result = new int[size];
		Node aux = head;
		int contador = 0;
		while(aux != NIL) {
			result[contador]= aux.getDado();
			aux = aux.getProximo();
			contador++;
		}
		return result;
	}
	  
}