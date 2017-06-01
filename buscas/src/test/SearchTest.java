package test;

import java.util.Random;

import search.BinarySearch;
import search.LinearSearch;
import search.RecursiveBinarySearch;
import sort.BubbleSort;

public class SearchTest {

	public static void main(String[] args) {


		int[] array = new int[10];
		
		//Criado para popular o vetor com valores aleatórios
		Random rand = new Random();
		
		//Populando o vetor
		for(int i = 0; i < array.length; i++){
			array[i] = rand.nextInt(100);
		}
		
		//LinearSearch search = new LinearSearch();
		
		//Apenas print
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + " ");
		}
		
		System.out.println();
		
		//Ordenando o vetor com Bubble Sort
		BubbleSort sort = new BubbleSort();
		array = sort.bubbleSort(array);
		
		//System.out.println(search.linearSearch(array, 12));
		
		//Apenas print
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + " ");
		}
		
		System.out.println();
		
		//Utilizando Busca Binária para procurar o valor 12
		
		//BinarySearch search = new BinarySearch();
		//System.out.println(search.binarySearch(array, 12));
		RecursiveBinarySearch rSearch = new RecursiveBinarySearch();
		System.out.println(rSearch.recursiveBinarySearch(array, 12));
		
		
	}

}










