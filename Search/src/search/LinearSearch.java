package search;

public class LinearSearch {

	/**
	 * 
	 * Busca Linear - Varre o vetor inteiro em busca da
	 * chave informada.
	 *
	 */

	public boolean linearSearch(int[] array, int key) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == key) {
				return true;
			}
		}
		return false;
	}

}
