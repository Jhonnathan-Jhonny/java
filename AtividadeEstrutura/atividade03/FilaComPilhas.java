package atividade03;

import java.io.IOException;

public class FilaComPilhas implements Fila_IF {
	
	PilhaComLista p1 = new PilhaComLista();
	PilhaComLista p2 = new PilhaComLista();
	
	FilaComPilhas f1;

	@Override
	public void enqueue(int element) throws Exception {
		if(p1.isFull()) {
			throw new IOException("Lista Cheia.");
		}
		else {
			p1.push(element);
		}
	}

	@Override
	public int dequeue() throws Exception {
		if(p1.isEmpty()) {
			throw new IOException("Lista Vazia.");
		}
		else {
			while(!p1.isEmpty()) {
				p2.push(p1.pop());
			}
			
			int retorno = p2.pop();
			
			while(!p2.isEmpty()) {
				p1.push(p2.pop());
			}
			
			return retorno;
		}
	}

	@Override
	public int head() throws Exception {
		
		if(p1.isEmpty()) {
			throw new IOException("Cabeça inexistente.");
		}
		else {
			while(!p1.isEmpty()) {
				p2.push(p1.pop());
			}
			int cabeca = p2.top();
			
			while(!p2.isEmpty()) {
				p1.push(p2.pop());
			}
			return cabeca;
		}
	}

	@Override
	public boolean isEmpty(){
		return p1.isEmpty();
	}

	@Override
	public boolean isFull() {
		return p1.isFull();
	}
	  
}
