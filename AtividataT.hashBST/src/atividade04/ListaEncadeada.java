package atividade04;

public class ListaEncadeada implements ListaEncadeada_IF {
	
	protected Node head;
	private int size = 0;
	
	
	public ListaEncadeada() {
		Node nil = new Node(-1);
		head = 	nil;
	}
	
	// Getter Setter
	public Node getHead() {
		return head;
	}

	
	public void setHead(Node head) {
		this.head = head;
	}

	// Metodos

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
			throw new Exception("Lista vazia");
		}
		Node auxHead = head;
		while(!auxHead.isNIL()) {
			if(auxHead.getDado() == element) {
				return element;
			}
			auxHead = auxHead.getProximo();
		}
		throw new Exception("não encontrado");
	}

	@Override
	public void insert(int element) {
		if(element >= 0) {
			//Inserindo no primeiro
			Node newNode = new Node(element);
			newNode.setProximo(head);
			head = newNode;
			size++;
		}
		
		//Inserindo depois de algum elemento
	
//		if(isEmpty()) {
//			Node newHead = new Node(element);
//			newHead.setProximo(head);
//			head = newHead;
//			size++;
//		}
//		else {
//			Node auxHead = head;
//			while(auxHead.getProximo()!= null) {
//				auxHead = auxHead.getProximo();
//			}
//			Node newNode = new Node(element);
//			auxHead.setProximo(newNode);
//			size++;
//		}
	}

	@Override
	public void remove(int element) {
		if(isEmpty()) {
			System.out.println("Lista vazia.");
			return;
		}
		if(head.getDado() == element) {
			head = head.getProximo();
			size--;
		}
		else {
			Node anterior = null;
			Node cursor = head;
			while(!cursor.isNIL() ) {	
				if(cursor.getDado() == element) {
					anterior.setProximo(cursor.getProximo());
					size --;
					return;
				}
				anterior = cursor;
				cursor = cursor.getProximo();
			}
		}
	}

	@Override
	public int[] toArray() {
		if(isEmpty()) {
			return null;
		}
		else {
			int[] result = new int[size];
			Node aux = head;
			int contador = 0;
			while(!aux.isNIL()) {
				result[contador]= aux.getDado();
				aux = aux.getProximo();
				contador++;
			}
			return result;
		}
	}
	  
}