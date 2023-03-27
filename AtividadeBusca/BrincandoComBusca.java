package atividade01;

public class BrincandoComBusca {
	public static void main(String[] args) {
		
		Busca_IF b = new Busca();
		final int numeroParaBuscar = -1; 
		
		final int[] vetor1000 = b.geraVetorNumericoOrdenado(1000);

		long antes, depois;
		
		antes = System.nanoTime();
		b.buscaLinear_iterativa(vetor1000, numeroParaBuscar);
		depois = System.nanoTime();
		System.out.println("buscaLinear_iterativa:\t"+(depois-antes));
		
		antes = System.nanoTime();
		b.buscaLinear_recursiva(vetor1000, numeroParaBuscar);
		depois = System.nanoTime();
		System.out.println("buscaLinear_recursiva:\t"+(depois-antes));
		
		antes = System.nanoTime();
		b.buscaBinaria_iterativa(vetor1000, numeroParaBuscar);
		depois = System.nanoTime();
		System.out.println("buscaBinaria_iterativa:\t"+(depois-antes));
		
		antes = System.nanoTime();
		b.buscaBinaria_recursiva(vetor1000, numeroParaBuscar);
		depois = System.nanoTime();
		System.out.println("buscaBinaria_recursiva:\t"+(depois-antes));

	}

}
