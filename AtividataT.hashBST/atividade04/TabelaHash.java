package atividade04;

public class TabelaHash implements TabelaHash_IF {
	
	ListaEncadeada[] tabela;
	private int m;

	public TabelaHash(int m) {
		this.m = m;
		tabela = new ListaEncadeada[m];
        for (int i = 0; i < m; i++) {
            tabela[i] = new ListaEncadeada(); // Inicializando cada posição com uma lista encadeada vazia;
        }
	}

	@Override
	public void insert(int element) {
		tabela[element % m].insert(element);
		
	}

	@Override
	public void remove(int element) throws Exception {
		if(tabela[element % m].isEmpty()) {
			throw new Exception("Lista Vazia.");
		}
		tabela[element % m].remove(element);
	}

	@Override
	public int search(int element) throws Exception {
		if(tabela[element % m].isEmpty()) {
			throw new Exception("Lista Vazia");
		}
		return tabela[element % m].search(element);
	}

	@Override
	public String print() {
		String resul = "";
		ListaEncadeada lista = null;
		for(int i = 0; i < m; i++) {
			resul += i + ":";
			if(!tabela[i].isEmpty()){
				lista = tabela[i];
				Node atual = lista.getHead();
				while(!atual.isNIL()) {
					if(atual.getProximo().isNIL()) {
						resul += " " + atual.getDado();
					}
					else {
						resul += " " + atual.getDado() + ",";
					}
					atual = atual.getProximo();
				}
			}
			else {
				resul += " ";
			}
			resul += "\n";
		}
//		System.out.println(resul);
		return resul;
	}

}
