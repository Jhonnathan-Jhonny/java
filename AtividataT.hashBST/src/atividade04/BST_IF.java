package atividade04;

/*
 * Interface para implementação da classe "BST".
 */
public interface BST_IF {
	public void insert(int element);
	public int search(int element) throws Exception; //lançar exceção caso não encontre
	public int[] preOrder();
	public int[] order();
	public int[] postOrder();
	public boolean isComplete();
}