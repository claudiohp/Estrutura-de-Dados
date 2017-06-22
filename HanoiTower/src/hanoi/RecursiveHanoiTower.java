package hanoi;

public class RecursiveHanoiTower {
	
	
	private void move(int source, int destination){
		System.out.println(source + "->" + destination );
	}
	
	public void executeHanoi(int n,int source, int destination, int auxiliar){
		
		if(n > 0){
			executeHanoi(n - 1, source, auxiliar, destination);
			move(source, destination);
			executeHanoi(n - 1, auxiliar, destination, source);
			
		}
	}
}
