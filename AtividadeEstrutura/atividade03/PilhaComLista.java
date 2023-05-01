package atividade03;

import java.io.IOException;

public class PilhaComLista implements Pilha_IF {
	
	public int capacidadeDaLista = 10;
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
        int data = top.getDado();
        top = top.getProximo();
        size--;
        return data;
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
		return size == 0;
	}

	@Override
	public boolean isFull() {
		return size == capacidadeDaLista;
	}
	  
}