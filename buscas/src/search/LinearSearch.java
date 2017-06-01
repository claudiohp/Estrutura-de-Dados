package search;

/**
 * 
 * Busca Linear - Varre o vetor inteiro em busca da
 * chave informada.
 * 
 * @author anderson.menezes
 *
 */

public class LinearSearch {
	
	public boolean linearSearch(int[] array, int key){
		
		//Laço para varrer o vetor
		for(int i = 0; i < array.length; i++){
			if(array[i] == key){
				return true;
			} 
		}
		
		return false;
		
	}

}
