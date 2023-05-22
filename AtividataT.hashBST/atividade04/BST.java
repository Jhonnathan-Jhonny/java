package atividade04;

public class BST implements BST_IF {
	
	private BSTNode raiz;
	BSTNode nil = new BSTNode(-1);

	public BST() {
		raiz = nil;
	}
	
	
	public BSTNode getRaiz() {
		return raiz;
	}


	public void setRaiz(BSTNode raiz) {
		this.raiz = raiz;
	}


	@Override
	public void insert(int element) {
		if(raiz.isNIL()) {
			raiz = new BSTNode(element);
			return;
		}
		
		BSTNode atual = raiz;
		BSTNode pai;
		
		while(true) {
			pai = atual;
			if(element < atual.getDado()) {
				atual = atual.getProxLeft();
				if(atual == null) {
					pai.setProxLeft(new BSTNode(element));
					return;
				}
			}
			else {
				atual = atual.getProxRight();
				if(atual == null) {
					pai.setProxRight(new BSTNode(element));
					return;
				}
			}
		}
	 }

	@Override
	public int search(int element) throws Exception {
		if(raiz.isNIL()) {
			throw new Exception("Lista vazia");
		}
		
		BSTNode auxRaiz = raiz;
		
		//Verificando se é a raiz que estou
		if(element == auxRaiz.getDado()) {
				return element;				
		}		
		
		while(true){
			//Verificando na esquerda
			if(element < auxRaiz.getDado()) {
				if(auxRaiz.getProxLeft() == null) {
					throw new Exception("Elemento não encontrado");
				}
				auxRaiz = auxRaiz.getProxLeft();
				if(element == auxRaiz.getDado()) {
					return element;
				}
			}
			//Verificando na direita
			if(element > auxRaiz.getDado()){
				if(auxRaiz.getProxRight() == null) {
					throw new Exception("Elemento não encontrado");
				}
				auxRaiz = auxRaiz.getProxRight();
				if(element == auxRaiz.getDado()) {
					return element;
				}
			}
		}
	}

	@Override
	public int[] preOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int[] order() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int[] postOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isComplete() {
		// TODO Auto-generated method stub
		return false;
	}

}
