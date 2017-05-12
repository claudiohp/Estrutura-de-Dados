package sort;

public class BubbleSort {

	public int[] bubbleSort(int array[]) {

		int aux = 0;

		// Garante a repetição de acordo com o tamanho do vetor.
		for (int i = 0; i < array.length; i++) {

			// Manipula as trocas no vetor
			for (int d = 0; d < array.length - 1; d++) {
				if (array[d] > array[d + 1]) {
					aux = array[d];
					array[d] = array[d + 1];
					array[d + 1] = aux;
				}
			}
		}

		return array;
	}
}
