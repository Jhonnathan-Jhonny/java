package atividade04;

public class BSTNode {
	protected int dado;
	protected BSTNode proxLeft;
	protected BSTNode proxRight;
	protected BSTNode parente;
	
	public BSTNode(int dado) {
		this.dado= dado;
		this.proxLeft = null;
		this.proxRight = null;
		this.parente = null;
	}
	
	public int getDado() {
		return dado;
	}



	public void setDado(int dado) {
		this.dado = dado;
	}



	public BSTNode getProxLeft() {
		return proxLeft;
	}



	public void setProxLeft(BSTNode proxLeft) {
		this.proxLeft = proxLeft;
	}



	public BSTNode getProxRight() {
		return proxRight;
	}



	public void setProxRight(BSTNode proxRight) {
		this.proxRight = proxRight;
	}



	public BSTNode getParente() {
		return parente;
	}



	public void setParente(BSTNode parente) {
		this.parente = parente;
	}



	public boolean isNIL() {
		return this.dado == -1;
	}
	
}
