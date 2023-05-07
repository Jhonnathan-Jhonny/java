package atividade03;

import java.io.IOException;

public class PilhaComLista implements Pilha_IF {
	
	ListaEncadeada lista = new ListaEncadeada();
	
	public int capacidadeDaLista = 100;
	public int size;
	public Node top;

	@Override
	public void push(int element) throws Exception {
		if(isFull()) {
			throw new IOException("Pilha Cheia");
		}
		Node novoNode = new Node(element);
		novoNode.setProximo(top);
		top = novoNode;
		size++;
	}

	@Override
	public int pop() throws Exception {
        if(isEmpty()) {
        	throw new IOException("Pilha Vazia");
        }
        int dado = top.getDado();
        lista.remove(dado);
        top = lista.tail;
        size--;
        return dado;
	}

	@Override
	public int top() throws Exception {
		if(isEmpty()) {
			throw new IOException("Topo inexistente.");
		}
		return top.getDado();
	}

	@Override
	public boolean isEmpty() {
		return size == -1;
	}

	@Override
	public boolean isFull() {
		return size == capacidadeDaLista;
	}
	  
}