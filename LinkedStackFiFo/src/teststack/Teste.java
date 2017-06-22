package teststack;

import java.util.NoSuchElementException;
import java.util.Random;

import stack.LinkedQueue;

public class Teste {

	public static void main(String[] args) {
		
		LinkedQueue queue = new LinkedQueue();
		
		queue.enqueue(50);
		queue.enqueue(15);
		queue.enqueue(30);
		
		System.out.println(queue.toString());
		System.out.println("Peek: " + queue.peek());
		System.out.println();
		System.out.println("Dequeue " + queue.dequeue());
		System.out.println();
		System.out.println("Dequeue " + queue.dequeue());
		System.out.println("Peek: " + queue.peek());
		
		
	}

}
