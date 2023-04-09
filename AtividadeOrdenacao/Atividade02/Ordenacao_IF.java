package Atividade02;

/*
 * Interface para implementação da classe "Ordenacao".
 * O método booleano deve retornar 'false' se 'numeros' não estiver ordenado (crescente). 
 */
public interface Ordenacao_IF {

  boolean checaVetorOrdenado(int[] numeros);

  long selectionSort(int[] numeros);

  long insertionSort(int[] numeros);

  long mergeSort(int[] numeros, int left, int right);
  
  long quickSort(int[] numeros, int left, int right);

  long random_quickSort(int[] numeros);

  long quickSort_Java(int[] numeros);

  long countingSort(int[] numeros);





}