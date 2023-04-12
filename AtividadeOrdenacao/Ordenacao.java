package Atividade02;

import java.util.Arrays;
import java.util.Random;

public class Ordenacao implements Ordenacao_IF {

	  @Override 	
	  public boolean checaVetorOrdenado(int[] numeros) {
		    for (int i = 0; i < numeros.length - 1; i++) {
		      if (numeros[i] > numeros[i + 1]) {
		        return false;
		      }
		    }
		    return true;
		  }
	  @Override 	  
	  public long selectionSort(int[] numeros) {
		long antes, depois;
	    antes = System.nanoTime();
	    int n = numeros.length;
	    for(int i = 0;i < n-1;i++) {
	      int min = i;
	      for(int j = i+1;j < n;j++) {
	        if(numeros[j] < numeros[min]) {
	          min = j;
	        }
	      }
	      int aux = numeros[min];
	      numeros[min] =  numeros[i];
	      numeros[i] = aux; 
	    }
	    depois = System.nanoTime();
	    return depois-antes;
	  }
	  
	  @Override 
	  public long insertionSort(int[] numeros) {
		long antes, depois;
	    antes = System.nanoTime();
	    int chave;
	    int j;
	    int n = numeros.length;
	    for(int i = 1;i < n;i++) {
	      chave = numeros[i];
	      j = i - 1;
	      while((j >= 0) && (numeros[j] > chave)) {
	        numeros[j+1] = numeros[j];
	        j--;
	      }
	      numeros[j+1] = chave;
	    }    
	    depois = System.nanoTime();
	    return depois-antes;
	  }
	  @Override 
	  public long mergeSort(int[] numeros, int left, int right) {
	    long antes, depois;
	    antes = System.nanoTime();
	    if(left < right) {
	      int meio = (left+right)/2;
	      mergeSort(numeros, left, meio);
	      mergeSort(numeros, meio+1, right);
	      merge(numeros,left, meio, right);
	    } 
	    depois = System.nanoTime();
	    return depois-antes;
	  }
	  
	  private void merge(int[] numeros, int left, int meio, int right) {
	    int numero1 = meio - left + 1;
	    int numero2 = right - meio;
	    
	    int[] inicio = new int[numero1];
	    int[] fim = new int[numero2];
	    
	    for(int i = 0; i < numero1; i++) {
	      inicio[i] = numeros[left+i];
	    }
	    for(int j = 0; j < numero2; j++) {
	      fim[j] = numeros[meio + 1 + j];
	    }
	    
	    int i=0, j = 0;
	    int k = left;
	    
	    while(i< numero1 && j < numero2) {
	      if(inicio[i] <= fim[j]) {
	        numeros[k] = inicio[i];
	        i++;
	      }
	      else {
	        numeros[k] = inicio[i];
	        j++;
	      }
	      k++;
	    }
	    
	    while(i < numero1) {
	      numeros[k] = inicio[i];
	      i++;
	      k++;
	    }
	    while(j < numero2) {
	      numeros[k] = fim[j];
	      j++;
	      k++;
	    }
	}
	  @Override 
	  public long quickSort(int[] numeros, int left, int right) {
	    long antes, depois;
	    antes = System.nanoTime();
	    if (left < right) {
	      int pivo = partition(numeros, left, right);
	      quickSort(numeros, left, pivo - 1);
	      quickSort(numeros, pivo + 1, right);
	    }
	    depois = System.nanoTime();
	    return depois-antes;
	  }

	  private int partition(int[] numeros, int left, int right) {
	    int pivo = numeros[left];
	    int i = left + 1;
	    int j = right;
	    while(i <= j) {
	      if(numeros[i] <= pivo) {
	        i++;
	      }
	      else if(numeros[j] > pivo){
	        j--;
	      }
	      else {
	        int aux = numeros[i];
	        numeros[i] = numeros[j];
	        numeros[j] = aux;
	      }   
	    }
	    int aux = numeros[left];
	    numeros[left] = numeros[j];
	    numeros[j] = aux;
	    
	    return j;
	  }
	  @Override 
	  public long random_quickSort(int[] numeros, int left, int right) {
		long antes, depois;
	    antes = System.nanoTime();
	    if (left < right) {
	        int pivotIndex = randomizedPartition(numeros, left, right);
	        random_quickSort(numeros, left, pivotIndex - 1);
	        random_quickSort(numeros, pivotIndex + 1, right);
	       }
	    depois = System.nanoTime();
	    return depois-antes;
	  }
	  
	 public static int randomizedPartition(int[] arr, int low, int high) {
	    Random rand = new Random();
	    int pivotIndex = rand.nextInt(high - low + 1) + low;
	    int pivot = arr[pivotIndex];
	    int i = low - 1;
	    for (int j = low; j < high; j++) {
	        if (arr[j] < pivot) {
	            i++;
	            int temp = arr[i];
	            arr[i] = arr[j];
	            arr[j] = temp;
	        }
	    }
        int aux = arr[i+1];
        arr[i+1] = arr[pivotIndex];
        arr[pivotIndex] = aux;
	    return i + 1;
	 }

	  public long quickSort_Java(int[] numeros) {
	    long antes, depois;
	    antes = System.nanoTime();
	    Arrays.sort(numeros);
	    depois = System.nanoTime();
	    return depois-antes;
	  }
	  @Override 
	  public long countingSort(int[] numeros) {
	    long antes, depois;
	    antes = System.nanoTime();
	    int maxVal = numeros[0];
	    int minVal = numeros[0];
	    for (int i = 1; i < numeros.length; i++) {
	        if (numeros[i] > maxVal) {
	            maxVal = numeros[i];
	        }
	        if (numeros[i] < minVal) {
	            minVal = numeros[i];
	        }
	    }
	    int range = maxVal - minVal + 1;
	    int[] count = new int[range];
	    int[] output = new int[numeros.length];
	    for (int i = 0; i < numeros.length; i++) {
	        count[numeros[i] - minVal]++;
	    }
	    for (int i = 1; i < count.length; i++) {
	        count[i] += count[i - 1];
	    }
	    for (int i = numeros.length - 1; i >= 0; i--) {
	        output[count[numeros[i] - minVal] - 1] = numeros[i];
	        count[numeros[i] - minVal]--;
	    }
	    for (int i = 0; i < numeros.length; i++) {
	    	numeros[i] = output[i];
	    }
	    depois = System.nanoTime();
	    return depois-antes;
	}

}
