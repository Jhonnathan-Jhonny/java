package atividade03;

public class PilhaComLista implements Pilha_IF {
	
	ListaEncadeada lista = new ListaEncadeada();
	
	public final int CAPACIDADEDALISTA = 10;

	@Override
	public void push(int element) throws Exception {
		if(isFull()) {
			throw new Exception("Pilha Cheia");
		}
		if(element >= 0) {
			lista.insert(element);
		}
			
	}

	@Override
	public int pop() throws Exception {
        if(isEmpty()) {
        	throw new Exception("Pilha Vazia");
        }
        int dado = top();
        lista.remove(dado);
        return dado;
	}

	@Override
	public int top() throws Exception {
		if(isEmpty()) {
			throw new Exception("Topo inexistente.");
		}
		return lista.head.getDado();
	}

	@Override
	public boolean isEmpty() {
		return lista.size() == 0;
	}

	@Override
	public boolean isFull() {
		return lista.size() == CAPACIDADEDALISTA;
	}
	  
}