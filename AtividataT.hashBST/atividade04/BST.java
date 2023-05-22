package atividade04;

import java.util.Stack;

public class BST implements BST_IF {
	
	private BSTNode raiz;
	BSTNode nil = new BSTNode(-1);
	int quantNo = 0;

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
			quantNo++;
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
					quantNo++;
					return;
				}
			}
			else {
				atual = atual.getProxRight();
				if(atual == null) {
					pai.setProxRight(new BSTNode(element));
					quantNo++;
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
		
		if(raiz == null) {
			return null;
		}
		
		int preOrdem[] = new int[quantNo];
        Stack<BSTNode> pilha = new Stack<>();	
		int i = 0;
		
		pilha.push(raiz);

        while (!pilha.isEmpty()) {
            BSTNode atual = pilha.pop();
            preOrdem[i] = atual.getDado();

            if (atual.getProxRight() != null) {
            	pilha.push(atual.getProxRight());
            }

            if (atual.getProxLeft() != null) {
            	pilha.push(atual.getProxLeft());
            }
            i++;
        }
        
//        for(int j = 0; j < quantNo; j++) {
//        	System.out.println(preOrdem[j]);
//        }
			 
		return preOrdem;
	}
//	
//	public int valorMaximo() {
//		BSTNode auxRaiz = raiz;
//		int valor = -1;
//		while(auxRaiz.getProxRight() != null) {
//			auxRaiz = auxRaiz.getProxRight();
//		}
//		valor = auxRaiz.getDado();
//		return valor;
//	}

	@Override
	public int[] order() {
		if(raiz == null) {
			return null;
		}
		
		int order[] = new int[quantNo];
        Stack<BSTNode> pilha = new Stack<>();	
		int i = 0;
    	BSTNode atual = raiz;
    	
    	while(atual != null || !pilha.isEmpty()) {
	        while (atual != null) {
	        	pilha.push(atual);
	        	atual = atual.getProxLeft();
	        }
	        
	        atual = pilha.pop();
	        order[i] = atual.getDado();
	        atual = atual.getProxRight();
	        i++;
		}
//        for(int  j = 0; j < quantNo; j++) {
//        	System.out.println(order[j]);
//        }
			 
		return order;
	}

	@Override
	public int[] postOrder() {
		if(raiz == null) {
			return null;
		}
		
		int postOrder[] = new int[quantNo];
        Stack<BSTNode> pilha = new Stack<>();	
		int i = quantNo - 1;
		
		pilha.push(raiz);

        while (!pilha.isEmpty()) {
            BSTNode atual = pilha.pop();
            postOrder[i] = atual.getDado();

            if (atual.getProxLeft() != null) {
            	pilha.push(atual.getProxLeft());
            }
            
            if (atual.getProxRight() != null) {
            	pilha.push(atual.getProxRight());
            }
            
            i--;
        }
        
//        for(int  j = 0; j < quantNo; j++) {
//        	System.out.println(postOrder[j]);
//        }
			 
		return postOrder;
	}

	@Override
	public boolean isComplete() {
		return false;
	}

}
