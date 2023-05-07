package atividade03;

import java.io.IOException;

public class ListaEncadeada implements ListaEncadeada_IF {
	
	Node NIL = null;
	protected Node head;
	protected Node tail;
	int size = 0;

	@Override
	public boolean isEmpty() {
		if (size == 0) {
			return true;
		}
		else {
			return false;
		}
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
		Node newNode = new Node(element);
		if(head == NIL) {
			head = newNode;
			tail = newNode;
		}
		else {
			tail.setProximo(newNode);
			while(tail.getProximo() != NIL) {
				tail = tail.getProximo();
			}
			tail.setProximo(newNode);
			newNode.setAnterior(tail);
			tail = newNode;
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
		if(tail.getDado() == element) {
			tail = tail.getAnterior();
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
			result[contador] = aux.getDado();
			aux = aux.getProximo();
			contador++;
		}
		return result;
	}
	  
}