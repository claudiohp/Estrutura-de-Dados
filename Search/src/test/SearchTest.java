package test;

import java.util.Random;

import search.BinarySearch;
import search.BubbleSort;
import search.LinearSearch;

public class SearchTest {

	public static void main(String[] args) {
		
		LinearSearch search = new LinearSearch();

		int[] array = new int[10];
		//Criado para popular o vetor com valores aleatórios
		Random rand = new Random();
		//Populando o vetor
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(100);
		}

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		//Ordenando o vetor com Bubble Sort
		BubbleSort bubble = new BubbleSort();
		array = bubble.bubbleSort(array);
		//		System.out.println(search.linearsearch(array, 12));
		
		System.out.println();
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		//Utilizando Busca Binária para procurar o valor 12
		BinarySearch search2 = new  BinarySearch();
		System.out.println(search2.binarySearch(array, 12));
	}
}
