package hanoi;

public class IterativeHanoiTower {

	private int nMov;

	private void move(int source, int destination) {
		nMov++;
		System.out.println("[" + nMov + "]" + source + " -> " + destination);
	}

	public void hanoi(int n, int source, int destination, int auxiliar) {

		LinkedStack stack = new LinkedStack();
		
		while (n > 0) {

			n--;
			hanoi(n, source, auxiliar, destination);
			move(source, destination);
			stack.push(n);
		}
		
	}
	
}
