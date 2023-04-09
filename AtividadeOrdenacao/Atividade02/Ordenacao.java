package Atividade02;

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
		  int n = numeros.length;
	    for(int i = 0;i > n -1;i++) {
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
	    
	    // for(int i = 0; i < n; i++) {
	    // 	System.out.print(numeros[i]+", ");
	    // }	
	    // System.out.print("/ ");
	    return 0;
	  }

	  @Override
	  public long insertionSort(int[] numeros) {
		int chave;
		int j;
		int n = numeros.length;
	    for(int i = 1;i < n;i++) {
	    	chave = numeros[i];
	    	j = i - 1;
	    	while((j >= 0) && (numeros[j] > chave)) {
	    		numeros[j+1] = numeros[j];
	    		j = j -1;
	    	}
	    	numeros[j+1] = chave;
	    }
	    // for(int i = 0; i < n ; i++) {
	    // 	System.out.print(numeros[i]+", ");
	    // }	
	    // System.out.print("/ ");
	    
	    return 0;
	  }

	  @Override
	  public long mergeSort(int[] numeros, int left, int right) {
//		int n = numeros.length;
	    if(left < right) {
	    	int meio = (left+right)/2;
	    	mergeSort(numeros, left, meio);
	    	mergeSort(numeros, meio+1, right);
	    	merge(numeros,left, meio, right);
	    }
	    
	    // for(int i = 0; i < n; i++) {
	    // 	System.out.print(numeros[i]+", ");
	    // }	
	    // System.out.print("/ ");
	    
	    return 0;
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
//		int n = numeros.length;
	    if (left < right) {
	    	int pivo = partition(numeros, left, right);
	    	quickSort(numeros, left, pivo - 1);
	    	quickSort(numeros, pivo + 1, right);
	    }
	    // for(int i = 0; i < n; i++) {
	    // 	System.out.print(numeros[i]+", ");
	    // }	
	    // System.out.print("/ ");
	    return 0;
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
	  public long random_quickSort(int[] numeros) {
	    // TODO Auto-generated method stub
	    return 0;
	  }

	  @Override
	  public long quickSort_Java(int[] numeros) {
	    return 0;
	  }

	  @Override
	  public long countingSort(int[] numeros) {
		int n = numeros.length;
		int k = 500;
		int[] c = new int[k + 1]; 
		int[] b = new int[n];
		
	    for(int i = 0; i < n; i++) {
	    	c[numeros[i]]++;
	    }
	    
	    for(int i = 1; i < k; i++) {
	    	c[i] += c[i-1];
	    }
	    	    
	    for (int i = n-1; i >= 0; i--) {
	    	b[c[numeros[i]]-1] = numeros[i];
	    	c[numeros[i]]--;
	    }	    
	    
	    for(int i = 0; i < n; i++) {
	    	numeros[i] = b[i];
	    }


	    // for(int i = 0; i < n; i++) {
	    // 	System.out.print(numeros[i]+", ");
	    // }	
	    // System.out.print("/ ");
	    return 0;
	  }

	}
