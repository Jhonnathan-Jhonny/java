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
	    int inserir = tamanho_vetor -1;
	    for(int i = 0; i < numeros_crescente.length; i++) {numeros_decrescente[inserir--] = numeros_crescente[i];}

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
	    
	    int testes = 50;
	    long media_crescente = 0, media_decrescente = 0, media_desrodenado = 0;
	    long soma_crescente = 0, soma_decrescente = 0, soma_desrodenado = 0;
	    long tempo_crescente = 0, tempo_decrescente = 0, tempo_desordenado = 0 ;
	    
	    //Selection Sort
	    for (int i = 0; i < testes; i++) {
	    	
	    	tempo_crescente = o.selectionSort(numeros_crescente.clone());
		    soma_crescente = soma_crescente + tempo_crescente;

		    tempo_decrescente = o.selectionSort(numeros_decrescente.clone());
		    soma_decrescente += tempo_decrescente;
		    
		    tempo_desordenado = o.selectionSort(numeros_desordenados.clone());
		    soma_desrodenado = soma_desrodenado + tempo_desordenado;
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
  		
  		tempo_crescente = 0; 
  		tempo_decrescente = 0;
  		tempo_desordenado = 0 ;
	    for (int i = 0; i < testes; i++) {
	    	tempo_crescente = o.insertionSort(numeros_crescente.clone());
		    soma_crescente = soma_crescente + tempo_crescente;
		    
		    tempo_decrescente = o.insertionSort(numeros_decrescente.clone());
		    soma_decrescente = soma_decrescente + tempo_decrescente;
		    ;
		    tempo_desordenado = o.insertionSort(numeros_desordenados.clone());
		    soma_desrodenado = soma_desrodenado + tempo_desordenado;
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
      
  		tempo_crescente = 0; 
  		tempo_decrescente = 0;
  		tempo_desordenado = 0 ;
	    for (int i = 0; i < testes; i++) {
	    	tempo_crescente = o.mergeSort(numeros_crescente.clone(),0,numeros_crescente.length - 1);
		    soma_crescente = soma_crescente + tempo_crescente;
		    
		    tempo_decrescente = o.mergeSort(numeros_decrescente.clone(),0,numeros_crescente.length - 1);
		    soma_decrescente = soma_decrescente + tempo_decrescente;
		    
		    tempo_desordenado = o.mergeSort(numeros_desordenados.clone(),0,numeros_crescente.length - 1);
		    soma_desrodenado = soma_desrodenado + tempo_desordenado;
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
  		
  		tempo_crescente = 0; 
  		tempo_decrescente = 0;
  		tempo_desordenado = 0 ;
	    for (int i = 0; i < testes; i++) {

		    tempo_crescente = o.quickSort(numeros_crescente.clone(),0,numeros_crescente.length - 1);
		    soma_crescente = soma_crescente + tempo_crescente;
		    
		    tempo_decrescente = o.quickSort(numeros_decrescente.clone(),0,numeros_crescente.length - 1);
		    soma_decrescente = soma_decrescente + tempo_decrescente;
		    
		    tempo_desordenado = o.quickSort(numeros_desordenados.clone(),0,numeros_crescente.length - 1);
		    soma_desrodenado = soma_desrodenado + tempo_desordenado;
	    }
	    media_crescente = soma_crescente / testes;
	    media_decrescente = soma_decrescente / testes;
	    media_desrodenado = soma_desrodenado / testes;
	    System.out.println("\nMédia crescente Quick Sort: " + media_crescente);
	    System.out.println("Média decrescente Quick Sort: " + media_decrescente);
	    System.out.println("Média desrodenado Quick Sort: " + media_desrodenado);

    // Random Quick Sort
        media_crescente=0;
  		media_decrescente=0; 
  		media_desrodenado=0;
  		
  		soma_crescente = 0;
  		soma_decrescente = 0; 
  		soma_desrodenado = 0;
  		
  		tempo_crescente = 0; 
  		tempo_decrescente = 0;
  		tempo_desordenado = 0 ;
	    for (int i = 0; i < testes; i++) {

		    tempo_crescente = o.random_quickSort(numeros_crescente.clone(),0,numeros_crescente.length - 1);
		    soma_crescente = soma_crescente + tempo_crescente;
		    
		    tempo_decrescente = o.random_quickSort(numeros_decrescente.clone(),0,numeros_crescente.length - 1);
		    soma_decrescente = soma_decrescente + tempo_decrescente;
		    
		    tempo_desordenado = o.random_quickSort(numeros_desordenados.clone(),0,numeros_crescente.length - 1);
		    soma_desrodenado = soma_desrodenado + tempo_desordenado;
	    }
	    media_crescente = soma_crescente / testes;
	    media_decrescente = soma_decrescente / testes;
	    media_desrodenado = soma_desrodenado / testes;
	    System.out.println("\nMédia crescente Random Quick Sort: " + media_crescente);
	    System.out.println("Média decrescente Random Quick Sort: " + media_decrescente);
	    System.out.println("Média desrodenado Random Quick Sort: " + media_desrodenado);
	    
    	//  Quick Sort - JAVA
        media_crescente=0;
  		media_decrescente=0; 
  		media_desrodenado=0;
  		
  		soma_crescente = 0;
  		soma_decrescente = 0; 
  		soma_desrodenado = 0;
  		
  		tempo_crescente = 0; 
  		tempo_decrescente = 0;
  		tempo_desordenado = 0 ;
	    for (int i = 0; i < testes; i++) {
	    	
	    	tempo_crescente = o.quickSort_Java(numeros_crescente.clone());
		    soma_crescente = soma_crescente + tempo_crescente;
		    
		    tempo_decrescente = o.quickSort_Java(numeros_decrescente.clone());
		    soma_decrescente = soma_decrescente + tempo_decrescente;
		    
		    tempo_desordenado = o.quickSort_Java(numeros_desordenados.clone());
		    soma_desrodenado = soma_desrodenado + tempo_desordenado;
	    }
	    media_crescente = soma_crescente / testes;
	    media_decrescente = soma_decrescente / testes;
	    media_desrodenado = soma_desrodenado / testes;
	    System.out.println("\nMédia crescente Quick Sort - JAVA: " + media_crescente);
	    System.out.println("Média decrescente Quick Sort - JAVA: " + media_decrescente);
	    System.out.println("Média desrodenado Quick Sort - JAVA: " + media_desrodenado);
	    
	    //Counting Sort
        media_crescente=0;
  		media_decrescente=0; 
  		media_desrodenado=0;
  		
  		soma_crescente = 0;
  		soma_decrescente = 0; 
  		soma_desrodenado = 0;
  		
  		tempo_crescente = 0; 
  		tempo_decrescente = 0;
  		tempo_desordenado = 0 ;
	    for (int i = 0; i < testes; i++) {
		    tempo_crescente = o.countingSort(numeros_crescente.clone());
		    soma_crescente = soma_crescente + tempo_crescente;
		    
		    tempo_decrescente = o.countingSort(numeros_decrescente.clone());
		    soma_decrescente = soma_decrescente + tempo_decrescente;

		    tempo_desordenado = o.countingSort(numeros_desordenados.clone());
		    soma_desrodenado = soma_desrodenado + tempo_desordenado;
	    }
	    media_crescente = soma_crescente / testes;
	    media_decrescente = soma_decrescente / testes;
	    media_desrodenado = soma_desrodenado / testes;
	    System.out.println("\nMédia crescente Counting Sort: " + media_crescente);
	    System.out.println("Média decrescente Counting Sort: " + media_decrescente);
	    System.out.println("Média desrodenado Counting Sort: " + media_desrodenado);
	  }
}
