package search;

/**
 * 
 * Busca Binária - Utiliza a estratégia de dividir e conquistar,
 * manipulando porções do vetor ao invés da estrutura completa.
 * 
 * @author anderson.menezes
 *
 */

public class BinarySearch {
	
	public boolean binarySearch(int[] array, int key){
		
		/**
		 * Declarando variárias para armazenar os índices
		 * inicial e final do intervalo a ser verificado.
		 * No início considera-se toda a dimensão do vetor.  
		 */
		int first = 0;
		int last = array.length - 1;
		
		/**
		 * Laço responsável pelas iterações no vetor. 
		 */
		while(first <= last){
			
			//Armazenando o índice central do vetor
			int middle = (first + last) / 2;
			
			/**
			 * Verificando se o valor da posição central
			 * corresponde à chave de busca (seria nossa
			 * "condição de parada"). 
			 */
			if(array[middle] == key){
				return true;
			}
			
			/**
			 * Caso não seja o elemento central, precisamos
			 * atualizar o intervalo que será considerado
			 * na próxima iteração.
			 */
			if(key < array[middle]){
				last = middle - 1;
			} else {
				first = middle + 1;
			}
			
		}
		
		return false;                               
		
	}

}








