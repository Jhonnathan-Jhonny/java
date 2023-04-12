package Atividade02;

import java.util.ArrayList;
import java.util.Collections;

public class BrincandoComOrdenacao {
	public static void main(String[] args) {
	    Ordenacao_IF o = new Ordenacao();

	    // Gerar vetor

	    int tamanho_vetor = 5000;

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
	    
	    //Clonando vetores
	    int crescentes[] = new int[tamanho_vetor];
		int decrescentes[] = new int[tamanho_vetor];
		int desordenados[] = new int[tamanho_vetor];
		
	    for(int i = 0; i < numeros_crescente.length; i++) {
	    	crescentes[i] = numeros_crescente[i];
	    }
	    for(int i = 0; i < numeros_crescente.length; i++) {
	    	decrescentes[i] = numeros_decrescente[i];
	    }
	    for(int i = 0; i < numeros_crescente.length; i++) {
	    	desordenados[i] = numeros_desordenados[i];
	    }


	    long antes, depois;
	    
	    int testes = 50;
	    long media_crescente = 0, media_decrescente = 0, media_desrodenado = 0;
	    long soma_crescente = 0, soma_decrescente = 0, soma_desrodenado = 0;
	    
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
	    
	    for(int i = 0; i < numeros_crescente.length; i++) {
	    	numeros_crescente[i] = crescentes[i];
	    }
	    for(int i = 0; i < numeros_crescente.length; i++) {
	    	numeros_decrescente[i] = decrescentes[i];
	    }
	    for(int i = 0; i < numeros_crescente.length; i++) {
	    	numeros_desordenados[i] = desordenados[i];
	    }
	    
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
	  
	    for(int i = 0; i < numeros_crescente.length; i++) {
	    	numeros_crescente[i] = crescentes[i];
	    }
	    for(int i = 0; i < numeros_crescente.length; i++) {
	    	numeros_decrescente[i] = decrescentes[i];
	    }
	    for(int i = 0; i < numeros_crescente.length; i++) {
	    	numeros_desordenados[i] = desordenados[i];
	    }
	    
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
	    
	    for(int i = 0; i < numeros_crescente.length; i++) {
	    	numeros_crescente[i] = crescentes[i];
	    }
	    for(int i = 0; i < numeros_crescente.length; i++) {
	    	numeros_decrescente[i] = decrescentes[i];
	    }
	    for(int i = 0; i < numeros_crescente.length; i++) {
	    	numeros_desordenados[i] = desordenados[i];
	    }
	    
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

	    for(int i = 0; i < numeros_crescente.length; i++) {
	    	numeros_crescente[i] = crescentes[i];
	    }
	    for(int i = 0; i < numeros_crescente.length; i++) {
	    	numeros_decrescente[i] = decrescentes[i];
	    }
	    for(int i = 0; i < numeros_crescente.length; i++) {
	    	numeros_desordenados[i] = desordenados[i];
	    }
	    
    // Random Quick Sort
        media_crescente=0;
  		media_decrescente=0; 
  		media_desrodenado=0;
  		
  		soma_crescente = 0;
  		soma_decrescente = 0; 
  		soma_desrodenado = 0;
	    for (int i = 0; i < testes; i++) {
		    antes = System.nanoTime();
		    o.random_quickSort(numeros_crescente,0,numeros_crescente.length - 1);
		    depois = System.nanoTime();
		    soma_crescente = soma_crescente + (depois - antes);
		    
		    antes = System.nanoTime();
		    o.random_quickSort(numeros_decrescente,0,numeros_crescente.length - 1);
		    depois = System.nanoTime();
		    soma_decrescente = soma_decrescente + (depois - antes);
		    
		    antes = System.nanoTime();
		    o.random_quickSort(numeros_desordenados,0,numeros_crescente.length - 1);
		    depois = System.nanoTime();
		    soma_desrodenado = soma_desrodenado + (depois - antes);
	    }
	    media_crescente = soma_crescente / testes;
	    media_decrescente = soma_decrescente / testes;
	    media_desrodenado = soma_desrodenado / testes;
	    System.out.println("\nMédia crescente Random Quick Sort: " + media_crescente);
	    System.out.println("Média decrescente Random Quick Sort: " + media_decrescente);
	    System.out.println("Média desrodenado Random Quick Sort: " + media_desrodenado);
	    
	    for(int i = 0; i < numeros_crescente.length; i++) {
	    	numeros_crescente[i] = crescentes[i];
	    }
	    for(int i = 0; i < numeros_crescente.length; i++) {
	    	numeros_decrescente[i] = decrescentes[i];
	    }
	    for(int i = 0; i < numeros_crescente.length; i++) {
	    	numeros_desordenados[i] = desordenados[i];
	    }
	    
    	//  Quick Sort - JAVA
        media_crescente=0;
  		media_decrescente=0; 
  		media_desrodenado=0;
  		
  		soma_crescente = 0;
  		soma_decrescente = 0; 
  		soma_desrodenado = 0;
	    for (int i = 0; i < testes; i++) {
		    antes = System.nanoTime();
		    o.quickSort_Java(numeros_crescente);
		    depois = System.nanoTime();
		    soma_crescente = soma_crescente + (depois - antes);
		    
		    antes = System.nanoTime();
		    o.quickSort_Java(numeros_decrescente);
		    depois = System.nanoTime();
		    soma_decrescente = soma_decrescente + (depois - antes);
		    
		    antes = System.nanoTime();
		    o.quickSort_Java(numeros_desordenados);
		    depois = System.nanoTime();
		    soma_desrodenado = soma_desrodenado + (depois - antes);
	    }
	    media_crescente = soma_crescente / testes;
	    media_decrescente = soma_decrescente / testes;
	    media_desrodenado = soma_desrodenado / testes;
	    System.out.println("\nMédia crescente Quick Sort - JAVA: " + media_crescente);
	    System.out.println("Média decrescente Quick Sort - JAVA: " + media_decrescente);
	    System.out.println("Média desrodenado Quick Sort - JAVA: " + media_desrodenado);
	    
	    for(int i = 0; i < numeros_crescente.length; i++) {
	    	numeros_crescente[i] = crescentes[i];
	    }
	    for(int i = 0; i < numeros_crescente.length; i++) {
	    	numeros_decrescente[i] = decrescentes[i];
	    }
	    for(int i = 0; i < numeros_crescente.length; i++) {
	    	numeros_desordenados[i] = desordenados[i];
	    }
	    
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
