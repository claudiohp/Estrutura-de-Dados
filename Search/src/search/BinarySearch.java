package search;

public class BinarySearch {
	
	/**
	 * Declarando vari�rias para armazenar os �ndices
	 * inicial e final do intervalo a ser verificado.
	 * No in�cio considera-se toda a dimens�o do vetor.  
	 */
	
	public boolean binarySearch(int[] array, int key) {

		int first = 0;
		int last = array.length - 1;
		
		/**
		 * La�o respons�vel pelas itera��es no vetor. 
		 */
		
		while (first <= last) {
			//Armazenando o �ndice central do vetor
			int middle = (first + last) / 2;

			/**
			 * Verificando se o valor da posi��o central
			 * corresponde � chave de busca (seria nossa
			 * "condi��o de parada"). 
			 */
			if (array[middle] == key) {
				return true;
			}
			/**
			 * Caso n�o seja o elemento central, precisamos
			 * atualizar o intervalo que ser� considerado
			 * na pr�xima itera��o.
			 */
			if (key < array[middle]) {
				last = middle - 1;
				
			} else {
				first = middle + 1;
			}
		}
		return false;
	}

}
