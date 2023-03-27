package atividade01;

public class Busca implements Busca_IF {

	public int[] geraVetorNumericoOrdenado(int tamanho) {
		int[] vetor = new int[tamanho];
		for (int i = 0; i < tamanho; i++) {
			vetor[i] = i;
		}
		return vetor;
	}

	public boolean buscaLinear_iterativa(int[] numeros, int k) {
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] == k){
				return true;
			}
		}
		return false;
	}

	public boolean buscaLinear_recursiva(int[] numeros, int k) {
	boolean resultado = aux_buscaLinear_recursiva(numeros, k, 0);
	return resultado;

	}
	private boolean aux_buscaLinear_recursiva(int[] numeros, int k, int posicao) {
		if (posicao >= numeros.length) {
			return false;
		}
		if(numeros[posicao] == k) {
			return true;
		}
		else {
			return aux_buscaLinear_recursiva(numeros,k,posicao+1);
		}

		}

	@Override
	  public boolean buscaBinaria_iterativa(int[] numeros, int k) {
	    int meio;
	    int inicio, fim;
	    inicio = 0;
	    fim = numeros.length - 1;
	    while (inicio <= fim) {
	      meio = (inicio + fim) / 2;
	      if (numeros[meio] == k) {
	        return true;
	      } else if (numeros[meio] < k) {
	        inicio = meio + 1;
	      } else if (numeros[meio] > k) {
	        fim = meio - 1;
	      }
	      return false;
	    }
	    return false;
	  }

	  @Override
	  public boolean buscaBinaria_recursiva(int[] numeros, int k) {
	    boolean verifica = auxBuscaRecursivaBinaria(numeros, k, 0, numeros.length - 1);
	    return verifica;
	  }

	  public static boolean auxBuscaRecursivaBinaria(int[] numeros, int k, int menor, int maior) {
	    int meio = (menor + maior) / 2;
	    if (menor > maior) {
	      return false;
	    }
	    if (numeros[meio] == k) {
	      return true;
	    }
	    if (numeros[meio] < k) {
	      return auxBuscaRecursivaBinaria(numeros, k, menor = meio + 1, maior);
	    } else {
	      return auxBuscaRecursivaBinaria(numeros, k, menor, maior = meio - 1);
	    }
	  }

}
