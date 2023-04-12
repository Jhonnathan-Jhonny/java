package Atividade02;

import java.util.ArrayList;
import java.util.Collections;

public class BrincandoComOrdenacao {
	  // https://dicasdejava.com.br/java-como-embaralhar-uma-lista/#:~:text=Para%20embaralhar%20uma%20lista%20(List,%C3%A9%20nativa%20da%20API%20java.
	  public static void main(String[] args) {
	    Ordenacao_IF o = new Ordenacao();

	    // Gerar vetor

	    int tamanho_vetor = 10;

	    int numeros_crescente[] = new int[tamanho_vetor];
	    int numeros_decrescente[] = new int[tamanho_vetor];
	    int numeros_desordenados[] = new int[tamanho_vetor];
	    //Numeros crescentes
	    for (int i = 0; i < tamanho_vetor; i++) {
	    	numeros_crescente[i] = i + 1;
	    }
	    //Numeros decrescentes
	    int inserir = tamanho_vetor - 1;
	    for(int i = 0; i < numeros_crescente.length; i++) {
    		numeros_decrescente[inserir] = numeros_crescente[i];
    		inserir -= 1;	
	    }

	    boolean checagem;

	    checagem = o.checaVetorOrdenado(numeros_crescente);
	    System.out.println("Está ordenado? "+ checagem);

	    // Embaralhar vetor

	    ArrayList<Integer> numeros_lista = new ArrayList<Integer>();
	    
	    for(int i = 0; i < numeros_crescente.length; i++) {
	    	numeros_lista.add(numeros_crescente[i]);
	    }

	    Collections.shuffle(numeros_lista);
	    //Numeros desordenados
	    for(int i = 0; i < numeros_crescente.length; i++) {
	    	numeros_desordenados[i] = numeros_lista.get(i);
	    }
	    
	    //Chegando vetor crescente, decrescente e desordenado
	    

//	    for(int i = 0; i < numeros_crescente.length; i++) {
//	    	System.out.print(numeros_crescente[i]+" ");
//	    }
//	    System.out.println("\n");
//	    for(int i = 0; i < numeros_decrescente.length; i++) {
//	    	System.out.print(numeros_decrescente[i]+" ");
//	    }
//	    System.out.println("\n");
//	    for(int i = 0; i < numeros_desordenados.length; i++) {
//	    	System.out.print(numeros_desordenados[i]+" ");
//	    }
//	    System.out.println("\n");


	    long antes, depois;
	    
	    int testes = 50;
	    float media_crescente, media_decrescente, media_desrodenado;
	    float soma_crescente = 0, soma_decrescente = 0, soma_desrodenado = 0;
	    
	    //Selection Sort
	    for (int i = 0; i < testes; i++) {
		    antes = System.nanoTime();
		    o.selectionSort(numeros_crescente);
		    depois = System.nanoTime();
		    soma_crescente = soma_crescente + (depois - antes);
		    
		    antes = System.nanoTime();
		    o.selectionSort(numeros_decrescente);
		    depois = System.nanoTime();
		    soma_decrescente += (depois - antes);
		    
		    antes = System.nanoTime();
		    o.selectionSort(numeros_desordenados);
		    depois = System.nanoTime();
		    soma_desrodenado = soma_desrodenado + (depois - antes);
	    }
	    media_crescente = soma_crescente / testes;
	    media_decrescente = soma_decrescente / testes;
	    media_desrodenado = soma_desrodenado / testes;
	    System.out.println("\nMédia crescente Selection Sort: " + media_crescente);
	    System.out.println("Média decrescente Selection Sort: " + media_decrescente);
	    System.out.println("Média desrodenado Selection Sort: " + media_desrodenado);
	    
	    //Insertion Sort
	    media_crescente=0;
		media_decrescente=0; 
		media_desrodenado=0;
		
		soma_crescente = 0;
		soma_decrescente = 0; 
		soma_desrodenado = 0;
	    for (int i = 0; i < testes; i++) {
		    antes = System.nanoTime();
		    o.insertionSort(numeros_crescente);
		    depois = System.nanoTime();
		    soma_crescente = soma_crescente + (depois - antes);
		    
		    antes = System.nanoTime();
		    o.insertionSort(numeros_decrescente);
		    depois = System.nanoTime();
		    soma_decrescente = soma_decrescente + (depois - antes);
		    
		    antes = System.nanoTime();
		    o.insertionSort(numeros_desordenados);
		    depois = System.nanoTime();
		    soma_desrodenado = soma_desrodenado + (depois - antes);
	    }
	    media_crescente = soma_crescente / testes;
	    media_decrescente = soma_decrescente / testes;
	    media_desrodenado = soma_desrodenado / testes;
	    System.out.println("\nMédia crescente Insertion Sort: " + media_crescente);
	    System.out.println("Média decrescente Insertion Sort: " + media_decrescente);
	    System.out.println("Média desrodenado Insertion Sort: " + media_desrodenado);
	  
	    //Merge Sort
	    media_crescente=0;
		media_decrescente=0; 
		media_desrodenado=0;
		
		soma_crescente = 0;
		soma_decrescente = 0; 
		soma_desrodenado = 0;
	    for (int i = 0; i < testes; i++) {
		    antes = System.nanoTime();
		    o.mergeSort(numeros_crescente,0,numeros_crescente.length - 1);
		    depois = System.nanoTime();
		    soma_crescente = soma_crescente + (depois - antes);
		    
		    antes = System.nanoTime();
		    o.mergeSort(numeros_decrescente,0,numeros_crescente.length - 1);
		    depois = System.nanoTime();
		    soma_decrescente = soma_decrescente + (depois - antes);
		    
		    antes = System.nanoTime();
		    o.mergeSort(numeros_desordenados,0,numeros_crescente.length - 1);
		    depois = System.nanoTime();
		    soma_desrodenado = soma_desrodenado + (depois - antes);
	    }
	    media_crescente = soma_crescente / testes;
	    media_decrescente = soma_decrescente / testes;
	    media_desrodenado = soma_desrodenado / testes;
	    System.out.println("\nMédia crescente Merge Sort: " + media_crescente);
	    System.out.println("Média decrescente Merge Sort: " + media_decrescente);
	    System.out.println("Média desrodenado Merge Sort: " + media_desrodenado);
	    
	    //  Quick Sort
	    media_crescente=0;
		media_decrescente=0; 
		media_desrodenado=0;
		
		soma_crescente = 0;
		soma_decrescente = 0; 
		soma_desrodenado = 0;
	    for (int i = 0; i < testes; i++) {
		    antes = System.nanoTime();
		    o.quickSort(numeros_crescente,0,numeros_crescente.length - 1);
		    depois = System.nanoTime();
		    soma_crescente = soma_crescente + (depois - antes);
		    
		    antes = System.nanoTime();
		    o.quickSort(numeros_decrescente,0,numeros_crescente.length - 1);
		    depois = System.nanoTime();
		    soma_decrescente = soma_decrescente + (depois - antes);
		    
		    antes = System.nanoTime();
		    o.quickSort(numeros_desordenados,0,numeros_crescente.length - 1);
		    depois = System.nanoTime();
		    soma_desrodenado = soma_desrodenado + (depois - antes);
	    }
	    media_crescente = soma_crescente / testes;
	    media_decrescente = soma_decrescente / testes;
	    media_desrodenado = soma_desrodenado / testes;
	    System.out.println("\nMédia crescente Quick Sort: " + media_crescente);
	    System.out.println("Média decrescente Quick Sort: " + media_decrescente);
	    System.out.println("Média desrodenado Quick Sort: " + media_desrodenado);
	    
	    
	    
	    
	    //Counting Sort
	    media_crescente=0;
		media_decrescente=0; 
		media_desrodenado=0;
		
		soma_crescente = 0;
		soma_decrescente = 0; 
		soma_desrodenado = 0;
	    for (int i = 0; i < testes; i++) {
		    antes = System.nanoTime();
		    o.countingSort(numeros_crescente);
		    depois = System.nanoTime();
		    soma_crescente = soma_crescente + (depois - antes);
		    
		    antes = System.nanoTime();
		    o.countingSort(numeros_decrescente);
		    depois = System.nanoTime();
		    soma_decrescente = soma_decrescente + (depois - antes);
		    
		    antes = System.nanoTime();
		    o.countingSort(numeros_desordenados);
		    depois = System.nanoTime();
		    soma_desrodenado = soma_desrodenado + (depois - antes);
	    }
	    media_crescente = soma_crescente / testes;
	    media_decrescente = soma_decrescente / testes;
	    media_desrodenado = soma_desrodenado / testes;
	    System.out.println("\nMédia crescente Counting Sort: " + media_crescente);
	    System.out.println("Média decrescente Counting Sort: " + media_decrescente);
	    System.out.println("Média desrodenado Counting Sort: " + media_desrodenado);
	  }
}