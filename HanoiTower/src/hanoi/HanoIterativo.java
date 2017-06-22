package hanoi;
import java.util.Stack;
import java.util.Scanner;

public class HanoIterativo {

	// pilha de comandos que substitui as chamadas recursivas
	private static Stack stack = new Stack();

	// armazena o número no movimento atual
	private static long numMov;

	// Método que realiza (imprime) o movimento
	// de um disco entre dois pinos
	private static void move(int source, int destination) {
		numMov++;
		System.out.println("[" + numMov + "]:" + source + " -> " + destination);
	}

	// método que implementa o algoritmo hanoi iterativo
	public static void hanoi(int n, int source, int destination, int auxiliar) {

		// monta e empilha o primeiro comando
		String comandoAtual = n + "," + source + "," + destination + "," + auxiliar;

		stack.push(comandoAtual);

		// o jogo chega ao fim quando a pilha de comandos estiver vazia!
		while (!stack.isEmpty()) {

			// quando n > 1, devemos empilhar um novo comando
			if (n > 1) {

				// monta o novo comando a ser empilhado
				n--;
				String[] vetAux = comandoAtual.split(",");
				source = Integer.parseInt(vetAux[1]);
				destination = Integer.parseInt(vetAux[2]);
				auxiliar = Integer.parseInt(vetAux[3]);

				// isto seria uma chamada recursiva...
				comandoAtual = n + "," + source + "," + auxiliar + "," + destination;

				// empilha o novo comando
				stack.push(comandoAtual);

				// caso contrário, devemos desempilhar 
				// e executar um movimento
			} else {
				
				//desempilha um comando
				comandoAtual = (String) stack.pop();

				// separa n, origem, destino e trabalho
				String[] vetAux = comandoAtual.split(",");
				n = Integer.parseInt(vetAux[0]);
				source = Integer.parseInt(vetAux[1]);
				destination = Integer.parseInt(vetAux[2]);
				auxiliar = Integer.parseInt(vetAux[3]);

				// executa movimento
				move(source, destination);

				// quando n > 1, é preciso empilhar 
				// um comando depois do movimento
				if (n > 1) {
					n--;
					// isto seria uma chamada recursiva...
					comandoAtual=n + "," + auxiliar + "," + destination + "," + source;
					stack.push(comandoAtual);
				}

			}

		}

	}

// método main para restar o programa!
	public static void main(String[] args) {

		// executa o algoritmo iterativo das Torres de Hanói
		HanoIterativo.hanoi(3,1,3,2);

	}

}